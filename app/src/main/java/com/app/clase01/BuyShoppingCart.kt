package com.app.clase01



sealed class Buy {
    companion object{
        fun shoppingCart(client: User, store: Store){
            //Se verifica si la transaccion es valida
            if(store.processTransaction(client.shoppingCart)){
                when(client.isEmployee()){
                    true -> {
                        client.shoppingCart.forEach{
                            it.price *= 0.8
                        }

                    }
                }
                client.addOrder()
                client.cleanShoppingCart()
                client.orders.last {
                    it.order.forEach {
                        println("${ it.printNameAndPrice()} precio despues de impuesto de $${it.category.calculatePriceWithTax(it.price)}")
                    }
                    val total = it.order.sumByDouble { it.category.calculatePriceWithTax(it.price) }
                    println("El total de la compra fue de $ ${total}")
                    true
                }
            }
        }
    }
}