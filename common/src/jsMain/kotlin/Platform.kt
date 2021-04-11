import kotlinx.browser.window

actual fun getPlatformName(): String {
    return window.navigator.userAgent
}
