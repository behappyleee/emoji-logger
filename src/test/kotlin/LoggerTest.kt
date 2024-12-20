import com.happy.enojilogger.logger.EmojiLoggerFactory
import org.junit.jupiter.api.Test

internal class LoggerTest {

    @Test
    fun logFactoryTestCheck() {
        val logFactory = EmojiLoggerFactory(clazz = LoggerTest::class.java,)

        logFactory.trace("TRACE Message Test !!")
        logFactory.debug("DEBUG Message Test !!")
        logFactory.info("INFO Message Test !!")
        logFactory.warn("WARN Message Test !!")
        logFactory.error("ERROR Message Test !!")
    }
}
