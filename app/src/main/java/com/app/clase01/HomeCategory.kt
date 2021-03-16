package com.app.clase01

class HomeCategory:Category {
    override fun calculatePriceWithTax(price: Double): Double {
        return price*1.50
    }
}