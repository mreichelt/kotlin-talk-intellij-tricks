val message = """
    
.___________. __    __       ___      .__   __.  __  ___    ____    ____  ______    __    __   __  
|           ||  |  |  |     /   \     |  \ |  | |  |/  /    \   \  /   / /  __  \  |  |  |  | |  | 
`---|  |----`|  |__|  |    /  ^  \    |   \|  | |  '  /      \   \/   / |  |  |  | |  |  |  | |  | 
    |  |     |   __   |   /  /_\  \   |  . `  | |    <        \_    _/  |  |  |  | |  |  |  | |  | 
    |  |     |  |  |  |  /  _____  \  |  |\   | |  .  \         |  |    |  `--'  | |  `--'  | |__| 
    |__|     |__|  |__| /__/     \__\ |__| \__| |__|\__\        |__|     \______/   \______/  (__) 
                                                                                                   
    
""".trimIndent()

fun main() {
    println(message)

    `drink beer and have fun`()
    `check out the code on GitHub`()
    `find out more IntelliJ awesomeness`()
}

fun `drink beer and have fun`() {
    println("🍻".repeat(10))
}

fun `check out the code on GitHub`() {
    println("https://github.com/mreichelt/kotlin-talk-intellij-tricks")
}

fun `find out more IntelliJ awesomeness`() {
    println("https://github.com/mreichelt/stuff/blob/master/misc/intellij_tips.md")
}
