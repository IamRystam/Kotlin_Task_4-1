class WallService {
    private var posts = emptyArray<Post>()
    private var commentsArray = emptyArray<Comments>()

    fun createComment(comments: Comments): Comments {


            for (post in posts) {
                if (post.id == comments.postId) {
                    commentsArray += comments
                    return comments
                } //else {
                    //throw PostNotFoundException("Ты ошибся так бывает(((")
                }

//return comments
throw PostNotFoundException("")
        }

        fun add(post: Post): Post {

            val postId = post.copy(
                id = if (posts.isEmpty()) 1
                else posts.last().id + 1
            )
            posts += postId
            return posts.last()

        }

        fun update(post: Post): Boolean {

            for ((index, postNew) in posts.withIndex()) {
                return if (postNew.id == post.id) {
                    posts[index] = postNew.copy(
                        ownerId = post.ownerId,
                        date = post.date
                    )
                    true
                } else false
            }
            return true
        }
    }




