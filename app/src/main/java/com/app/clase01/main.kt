package com.app.clase01


fun main(args: Array<String>) {
    val falabella = Store("Falabella")
    falabella.addProducts(productFactory(100))
    //Se crea un cliente
    val client = clientFactory()
    //Se le estan entregando productos que estan dentro de la tienda
    client.shoppingCart.addAll(falabella.getProducts().subList(10, 20))
    Buy.shoppingCart(client, falabella)
    //Se crea un empleado
    val employee = employeeFactory(falabella)
    employee.shoppingCart.addAll(falabella.getProducts().subList(10, 20))
    Buy.shoppingCart(employee, falabella)
    //Si se fijan el resultado es distinto ya que un empleado tiene descuento

    //Compra no validad
    client.shoppingCart.addAll(productFactory(10))
    Buy.shoppingCart(client, falabella)
}