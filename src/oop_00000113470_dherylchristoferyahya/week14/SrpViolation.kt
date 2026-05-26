package oop_00000113470_dherylchristoferyahya.week14

data class User(val name: String, val email: String, val age: Int)

class UserManager{
    fun validateUser(user: User): Boolean {
        return user.email.contains("@") && user.age >= 18
    }

    fun saveUserToDatabase(user: User) {
        println("INSERT INTO users VALUES ('${user.name}','${user.email}')")
    }

    fun sendWelcomeEmail(user: User) {
        println("sending email to: ${user.email}")
    }
}