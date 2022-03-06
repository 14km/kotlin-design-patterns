package com.design.patterns.chain_of_responsibility

import io.kotest.core.spec.style.FunSpec

class ChainOfResponsibilityClientTest : FunSpec({

    test("책임 연쇄 패턴이 실행된다.") {
        val handler: Handler = PrintHandler(LoggingHandler(DeliveryHandler(null)))
        val client = Client(handler)
        client.run()
    }

    test("책임 연쇄 패턴 try catch") {
        try {
            val request = Request("배가 고픔")

            PrintHandler(null).handle(request)

            LoggingHandler(null).handle(request)

            DeliveryHandler(null).handle(request)
        } catch (exception: IllegalArgumentException) {
            // SomeCode
            exception.message

        } catch (exception: IllegalStateException) {
            // SomeCode
            exception.message

        } catch (exception: RuntimeException) {
            // SomeCode
            exception.message
        }
    }

})
