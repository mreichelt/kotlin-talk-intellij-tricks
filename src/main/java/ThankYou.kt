@file:Suppress("FunctionName")

val thankYou = """

.___________. __    __       ___      .__   __.  __  ___    ____    ____  ______    __    __   __  
|           ||  |  |  |     /   \     |  \ |  | |  |/  /    \   \  /   / /  __  \  |  |  |  | |  | 
`---|  |----`|  |__|  |    /  ^  \    |   \|  | |  '  /      \   \/   / |  |  |  | |  |  |  | |  | 
    |  |     |   __   |   /  /_\  \   |  . `  | |    <        \_    _/  |  |  |  | |  |  |  | |  | 
    |  |     |  |  |  |  /  _____  \  |  |\   | |  .  \         |  |    |  `--'  | |  `--'  | |__| 
    |__|     |__|  |__| /__/     \__\ |__| \__| |__|\__\        |__|     \______/   \______/  (__)

""".trimIndent()

fun main() {
    println(thankYou)
    `reach me on Twitter`("mreichelt")
    `watch previous recording on YouTube`("https://youtube.com/watch?v=p-6bBCBhCDA")
    `drink beer and have fun`()
    `check out the code on GitHub`()
    `find out more awesome IntelliJ tips and tricks`()
    `join the discussion in the intellij-tricks channel in Kotlin Slack`()
}

fun `watch previous recording on YouTube`(videoUrl: String) {
    println("watch previous recording on YouTube: $videoUrl")
}

fun `reach me on Twitter`(twitterHandle: String) {
    println("reach me on Twitter: $twitterHandle")
}

fun `drink beer and have fun`() {
    repeat(3) {
        println("🍻".repeat(8))
    }
}

fun `check out the code on GitHub`() {
    println("https://github.com/mreichelt/kotlin-talk-intellij-tricks")
}

fun `find out more awesome IntelliJ tips and tricks`() {
    println("https://github.com/mreichelt/stuff/blob/master/misc/intellij_tips.md")
}

fun `join the discussion in the intellij-tricks channel in Kotlin Slack`() {
    println("https://kotlinlang.slack.com/messages/CM6CU9RGV")
    // you'll need to register here if you haven't already: http://slack.kotlinlang.org/
}
