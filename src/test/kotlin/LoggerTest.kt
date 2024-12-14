import com.happy.enojilogger.logger.EmojiLoggerFactory
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory

internal class LoggerTest {

    @Test
    fun logFactoryTestCheck() {
        val logFactoryCheck = EmojiLoggerFactory(
            logger = LoggerFactory.getLogger(this.javaClass)
        )

        logFactoryCheck.trace("TRACE Message Test !!")
        logFactoryCheck.debug("DEBUG Message Test !!")
        logFactoryCheck.info("INFO Message Test !!")
        logFactoryCheck.warn("WARN Message Test !!")
        logFactoryCheck.error("ERROR Message Test !!")
    }
}
