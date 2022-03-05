package com.design.patterns.chain_of_responsibility

class Client(
    private val handler: Handler
) {
    fun run() {
        val request = Request("배가 고픔")
        handler.handle(request)
    }
}
