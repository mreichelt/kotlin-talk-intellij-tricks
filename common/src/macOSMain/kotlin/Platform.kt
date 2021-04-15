import platform.Foundation.NSProcessInfo

actual fun getPlatformString(): String {
    val processInfo = NSProcessInfo.processInfo
    return processInfo.operatingSystemName() + " " + processInfo.operatingSystemVersionString()
}