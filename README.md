# Android Emoji Keyboard
A library to provide an emoji-keyboard implementation for Android applications

# <a name="showcase"></a>Showcase
<p align="center">
<img src="showcase/telegram.gif" align="center">
<img src="showcase/whatsapp.gif" align="center" hspace="50">
</p>

#Quicky Setup
A code worths more than... well, nevermind.

```
dependencies {
    compile 'br.com.instachat:emoji-library:0.0.1'
}
```

```xml
<br.com.instachat.emojilibrary.model.layout.EmojiKeyboardLayout
    android:layout_width="match_parent"
    android:layout_height="263dip"/>
```

```xml
<br.com.instachat.emojilibrary.model.layout.EmojiEditText
    android:id="@+id/input"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="Message"
    android:singleLine="true"
    android:textColor="@color/rsc_bottom_panel_accent"
    android:textSize="18dip"
    android:theme="@style/TelegramEditText"
    app:emojiSize="25dip"/>
```

```java
// Activity must descent from EmojiCompatActivity
prepareKeyboard(EmojiCompatActivity activity, EmojiEditText input)
// CODE
```

# <a name="third-part-libraries"></a>Third Part Libraries & Special Thanks
* [Rockerhieu / emojicon](#REF1): _Do you like emojis in Whatsapp, iMessage? Emojicon is a library to implement such a thing for Android_;
* [DrKLO / Telegram](#REF2): _Telegram is a messaging app with a focus on speed and security. It’s superfast, simple and free. This repo contains the official source code for Telegram App for Android;_
* [ogaclejapan/ SmartTabLayout](#REF3): _A custom ViewPager title strip which gives continuous feedback to the user when scrolling;_
* [lopspower / CircularImageView](#REF4): _This is an Android project allowing to realize a circular ImageView in the simplest way possible;_
* [square / picasso](#REF5): _A powerful image downloading and caching library for Android;_

# <a name="team-members"></a>Team Members
* "Fernandes S. Edgar" <fernandes.s.edgar@gmail.com>
* "Leonardo Assunção" <leo.assuncao92@gmail.com>

# <a name="references"></a>References
* <a name="REF1"></a>[REF1] - https://github.com/rockerhieu/emojicon
* <a name="REF2"></a>[REF2] - https://github.com/DrKLO/Telegram
* <a name="REF3"></a>[REF3] - https://github.com/ogaclejapan/SmartTabLayout
* <a name="REF4"></a>[REF4] - https://github.com/lopspower/CircularImageView
* <a name="REF5"></a>[REF5] - https://github.com/square/picasso
