package com.app.clase01

class Employee(fullName: String, var storeId: Int) : User {
    override var shoppingCart: MutableList<Product> = mutableListOf()
    override var name: String = ""
    override var orders: Array<Order> = arrayOf()
    override var lastName: String = ""
    override var password: String
        get() = "ITooHardToHack"
        set(value) {}

    override fun cleanShoppingCart() {
        shoppingCart.clear()
    }

    var mail: String

    override fun isEmployee(): Boolean {
        return true
    }


    init {
        this.name = fullName.substringBefore(" ")
        this.lastName = fullName.substringAfter(" ")
        this.mail = "$name@mail.com"
    }
}
