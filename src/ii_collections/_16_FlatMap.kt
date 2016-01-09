package ii_collections

import ii_collections.data.orderedProducts

fun example() {

    val result = listOf("abc", "12").flatMap { it.toCharList() }

    result == listOf('a', 'b', 'c', '1', '2')
}

val Customer.orderedProducts: Set<Product> get() {
    return orders.flatMap { it.products }.toSet()
}

val Shop.allOrderedProducts: Set<Product> get() {
    return customers.flatMap { it.orderedProducts }.toSet()
}
