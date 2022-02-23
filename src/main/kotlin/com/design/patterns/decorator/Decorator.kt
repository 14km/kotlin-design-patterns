package com.design.patterns.decorator

open class Decorator(
    private val commentInterface: CommentInterface
) : CommentInterface {

    override fun addComment(comment: String) {
        commentInterface.addComment(comment)
    }
}
