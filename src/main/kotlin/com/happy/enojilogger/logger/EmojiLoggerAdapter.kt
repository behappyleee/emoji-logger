package com.happy.enojilogger.logger

import org.slf4j.Logger

class EmojiLoggerAdapter(private val logger: Logger) : InterfaceLogger {
    override fun trace(
        vararg messages: String,
        throwable: Throwable?
    ) {}

    override fun debug() {}

    override fun info() {}

    override fun warn() {}

    override fun error() {}
}
