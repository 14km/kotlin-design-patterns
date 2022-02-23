package com.design.patterns.decorator

class DecoratorClient(private val commentInterface: CommentInterface) {

    fun writeComment(comment: String) {
        commentInterface.addComment(comment)
    }
}
