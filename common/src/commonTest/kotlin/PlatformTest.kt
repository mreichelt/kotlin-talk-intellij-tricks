import kotlin.test.Test
import kotlin.test.assertTrue

class PlatformTest {

    @Test
    fun test() {
        val platformString = getPlatformString()
        println(platformString)
        assertTrue(platformString.isNotBlank())
    }

}
