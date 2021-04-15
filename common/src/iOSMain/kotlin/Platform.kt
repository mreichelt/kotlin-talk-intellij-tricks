import platform.UIKit.UIDevice

actual fun getPlatformString(): String {
    val currentDevice = UIDevice.currentDevice
    return currentDevice.name + " " + currentDevice.systemVersion
}