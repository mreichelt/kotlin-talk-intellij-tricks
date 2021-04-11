fun main() {
    val something = listOf("a", "c", "b", "d")
//        .map { it.toUpperCase() }
//        .map { it.toLowerCase() }
        .sortedDescending()
        .sorted()
        .map { "letter: $it" }
    println(something)

    // convert to sequence
    // IntelliJ automatically suggests that
    // set breakpoint in line 2, start debugging
    // Trace Current Stream Chain
    // Profit!
}
