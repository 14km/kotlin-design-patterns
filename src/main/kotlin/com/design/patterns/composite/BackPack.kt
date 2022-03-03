package com.design.patterns.composite

class BackPack : Component {

    private val itemList = mutableListOf<Component>()

    fun addItem(component: Component) {
        itemList.add(component)
    }

    override fun getPrice(): Int {
        return itemList.sumOf { it.getPrice() }
    }

    override fun getName(): String {
        return "백팩내 현재 상품가격"
    }
}
