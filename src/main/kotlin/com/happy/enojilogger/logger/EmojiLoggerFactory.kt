package com.happy.enojilogger.logger

import org.slf4j.Logger
import type.EmojiPrintMode
import type.LevelEmojiLogger

class EmojiLoggerFactory(
    private val logger: Logger,
    private val emojiMode: EmojiPrintMode = EmojiPrintMode.LIGHT
)  {
    fun trace(message: String) {
        logger.trace("${EmojiPrinter(emojiMode = emojiMode).getEmojiIconByLevel(level = LevelEmojiLogger.TRACE)} $message")
    }

    fun debug(message: String) {
        logger.debug("${EmojiPrinter(emojiMode = emojiMode).getEmojiIconByLevel(level = LevelEmojiLogger.DEBUG)} $message")
    }

    fun info(message: String) {
        logger.info("${EmojiPrinter(emojiMode = emojiMode).getEmojiIconByLevel(level = LevelEmojiLogger.INFO)} $message")
    }

    fun warn(message: String) {
        logger.warn("${EmojiPrinter(emojiMode = emojiMode).getEmojiIconByLevel(level = LevelEmojiLogger.WARN)} $message")
    }

    fun error(message: String) {
        logger.error("${EmojiPrinter(emojiMode = emojiMode).getEmojiIconByLevel(level = LevelEmojiLogger.ERROR)} $message")
    }
}
