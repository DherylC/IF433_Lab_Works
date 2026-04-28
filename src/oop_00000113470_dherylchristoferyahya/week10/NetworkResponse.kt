package oop_00000113470_dherylchristoferyahya.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)