data class Vector(
    val x: Double,
    val y: Double,
    val z: Double
)

fun main() {
    val a = Vector(1.0, 2.0, 3.0)
    val b = Vector(1.0, 2.0, 3.0)

    // Use destructuring declaration
    // --> specify all types explicitly

    // then: let IntelliJ add operators for you
//    val c = a + b
//    println(c)

    // show / hide variable types (now: inlay hints)
    // add type explicitly
    val something = listOf(a, b).map { it.x }.sum()
    println(something)

    // convert to expression body
    // remove explicit return type on methods
}

//private operator fun Vector.plus(other: Vector) =
//    Vector(x + other.x, y + other.y, z + other.z)
