package com.design.patterns.adepter

class ComputerAdepter(
    private val computerModel: ComputerModel
) : Computer {
    override fun switchOn() {
        println(computerModel.model())
    }
}
