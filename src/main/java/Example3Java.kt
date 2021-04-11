val someJava = """

class DeepThought {
    public static int getTheAnswerToLifeTheUniverseAndEverything() {
        return 42;
    }
}

""".trimIndent()

const val someJson = """{"username": "username", "password": "password"}"""

fun main() {
    println(someJava)
    println(someJson)
    // inject language or reference
    // add new scratch file
    // scratch + JSON formatting

    // show regex example (and how to check regex!)
    val hexColorRegex = "^#?([a-f0-9]{6}|[a-f0-9]{3})$"
}
