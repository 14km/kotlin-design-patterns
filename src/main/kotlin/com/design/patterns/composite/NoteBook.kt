package com.design.patterns.composite

class NoteBook(
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
