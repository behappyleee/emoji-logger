package com.happy.enojilogger.logger

import com.happy.enojilogger.logger.logger.InterfaceLogger
import type.EmojiPrintMode
import type.LevelEmojiLogger

class EmojiLoggerFactory(
    private val clazz: Class<*>,
    private val emojiMode: EmojiPrintMode = EmojiPrintMode.LIGHT
) : InterfaceLogger {

    private val logger = LoggerSetting.ofLoggerClass(clazz = clazz)

    override fun trace(vararg messages: String, throwable: Throwable?) {
        logWithEmoji(LevelEmojiLogger.TRACE, *messages, throwable = throwable)
    }

    override fun debug(vararg messages: String, throwable: Throwable?) {
        logWithEmoji(LevelEmojiLogger.DEBUG, *messages, throwable = throwable)
    }

    override fun info(vararg messages: String, throwable: Throwable?) {
        logWithEmoji(LevelEmojiLogger.INFO, *messages, throwable = throwable)
    }

    override fun warn(vararg messages: String, throwable: Throwable?) {
        logWithEmoji(LevelEmojiLogger.WARN, *messages, throwable = throwable)
    }

    override fun error(vararg messages: String, throwable: Throwable?) {
        logWithEmoji(LevelEmojiLogger.ERROR, *messages, throwable = throwable)
    }

    private fun logWithEmoji(
        level: LevelEmojiLogger,
        vararg messages: String,
        throwable: Throwable? = null
    ) {
        val emojiPrefix = EmojiPrinter(emojiMode = emojiMode).getEmojiIconByLevel(level = level)
        val message = messages.joinToString(" ")
        when (level) {
            LevelEmojiLogger.TRACE -> logger.trace(messages = arrayOf("$emojiPrefix $message"), throwable = throwable)
            LevelEmojiLogger.DEBUG -> logger.debug(messages = arrayOf("$emojiPrefix $message"), throwable = throwable)
            LevelEmojiLogger.INFO -> logger.info(messages = arrayOf("$emojiPrefix $message"), throwable = throwable)
            LevelEmojiLogger.WARN -> logger.warn(messages = arrayOf("$emojiPrefix $message"), throwable = throwable)
            LevelEmojiLogger.ERROR -> logger.error(messages = arrayOf("$emojiPrefix $message"), throwable = throwable)
        }
    }
}
