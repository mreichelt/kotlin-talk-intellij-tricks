@file:Suppress("EXPERIMENTAL_FEATURE_WARNING")


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


fun newLogin2(username: Username, password: Password) {
    println("${username.username} is logging in with inline classes")
}

inline class Username(val username: String)
inline class Password(val password: String)


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

/*
@Deprecated(
    "use credentials class instead",
    replaceWith = ReplaceWith("newLogin2(Username(username), Password(password))")
)
 */
