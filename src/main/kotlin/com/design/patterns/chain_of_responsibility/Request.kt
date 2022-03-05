package com.design.patterns.chain_of_responsibility

class Request(
    private val body: String
) {

    fun getBody(): String {
        return body
    }
}
