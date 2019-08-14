fun oldDeprecatedLogin(password: String, username: String) {
    println("$username is logging in using old login")
}

fun newLogin(credentials: Credentials) {
    println("${credentials.username} is logging in")
}

data class Credentials(
    val username: String,
    val password: String
)

fun main() {
    val name = "fun main"
    println(name.subSequence(start = 0, end = 3))

    oldDeprecatedLogin("password", "username")

    // show auto-fix on subSequence
    // add @Deprecated
    // show deprecation level: ERROR
    // show replaceWith
}


/*
@Deprecated(
    "use credentials class instead",
    replaceWith = ReplaceWith("newLogin(Credentials(username, password))")
)
 */
