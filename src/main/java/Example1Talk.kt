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


val talk = Talk(
    "Kotlin's companion object: The power of IntelliJ IDEA",
    "https://github.com/mreichelt/kotlin-talk-intellij-tricks",
    Speaker(
        "Marc Reichelt", "mreichelt", listOf("Software Engineer", "Has a ♥ for Kotlin", "GDG Organizer"),
        Company("iteratec GmbH", "https://iteratec.de")
    )
)


fun main() {
    println(talk)
    // Add names to call arguments
    // Put arguments on separate lines
    // `main` live template (plus arguments!)
}
