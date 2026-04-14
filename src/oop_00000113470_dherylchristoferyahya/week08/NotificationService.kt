package oop_00000113470_dherylchristoferyahya.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Sending email to $emailAddress")
    }

    fun processUser(user: UserProfile){
        if(user.email != null){
            sendEmail(user.email)
        } else {
            println("user ${user.name} gada email")
        }
    }
}
