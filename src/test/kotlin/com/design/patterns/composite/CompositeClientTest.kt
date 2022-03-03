package com.design.patterns.composite

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CompositeClientTest : FunSpec({

    test("BackPack에 대한 내용 검증") {
        val compositeClient = CompositeClient()
        compositeClient.run()
    }

})
