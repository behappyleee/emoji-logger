package com.happy.enojilogger.logger

import org.slf4j.LoggerFactory
import type.EmojiPrintMode
import type.LevelEmojiLogger

class EmojiLoggerFactory(
    private val clazz: Class<*>,
    private val defaultEmoji: String = "🔔",
    private val emojiMode: EmojiPrintMode = EmojiPrintMode.LIGHT
) : InterfaceLogger {

    private val logger = LoggerFactory.getLogger(clazz)

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
            LevelEmojiLogger.TRACE -> logger.trace("$emojiPrefix $message", throwable)
            LevelEmojiLogger.DEBUG -> logger.debug("$emojiPrefix $message", throwable)
            LevelEmojiLogger.INFO -> logger.info("$emojiPrefix $message", throwable)
            LevelEmojiLogger.WARN -> logger.warn("$emojiPrefix $message", throwable)
            LevelEmojiLogger.ERROR -> logger.error("$emojiPrefix $message", throwable)
        }
    }
}
