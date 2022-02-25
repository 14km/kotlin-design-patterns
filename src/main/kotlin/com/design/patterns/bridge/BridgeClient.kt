package com.design.patterns.bridge

class BridgeClient {
    fun run() {
        val assassin: Champion = Assassin(Demonic())
        assassin.move()
        assassin.skillA()
        assassin.skillB()

        val hunter: Champion = Hunter(Scout())
        hunter.move()
        hunter.skillA()
        hunter.skillB()

        println("END")
    }
}
