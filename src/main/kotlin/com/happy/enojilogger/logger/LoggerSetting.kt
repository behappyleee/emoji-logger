package com.happy.enojilogger.logger

import com.happy.enojilogger.logger.loggerclass.InterfaceLogger
import com.happy.enojilogger.logger.loggerclass.Log4JLogger
import com.happy.enojilogger.logger.loggerclass.LogBackLogger
import org.apache.logging.log4j.LogManager
import org.slf4j.LoggerFactory
import type.LoggerModeType

object LoggerSetting {

    lateinit var loggerMode: LoggerModeType
        private set

    private lateinit var initialLoggerTypeTest: InterfaceLogger

    fun initLoggerMode(loggerMode: LoggerModeType) {
        this.loggerMode = loggerMode
    }

    fun ofLoggerClass(clazz: Class<*>): InterfaceLogger =
        when(loggerMode) {
            LoggerModeType.LOG4J -> Log4JLogger(logger = LogManager.getLogger(clazz))
            LoggerModeType.LOGBACK -> LogBackLogger(logger = LoggerFactory.getLogger(clazz))
        }
}

