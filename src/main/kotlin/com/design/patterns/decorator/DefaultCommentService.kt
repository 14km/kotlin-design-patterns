package com.design.patterns.decorator

class DefaultCommentService : CommentInterface {

    override fun addComment(comment: String) {
        println(comment)
    }
}
