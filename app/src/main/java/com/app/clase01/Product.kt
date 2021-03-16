package com.app.clase01

data class Product(var price: Double, val name: String, var category: Category){


    fun printNameAndPrice() {
        println("${name} $ ${price}")
    }
}