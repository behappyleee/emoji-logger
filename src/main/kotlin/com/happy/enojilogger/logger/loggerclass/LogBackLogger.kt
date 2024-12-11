package com.happy.enojilogger.logger.loggerclass

import org.slf4j.Logger

class LogBackLogger(
    private val logger: Logger,
): InterfaceLogger {
    override fun trace(vararg messages: String, throwable: Throwable?) {
        logger.trace(messages.joinToString(ARGUMENT_MESSAGE_DELIMITER), throwable)
    }

    override fun debug(vararg messages: String, throwable: Throwable?) {
        logger.debug(messages.joinToString(ARGUMENT_MESSAGE_DELIMITER), throwable)
    }

    override fun info(vararg messages: String, throwable: Throwable?) {
        logger.info(messages.joinToString(ARGUMENT_MESSAGE_DELIMITER), throwable)
    }

    override fun warn(vararg messages: String, throwable: Throwable?) {
        logger.warn(messages.joinToString(ARGUMENT_MESSAGE_DELIMITER), throwable)
    }

    override fun error(vararg messages: String, throwable: Throwable?) {
        logger.error(messages.joinToString(ARGUMENT_MESSAGE_DELIMITER), throwable)
    }

    companion object {
        private const val ARGUMENT_MESSAGE_DELIMITER = ","
    }
}