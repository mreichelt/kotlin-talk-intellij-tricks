import kotlin.test.Test
import kotlin.test.assertTrue

class PlatformTest {

    @Test
    fun test() {
        val platformString = getPlatformName()
        println(platformString)
        assertTrue(platformString.isNotBlank())
    }

}
