open class Comments(
    val postId: Long,
    val canPost: Boolean,
    val groupsCanPosts: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean

){

    override fun toString(): String {
        return super.toString()
    }
}