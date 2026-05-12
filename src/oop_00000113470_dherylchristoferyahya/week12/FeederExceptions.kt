package oop_00000113470_dherylchristoferyahya.week12

sealed class FeederException(msg: String) : Exception(msg)

class FoodEmptyException(requested: Int, available: Int) : FeederException("Kibble tidak cukup! Diminta $requested gr, sisa $available gr")

class DispenserJamException : FeederException("Wadah dispenser tersangkut/macet!")