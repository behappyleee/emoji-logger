import com.happy.enojilogger.logger.EmojiLoggerFactory
import com.happy.enojilogger.type.EmojiPrintMode
import org.junit.jupiter.api.Test

class EmojiLoggerFactoryTest {

    private val emojiLogger = EmojiLoggerFactory(clazz = EmojiLoggerFactoryTest::class.java, emojiMode = EmojiPrintMode.ICON)

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
