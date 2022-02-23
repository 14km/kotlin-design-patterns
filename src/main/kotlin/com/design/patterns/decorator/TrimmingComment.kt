package com.design.patterns.decorator

class TrimmingComment(commentInterface: CommentInterface) : Decorator(commentInterface) {

    override fun addComment(comment: String) {
        super.addComment(comment.trim())
    }
}
