package com.app.clase01

class Client(override var name: String, override var lastName: String,
             override var password: String, override var orders: Array<Order> = arrayOf()
) : User {
    override var shoppingCart: MutableList<Product> = mutableListOf()


    override fun cleanShoppingCart() {
        shoppingCart.clear()
    }

}