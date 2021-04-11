data class Talk(
    val title: String,
    val source: String,
    val speaker: Speaker
)

data class Speaker(
    val name: String,
    val twitter: String,
    val roles: List<String>,
    val company: Company
)

data class Company(
    val name: String,
    val url: String
)

class Rocket {
    var speed = 0
}

val talk = Talk(
    "Kotlin's companion: The power of IntelliJ IDEA",
    "https://github.com/mreichelt/kotlin-talk-intellij-tricks",
    Speaker(
        "Marc Reichelt", "mreichelt", listOf("Software Architect", "Kotlin Trainer"),
        Company("iteratec", "https://iteratec.com")
    )
)


fun main() {
    println(talk)
    // Add names to call arguments
    // Put arguments on separate lines
    // `main` live template (plus arguments!)
    // Cmd + J to look up all live templates
    // Add getters and setters to speed of rocket
}
