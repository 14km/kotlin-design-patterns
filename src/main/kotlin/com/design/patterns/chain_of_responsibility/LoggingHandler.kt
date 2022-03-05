package com.design.patterns.chain_of_responsibility

class LoggingHandler(nextHandler: Handler?) : Handler(nextHandler) {
    override fun handle(request: Request) {
        println("음식을 주문 Logging")
        super.handle(request)
    }
}
