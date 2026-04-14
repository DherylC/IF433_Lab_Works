package oop_00000113470_dherylchristoferyahya.week08

object DatabaseMock {
    fun findUser(id: Int): UserProfile? {
        return if (id==1) UserProfile("TestUser", "tezt@test.com") else null
    }
}

fun runMockUnitTest(){
    println("=== RUNNING UNIT TEST ===")
    val testUser = DatabaseMock.findUser(1)
    val initial = testUser!!.name.substring(0, 1)
    check(initial == "T"){"Test Failed, initial is wrong"}
    println("Test Passed, initial T")
}