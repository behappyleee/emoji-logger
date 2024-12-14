import com.sun.org.slf4j.internal.LoggerFactory
import org.junit.jupiter.api.Test

internal class LoggerTest {

    @Test
    fun test() {
        val logger = LoggerFactory.getLogger(this::class.java)
        logger.debug("Test Class !!")
    }
}
