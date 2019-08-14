fun main() {
    val something = listOf("a", "c", "b", "d")
        .asSequence()
        .map { it.toUpperCase() }
        .map { it.toLowerCase() }
        .sortedDescending()
        .sorted()
        .map { "letter: $it" }
        .toList()
    println(something)

    // set breakpoint in line 2, start debugging
    // Trace Current Stream Chain
    // Profit!
}
