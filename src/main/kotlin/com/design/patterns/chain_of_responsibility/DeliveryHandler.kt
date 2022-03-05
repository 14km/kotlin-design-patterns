package com.design.patterns.chain_of_responsibility

class DeliveryHandler(nextHandler: Handler?) : Handler(nextHandler) {
    override fun handle(request: Request) {
        println("음식을 배달요청 함.")
        super.handle(request)
    }
}
