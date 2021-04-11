import platform.Foundation.NSProcessInfo

actual fun getPlatformName(): String {
    val processInfo = NSProcessInfo.processInfo
    return processInfo.operatingSystemName() + " " + processInfo.operatingSystemVersionString()
}
