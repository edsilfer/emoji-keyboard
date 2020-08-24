package br.com.instachat.emojilibrary.util

import java.sql.Timestamp
import java.util.*

/**
 * Set of utilities for dealing with time
 */
object Time {


    /**
     * @return the current timestamp
     */
    @JvmStatic
    fun now(): Timestamp? = Timestamp(Date().time)

}