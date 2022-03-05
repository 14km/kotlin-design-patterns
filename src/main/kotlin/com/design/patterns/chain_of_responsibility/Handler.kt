package com.design.patterns.chain_of_responsibility

abstract class Handler(private val nextHandler: Handler?) {
    open fun handle(request: Request) {
        nextHandler?.handle(request)
    }
}
