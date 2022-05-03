import org.junit.Assert.*
import org.junit.Test

class NoteServiceTest {

    @Test
    fun createComment() {
        val service = NoteService()
        val noteID = 1
        val comments =
            Comments(123, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true, delete = false)

        val result = service.createComment(noteId = noteID, comments = comments)

        assertNotNull(result)
    }

    @Test
    fun deleteCommentTrue() {
        val service = NoteService()
        val note = Note(1)
        service.add(note)
        val comments =
            Comments(123, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true, delete = false)
        service.createComment(noteId = note.id, comments = comments)

        val result = service.deleteComment(noteId = note.id, comments = comments)

        assertTrue(result)

    }

    @Test(expected = CommentDeleteException::class)
    fun deleteCommentException() {
        val service = NoteService()
        val note = Note(2)
        service.add(note)
        val comments =
            Comments(123, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true, delete = true)
        service.createComment(noteId = note.id, comments = comments)

        service.deleteComment(noteId = note.id, comments = comments)


    }

    @Test
    fun editCommentTrue() {
        val service = NoteService()
        val note = Note(2)

        service.add(note)

        val comments =
            Comments(
                postId = 123,
                canPost = true,
                groupsCanPosts = true,
                canClose = true,
                canOpen = true,
                delete = false
            )
        val commentsUpdate =
            Comments(
                postId = 123,
                canPost = false,
                groupsCanPosts = true,
                canClose = true,
                canOpen = true,
                delete = false
            )
        service.createComment(noteId = note.id, comments = comments)

        val result = service.editComment(noteId = note.id, commentsUpdate)

        assertTrue(result)
    }

    @Test
    fun editCommentFalse() {
        val service = NoteService()
        val note = Note(2)

        service.add(note)

        val comments =
            Comments(
                postId = 123,
                canPost = true,
                groupsCanPosts = true,
                canClose = true,
                canOpen = true,
                delete = false
            )
        val commentsUpdate =
            Comments(
                postId = 124,
                canPost = false,
                groupsCanPosts = true,
                canClose = true,
                canOpen = true,
                delete = false
            )
        service.createComment(noteId = note.id, comments = comments)


        val result = service.editComment(noteId = note.id, commentsUpdate)

        assertFalse(result)


    }

    @Test
    fun restoreCommentTrue() {
        val service = NoteService()
        val note = Note(2)
        service.add(note)
        val comments =
            Comments(123, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true, delete = true)
        service.createComment(noteId = note.id, comments = comments)

        val result = service.restoreComment(noteId = note.id, comments = comments)

        assertFalse(result)
    }

    @Test(expected = CommentDeleteException::class)
    fun restoreCommentException() {
        val service = NoteService()
        val note = Note(2)
        service.add(note)
        val comments =
            Comments(123, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true, delete = false)
        service.createComment(noteId = note.id, comments = comments)

        service.restoreComment(noteId = note.id, comments = comments)


    }
}