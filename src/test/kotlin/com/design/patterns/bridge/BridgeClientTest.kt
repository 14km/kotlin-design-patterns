package com.design.patterns.bridge

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class BridgeClientTest : FunSpec({

    val client = BridgeClient()

    test("Bridge 패턴을 실행한다.") {
        client.run()
    }

})
