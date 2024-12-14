package com.happy.enojilogger.logger

import com.happy.enojilogger.type.EmojiPrintMode
import com.happy.enojilogger.type.LevelEmojiLogger

class EmojiPrinter(
    private val emojiMode: EmojiPrintMode
) {
    fun getEmojiIconByLevel(level: LevelEmojiLogger): String =
        when (emojiMode) {
            EmojiPrintMode.LIGHT -> getEmojiLightIcon(level = level)
            EmojiPrintMode.ICON -> getEmojiIcon(level = level)
        }

    private fun getEmojiLightIcon(level: LevelEmojiLogger): String =
        when (level) {
            LevelEmojiLogger.TRACE -> "\uD83D\uDFE3"
            LevelEmojiLogger.DEBUG -> "\uD83D\uDD35"
            LevelEmojiLogger.INFO -> "\uD83D\uDFE1"
            LevelEmojiLogger.WARN -> "\uD83D\uDFE0"
            LevelEmojiLogger.ERROR -> "\uD83D\uDD34"
        }

    private fun getEmojiIcon(level: LevelEmojiLogger): String =
        when (level) {
            LevelEmojiLogger.TRACE -> "🔍"
            LevelEmojiLogger.DEBUG -> "🐛"
            LevelEmojiLogger.INFO -> "ℹ️"
            LevelEmojiLogger.WARN -> "⚠️"
            LevelEmojiLogger.ERROR -> "❌"
        }
}
