package oop_00000113470_dherylchristoferyahya.week08

class City(val name: String)
class Address (val city: City?)
class DeliveryDetails(val Address: Address?)
class Order (val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)