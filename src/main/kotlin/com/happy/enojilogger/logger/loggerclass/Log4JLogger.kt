package com.happy.enojilogger.logger.loggerclass

class Log4JLogger (
    private val logger: org.apache.logging.log4j.Logger
): InterfaceLogger {
    override fun trace(vararg messages: String, throwable: Throwable?) {
        logger.trace(messages, throwable)
    }

    override fun debug(vararg messages: String, throwable: Throwable?) {
        logger.debug(messages, throwable)
    }

    override fun info(vararg messages: String, throwable: Throwable?) {
        logger.info(messages, throwable)
    }

    override fun warn(vararg messages: String, throwable: Throwable?) {
        logger.warn(messages, throwable)
    }

    override fun error(vararg messages: String, throwable: Throwable?) {
        logger.error(messages, throwable)
    }
}