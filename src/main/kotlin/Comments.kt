data class Comments(
    val postId: Long,
    val canPost: Boolean,
    val groupsCanPosts: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean,
    var delete:Boolean = false

)




