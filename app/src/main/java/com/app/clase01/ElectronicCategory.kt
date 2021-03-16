package com.app.clase01

class ElectronicCategory:Category {
    override fun calculatePriceWithTax(price: Double): Double {
        return price*1.19
    }
}