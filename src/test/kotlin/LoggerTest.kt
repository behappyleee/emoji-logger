import com.happy.enojilogger.logger.EmojiLoggerFactory
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory

internal class LoggerTest {

    @Test
    fun logFactoryTestCheck() {
        val logFactoryTest = EmojiLoggerFactory(
            logger = LoggerFactory.getLogger(this.javaClass),
        )

        logFactoryTest.trace("TRACE Message Test !!")
        logFactoryTest.debug("DEBUG Message Test !!")
        logFactoryTest.info("INFO Message Test !!")
        logFactoryTest.warn("WARN Message Test !!")
        logFactoryTest.error("ERROR Message Test !!")
    }
}
