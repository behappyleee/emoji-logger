package com.happy.enojilogger.logger.logger

import org.slf4j.Logger

class LogBackLogger(
    private val logger: Logger,
): InterfaceLogger {
    override fun trace(vararg messages: String, throwable: Throwable?) {
        logger.trace(messages.joinToString(InterfaceLogger.ARGUMENT_MESSAGE_DELIMITER), throwable)
    }

    override fun debug(vararg messages: String, throwable: Throwable?) {
        logger.debug(messages.joinToString(InterfaceLogger.ARGUMENT_MESSAGE_DELIMITER), throwable)
    }

    override fun info(vararg messages: String, throwable: Throwable?) {
        logger.info(messages.joinToString(InterfaceLogger.ARGUMENT_MESSAGE_DELIMITER), throwable)
    }

    override fun warn(vararg messages: String, throwable: Throwable?) {
        logger.warn(messages.joinToString(InterfaceLogger.ARGUMENT_MESSAGE_DELIMITER), throwable)
    }

    override fun error(vararg messages: String, throwable: Throwable?) {
        logger.error(messages.joinToString(InterfaceLogger.ARGUMENT_MESSAGE_DELIMITER), throwable)
    }
}