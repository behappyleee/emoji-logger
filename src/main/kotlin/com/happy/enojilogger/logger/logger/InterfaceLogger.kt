package com.happy.enojilogger.logger.logger

interface InterfaceLogger {

    fun trace(
        vararg messages: String,
        throwable: Throwable? = null
    )

    fun debug(
        vararg messages: String,
        throwable: Throwable? = null
    )

    fun info(
        vararg messages: String,
        throwable: Throwable? = null
    )

    fun warn(
        vararg messages: String,
        throwable: Throwable? = null
    )

    fun error(
        vararg messages: String,
        throwable: Throwable? = null
    )

    companion object {
        const val ARGUMENT_MESSAGE_DELIMITER = ","
    }
}