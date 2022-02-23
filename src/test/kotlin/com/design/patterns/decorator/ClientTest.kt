package com.design.patterns.decorator

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.types.shouldBeSameInstanceAs

class ClientTest : FunSpec({

    var enableSpamFilter: Boolean
    var enableTrimming: Boolean

    test("스팸 필터링이 존재하는 String 이라면 Http") {
        val comment = "스팸)안녕하세요! 저는 Connor 입니다!"

        println(comment)

        //  기본 Default 구현체가 존재함.
        var decoratorService: CommentInterface = DefaultCommentService()

        enableSpamFilter = true
        if (enableSpamFilter) {
            decoratorService = SpamFilteringComment(decoratorService)
        }

        val result = DecoratorClient(decoratorService).writeComment(comment)

        result shouldBeSameInstanceAs Unit
    }

    test("client 호출시 데코레이터가 정상적으로 실행된다.") {
        val decoratorClient: DecoratorClient
    }

})
