package com.design.patterns.chain_of_responsibility

class PrintHandler(nextHandler: Handler?) : Handler(nextHandler) {

    override fun handle(request: Request) {
        println(request.getBody())
        super.handle(request)
    }
}
