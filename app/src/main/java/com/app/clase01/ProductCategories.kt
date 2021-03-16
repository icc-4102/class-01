package com.app.clase01

enum class ProductCategories: Category{
    Electronic {
        override fun calculatePriceWithTax(price: Double): Double {
            return price * 1.19
        }
    },
    Home{
        override fun calculatePriceWithTax(price: Double): Double {
            return price*1.15
        }

    },
    Kitchen{
        override fun calculatePriceWithTax(price: Double): Double {
            return price * 1.34
        }
    },
    Appliance{
        override fun calculatePriceWithTax(price: Double): Double {
            return price * 1.45
        }
    }
}

