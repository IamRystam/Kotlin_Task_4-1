class NoteService : CrudService<Note>() {

    fun createComment(noteId: Int, comments: Comments) {
        getById(noteId)?.comments?.add(comments)

    }

    fun deleteComment(noteId: Int, comments: Comments): Boolean {
        if (comments.delete) throw CommentDeleteException("Комментарий уже был удален")
        else {
            getById(noteId)?.comments?.remove(comments)
            comments.delete = true

        }
        return comments.delete
    }

    fun editComment(noteId: Int, comments: Comments): Boolean {
        var x = true
        if (comments.delete) throw CommentDeleteException("Комментарий уже был удален")

        for ((index, node) in getById(noteId)?.comments?.withIndex()!!) {
            if (node.postId == comments.postId) {
                getById(noteId)?.comments?.set(index, comments)
                return true

            } else return false
        }
        return true
    }

    fun getComments(noteId: Int, comments: Comments): MutableList<Comments>? {
        return getById(noteId)?.comments

    }

    fun restoreComment(noteId: Int, comments: Comments):Boolean {
        if (comments.delete) {
            createComment(noteId, comments)
            comments.delete = false
        } else throw CommentDeleteException("Комментарий уже был удален")
        return comments.delete
    }


}
