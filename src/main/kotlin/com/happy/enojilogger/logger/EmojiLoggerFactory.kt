package com.happy.enojilogger.logger

import com.happy.enojilogger.type.EmojiPrintMode
import com.happy.enojilogger.type.LevelEmojiLogger
import org.slf4j.LoggerFactory

class EmojiLoggerFactory<T>(
    private val clazz: Class<T>,
    private val emojiMode: EmojiPrintMode = EmojiPrintMode.LIGHT
) {
    private val logger = LoggerFactory.getLogger(clazz)

    fun trace(message: String) {
        logger.trace("${EmojiPrinter(emojiMode).getEmojiIconByLevel(LevelEmojiLogger.TRACE)} $message")
    }

    fun debug(message: String) {
        logger.debug("${EmojiPrinter(emojiMode).getEmojiIconByLevel(LevelEmojiLogger.DEBUG)} $message")
    }

    fun info(message: String) {
        logger.info("${EmojiPrinter(emojiMode).getEmojiIconByLevel(LevelEmojiLogger.INFO)} $message")
    }

    fun warn(message: String) {
        logger.warn("${EmojiPrinter(emojiMode).getEmojiIconByLevel(LevelEmojiLogger.WARN)} $message")
    }

    fun error(message: String) {
        logger.error("${EmojiPrinter(emojiMode).getEmojiIconByLevel(LevelEmojiLogger.ERROR)} $message")
    }
}
