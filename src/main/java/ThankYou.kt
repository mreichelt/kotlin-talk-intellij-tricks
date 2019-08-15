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
    `drink beer and have fun`()
    `check out the code on GitHub`()
    `find out more awesome IntelliJ tips and tricks`()
    `join the discussion in the intellij-tricks channel in Kotlin Slack`()
}


fun `drink beer and have fun`() {
    repeat(24) {
        println("🍻".repeat(42))
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
