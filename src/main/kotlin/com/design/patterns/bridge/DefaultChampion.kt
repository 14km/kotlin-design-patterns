package com.design.patterns.bridge

open class DefaultChampion(
    private val name: String,
    private val avatar: String
) : Champion {

    override fun move() {
        println("$avatar $name move")
    }

    override fun skillA() {
        println("$avatar $name Skill A")
    }

    override fun skillB() {
        println("$avatar $name Skill B")
    }
}
