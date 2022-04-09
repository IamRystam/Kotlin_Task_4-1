data class Post(

    val id: Long,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Int = 1,
    val postType: String,
    val signerId: String,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Int = 1,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val postponedId: Int,
    val comments: Comments,
    val reposts: Reposts,
    val likes: Likes,
    val copyright: Copyright,
    val views: Views,
    //val copyHistory:Array<Int>,
    val donut: Donut,
    val geo: Geo,
    val postSource: PostSource
) {


}
