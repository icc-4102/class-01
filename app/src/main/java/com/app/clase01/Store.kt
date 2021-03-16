package com.app.clase01

class Store (val name: String){
    val storeName: String
    val id: Int
    private var products: MutableList<Product> = mutableListOf()

    init {
        storeName = "Tienda ${name}"
        id = nextId++
    }

    fun getProducts(): List<Product> {
        return products
    }

    fun addProducts(productsList: List<Product>){
        products.addAll(productsList)
    }

    fun processTransaction(shoppingCart: List<Product>): Boolean {
        shoppingCart.forEach {
            it.printNameAndPrice()
        }
        println("El total es de ${shoppingCart.sumByDouble { it.price }}")
        if(products.containsAll(shoppingCart)){
            println("La compra fue valida")
            return true
        } else {
            println("La compra es invalida")
            return false
        }
    }

    companion object {
        var nextId = 1
    }
}