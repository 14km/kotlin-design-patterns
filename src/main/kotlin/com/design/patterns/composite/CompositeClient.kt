package com.design.patterns.composite

class CompositeClient {

    fun run() {
        val noteBook = NoteBook(price = 1_000_000, "삼성 노트북")
        val computer = Computer(price = 1_500_000, "엘지 컴퓨터")

        val backPack = BackPack()
        backPack.addItem(noteBook)
        backPack.addItem(computer)

        printBackPack(noteBook)
        printBackPack(computer)
        printBackPack(backPack)
    }

    private fun printBackPack(component: Component) {
        // 합계 금액 출력
        println(component.getName() + " " + component.getPrice())
    }
}
