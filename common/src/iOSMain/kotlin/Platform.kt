import platform.UIKit.UIDevice

actual fun getPlatformName(): String {
    val currentDevice = UIDevice.currentDevice
    return currentDevice.name + " " + currentDevice.systemVersion
}
