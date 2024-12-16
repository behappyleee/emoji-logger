import com.happy.enojilogger.logger.EmojiLoggerFactory
import com.happy.enojilogger.type.EmojiPrintMode
import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class EmojiLoggerFactoryTest {

    private val logger: Logger = LoggerFactory.getLogger(EmojiLoggerFactoryTest::class.java)
    private val emojiLogger = EmojiLoggerFactory(logger, EmojiPrintMode.LIGHT)

    @Test
    fun `should log trace messages with emoji`() {
        val testMessage = "This is a trace message"
        emojiLogger.trace(testMessage)
    }

    @Test
    fun `should log debug messages with emoji`() {
        val testMessage = "This is a debug message"
        emojiLogger.debug(testMessage)
    }

    @Test
    fun `should log info messages with emoji`() {
        val testMessage = "This is an info message"
        emojiLogger.info(testMessage)
    }

    @Test
    fun `should log warn messages with emoji`() {
        val testMessage = "This is a warn message"
        emojiLogger.warn(testMessage)
    }

    @Test
    fun `should log error messages with emoji`() {
        val testMessage = "This is an error message"
        emojiLogger.error(testMessage)
    }
}