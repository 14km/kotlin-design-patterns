package com.design.patterns.adepter

import io.kotest.core.spec.style.FunSpec

class ClientTest : FunSpec({

    test("Client 실행시 컴퓨터와 노트북이 어뎁터 패턴으로 실행된다.") {
        AdepterClient().runComputer()
    }
})
