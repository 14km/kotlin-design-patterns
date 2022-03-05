package com.design.patterns.chain_of_responsibility

import io.kotest.core.spec.style.FunSpec

class ClientTest : FunSpec({

    test("책임 연쇄 패턴이 실행된다.") {
        val handler: Handler = PrintHandler(LoggingHandler(DeliveryHandler(null)))
        val client = Client(handler)
        client.run()
    }

})
