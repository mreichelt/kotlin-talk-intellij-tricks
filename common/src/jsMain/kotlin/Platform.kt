import kotlinx.browser.window

actual fun getPlatformString(): String {
    return window.navigator.userAgent
}