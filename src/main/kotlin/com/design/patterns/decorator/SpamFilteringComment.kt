package com.design.patterns.decorator

class SpamFilteringComment(commentInterface: CommentInterface) : Decorator(commentInterface) {

    override fun addComment(comment: String) {
        if (isNotSpam(comment)) {
            super.addComment(comment)
        }
    }

    private fun isNotSpam(comment: String): Boolean {
        return !comment.contains("스팸")
    }
}
