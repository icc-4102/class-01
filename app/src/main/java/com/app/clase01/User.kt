package com.app.clase01

interface User {
    var shoppingCart: MutableList<Product>
    var name: String
    var orders: Array<Order>
    var lastName: String
    var password: String
    fun addOrder(){
        ///Esto esta no sirve ya que entregaria el shopping cart por referencia, entonces en el momento de que lo borras no lo guarda
//        orders = orders.plus(shoppingCart)

        orders = orders.clone().plusElement(Order(mutableListOf<Product>().apply { addAll(shoppingCart)} ))
    }
    fun cleanShoppingCart()
    fun isEmployee(): Boolean {
        return false
    }
}