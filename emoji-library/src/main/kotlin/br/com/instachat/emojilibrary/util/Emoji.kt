package br.com.instachat.emojilibrary.util

import android.content.Context
import android.text.Spannable
import android.util.SparseIntArray
import br.com.instachat.emojilibrary.model.*
import br.com.instachat.emojilibrary.model.Objects
import br.com.instachat.emojilibrary.util.extension.*
import br.com.instachat.emojilibrary.view.EmojiSpan
import java.util.*

object Emoji {

    private val emojiMap = SparseIntArray(1029)
    private val emojiModifiedMap: MutableMap<String, Int?> = HashMap()

    init {
        People.bindEmojis(emojiMap)
        Nature.bindEmojis(emojiMap)
        Objects.bindEmojis(emojiMap)
        Places.bindEmojis(emojiMap)
        Symbols.bindEmojis(emojiMap)
        People.bindSoftBankEmojis(SoftBank.EMOJI_MAP)
        Nature.bindSoftBankEmojis(SoftBank.EMOJI_MAP)
        Objects.bindSoftBankEmojis(SoftBank.EMOJI_MAP)
        Places.bindSoftBankEmojis(SoftBank.EMOJI_MAP)
        Symbols.bindSoftBankEmojis(SoftBank.EMOJI_MAP)
    }

    @JvmStatic
    fun add(config: AddEmojiConfiguration) {
        if (config.useSystemDefault) {
            return
        }

        config.text.removeSpans(config.text.length)
        var column = config.index

        while (column < config.textLength) {
            column = processColumn(column, config)
        }
    }

    private fun processColumn(column: Int, addEmojiConfiguration: AddEmojiConfiguration): Int {
        val char = addEmojiConfiguration.text[column]
        var icon = char.asSoftBankEmojiResource()
        var offset = if (icon == 0) 0 else 1

        if (icon == 0) {
            val pair = parseCharacter(column, icon, addEmojiConfiguration)
            icon = pair.first
            offset = pair.second
        }

        if (icon > 0) {
            val span = EmojiSpan(addEmojiConfiguration.context, icon, addEmojiConfiguration.emojiSize, addEmojiConfiguration.emojiAlignment, addEmojiConfiguration.textSize)
            addEmojiConfiguration.text.setSpan(span, column, column + offset, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }

        return column + offset
    }

    private fun parseCharacter(column: Int, icon: Int, addEmojiConfiguration: AddEmojiConfiguration): Pair<Int, Int> {
        val unicode = addEmojiConfiguration.text.nextUnicode(column)
        val parsedIcon = if (unicode > 0xff) emojiMap[unicode] else icon
        val offset = unicode.charCount()

        if (column + offset < addEmojiConfiguration.textLength) {
            return when (val nextUnicode = addEmojiConfiguration.text.nextUnicode(column + offset)) {
                Constants.COLOR_MODE_EMOJI -> handleColorMode(nextUnicode, column, offset, unicode, parsedIcon, addEmojiConfiguration)
                Constants.KEY_CAP_EMOJI -> handleKeyCap(nextUnicode, unicode, parsedIcon, offset)
                else -> handleEmojiModifiers(nextUnicode, unicode, parsedIcon, offset, addEmojiConfiguration)
            }
        }

        return Pair(parsedIcon, offset)
    }

    private fun handleEmojiModifiers(nextUnicode: Int, unicode: Int, icon: Int, offset: Int, addEmojiConfiguration: AddEmojiConfiguration): Pair<Int, Int> {
        val resourceName = "emoji_${unicode.toHexString()}_${nextUnicode.toHexString()}"
        val resourceId = getResourceId(resourceName, addEmojiConfiguration.context)
        return if (resourceId == 0) Pair(icon, offset) else Pair(resourceId, offset + nextUnicode.charCount())
    }

    private fun getResourceId(resourceName: String, ctx: Context): Int {
        if (emojiModifiedMap.containsKey(resourceName)) return emojiModifiedMap[resourceName]!!
        val resourceId = ctx.resources.getIdentifier(resourceName, "drawable", ctx.applicationContext.packageName)
        if (resourceId != 0) emojiModifiedMap[resourceName] = resourceId
        return resourceId
    }

    /*
     Some older versions of iOS don't use a combining character, instead it just goes straight to the second part
     */
    private fun handleKeyCap(followingUnicode: Int, unicode: Int, icon: Int, offset: Int): Pair<Int, Int> {
        val tempIcon = Constants.keyCapEmojiFrom(unicode)
        return if (tempIcon == 0) Pair(icon, offset) else Pair(tempIcon, offset + followingUnicode.charCount())
    }

    private fun handleColorMode(followingUnicode: Int, column: Int, offset: Int, unicode: Int, icon: Int, addEmojiConfiguration: AddEmojiConfiguration): Pair<Int, Int> {
        if (column + offset + followingUnicode.charCount() >= addEmojiConfiguration.textLength) {
            return Pair(icon, offset)
        }

        val nextUnicode = addEmojiConfiguration.text.nextUnicode(column + offset + followingUnicode.charCount())

        if (nextUnicode == Constants.KEY_CAP_EMOJI) {
            val tempIcon = Constants.keyCapEmojiFrom(unicode)
            return if (tempIcon == 0) Pair(icon, offset) else Pair(tempIcon, offset + followingUnicode.charCount() + nextUnicode.charCount())
        }

        return Pair(icon, offset)
    }
}