package com.design.patterns.adepter

class AdepterClient {
    fun runComputer() {
        val desktop = ComputerAdepter(Desktop())
        desktop.switchOn()

        val notebook = ComputerAdepter(Notebook())
        notebook.switchOn()
    }
}
