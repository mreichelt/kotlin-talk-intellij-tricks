fun createUser(username: String): UserCreationResult {
    // TODO: actually implement this at one point in the future
    return UserCreationResult.UserCreated
}

enum class UserCreationResult {
    UserCreated,
    UserAlreadyExists,
    DatabaseDidNotFeelLikeIt,
    OtherError
}

fun getHttpStatusCode(userCreationResult: UserCreationResult): Int {
    when (userCreationResult) {
        UserCreationResult.UserCreated -> return 200
        UserCreationResult.UserAlreadyExists -> return 409
        UserCreationResult.DatabaseDidNotFeelLikeIt -> return 503
        UserCreationResult.OtherError -> return 500
    }
}

fun main() {
    val username = "bob"
    val result = createUser(username)
    val httpStatusCode = getHttpStatusCode(result)
    println("Result when trying to create user " + username + " was " + result + ", status code " + httpStatusCode)

    // convert string concatenation to template
    // convert enum class to sealed class
    // import members of UserCreationResult
    // lift return out of when
    // add database ID to UserCreated
}
