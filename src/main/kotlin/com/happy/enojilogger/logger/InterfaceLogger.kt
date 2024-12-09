package com.happy.enojilogger.logger

interface InterfaceLogger {

    // trace - debug - info - warn - error

    fun trace(
        vararg message: String,
        throwable: Throwable? = null
    )

    fun debug()

    fun info()

    fun warn()

    fun error()
}
