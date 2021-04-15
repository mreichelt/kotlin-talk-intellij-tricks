actual fun getPlatformString(): String {
    return System.getProperty("os.name") + " " + System.getProperty("os.version")
}

fun main() {
    println(getPlatformString())
}
