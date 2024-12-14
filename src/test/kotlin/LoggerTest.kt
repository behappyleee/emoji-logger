import com.happy.enojilogger.logger.EmojiLoggerFactory
import com.happy.enojilogger.logger.LoggerSetting
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.core.config.Configurator
import org.junit.jupiter.api.Test
import type.EmojiPrintMode
import type.LoggerModeType

internal class LoggerTest {

    @Test
    fun logbackLightPrintTest() {
        LoggerSetting.initLoggerMode(loggerMode = LoggerModeType.LOGBACK)
        val logFactory = EmojiLoggerFactory(clazz = LoggerTest::class.java)

        logFactory.debug("Logback LogPrint Trace Test !")
        logFactory.debug("Logback LogPrint Debug Test !")
        logFactory.info("Logback LogPrint Info Test !")
        logFactory.warn("Logback LogPrint Warn Test !")
        logFactory.error("Logback LogPrint Error Test !")
    }

    @Test
    fun log4jLightPrintTest() {
        // TODO - 전체 로거의 최소 레벨 설정 - Logger Level 설정 부분도 파라미터로 받아야 할 것 같음
        Configurator.setRootLevel(Level.TRACE)

        LoggerSetting.initLoggerMode(loggerMode = LoggerModeType.LOG4J)
        val logFactory = EmojiLoggerFactory(clazz = LoggerTest::class.java)

        logFactory.trace("Log4J LogPrint Trace Test !", "ㄴㅇㄴㅇㄴㅇ")
        logFactory.debug("Log4J LogPrint Debug Test !")
        logFactory.info("Log4J LogPrint Info Test !")
        logFactory.warn("Log4JLogPrint Warn Test !")
        logFactory.error("Log4J LogPrint Error Test !")
    }


    @Test
    fun logbackIconPrintTest() {
        LoggerSetting.initLoggerMode(loggerMode = LoggerModeType.LOGBACK)
        val logFactory = EmojiLoggerFactory(clazz = LoggerTest::class.java, emojiMode = EmojiPrintMode.ICON)

        logFactory.debug("Logback LogPrint Trace Test !")
        logFactory.debug("Logback LogPrint Debug Test !")
        logFactory.info("Logback LogPrint Info Test !")
        logFactory.warn("Logback LogPrint Warn Test !")
        logFactory.error("Logback LogPrint Error Test !")
    }

    @Test
    fun log4jIconPrintTest() {
        // TODO - 전체 로거의 최소 레벨 설정 - Logger Level 설정 부분도 파라미터로 받아야 할 것 같음
        Configurator.setRootLevel(Level.TRACE)

        LoggerSetting.initLoggerMode(loggerMode = LoggerModeType.LOG4J)
        val logFactory = EmojiLoggerFactory(clazz = LoggerTest::class.java, emojiMode = EmojiPrintMode.ICON)

        logFactory.trace("Log4J LogPrint Trace Test !", "ㄴㅇㄴㅇㄴㅇ")
        logFactory.debug("Log4J LogPrint Debug Test !")
        logFactory.info("Log4J LogPrint Info Test !")
        logFactory.warn("Log4JLogPrint Warn Test !")
        logFactory.error("Log4J LogPrint Error Test !")
    }

}
