actual fun getPlatformName(): String {
    return System.getProperty("os.name") + " " + System.getProperty("os.version")
}

fun main() {
    println(getPlatformName())
}
