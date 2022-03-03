package com.design.patterns.composite

class Computer(
    private val price: Int,
    private val name: String,
) : Component {

    override fun getPrice(): Int {
        return price
    }

    override fun getName(): String {
        return name
    }
}
