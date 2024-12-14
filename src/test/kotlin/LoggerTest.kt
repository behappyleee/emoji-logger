import com.happy.enojilogger.logger.EmojiLoggerFactory
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory

internal class LoggerTest {

    @Test
    fun logFactoryTestCheck() {
        val logFactory = EmojiLoggerFactory(
            logger = LoggerFactory.getLogger(this.javaClass)
        )

        logFactory.trace("TRACE Message Test !!")
        logFactory.debug("DEBUG Message Test !!")
        logFactory.info("INFO Message Test !!")
        logFactory.warn("WARN Message Test !!")
        logFactory.error("ERROR Message Test !!")
    }
}
