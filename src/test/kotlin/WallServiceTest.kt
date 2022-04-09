import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {


    private var posts = emptyArray<Post>()


    @Test
    fun addIdNotNull() {
        val service = WallService()
        val id1: Long = 100
        val
        val post = Post(
            id = 0,
            ownerId = 12366,
            fromId = 3456,
            createdBy = 565656,
            date = 51222,
            text = "Любой текст",
            replyOwnerId = 1234,
            replyPostId = 89056,
            friendsOnly = 1,
            copyright = "890",
            postType = "5443",
            signerId = "23457",
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = 1,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 343,
            Comments(count = 12, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true),
            Reposts(count = 34, userReposted = true),
            Likes(count = 56, userLikes = true, canLike = true, canPublish = true)
        )
        val result = service.add(post)

        assertEquals(id1, result.id)
    }

    @Test
    fun updateTrue() {

        val service = WallService()
val placeholder1:Placeholder
        service.add(
            Post(
                id = 0,
                ownerId = 12366,
                fromId = 3456,
                createdBy = 565656,
                date = 51222,
                text = "Любой текст",
                replyOwnerId = 1234,
                replyPostId = 89056,
                friendsOnly = 1,
                copyright = "890",
                postType = "5443",
                signerId = "23457",
                canPin = true,
                canDelete = false,
                canEdit = false,
                isPinned = 1,
                markedAsAds = true,
                isFavorite = true,
                postponedId = 343,
                comments = Comments(count = 12, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true),
               reposts =  Reposts(count = 34, userReposted = true),
               likes =  Likes(count = 56, userLikes = true, canLike = true, canPublish = true),
                               donut =  Donut(isDonut = true, placeholder = placeholder1  ,)
            )
        )

        val update = Post(
            id = 100,
            ownerId = 12366,
            fromId = 3456,
            createdBy = 565656,
            date = 51222,
            text = "Любой текст",
            replyOwnerId = 1234,
            replyPostId = 89056,
            friendsOnly = 1,
            copyright = "890",
            postType = "5443",
            signerId = "23457",
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = 1,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 343,
            Comments(count = 12, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true),
            Reposts(count = 34, userReposted = true),
            Likes(count = 56, userLikes = true, canLike = true, canPublish = true)
        )

        val result = service.update(update)

        assertTrue(result)
    }

    @Test
    fun updateFalse() {

        val service = WallService()

        service.add(
            Post(
                id = 1,
                ownerId = 12366,
                fromId = 3456,
                createdBy = 565656,
                date = 51222,
                text = "Любой текст",
                replyOwnerId = 1234,
                replyPostId = 89056,
                friendsOnly = 1,
                copyright = "890",
                postType = "5443",
                signerId = "23457",
                canPin = true,
                canDelete = false,
                canEdit = false,
                isPinned = 1,
                markedAsAds = true,
                isFavorite = true,
                postponedId = 343,
                Comments(count = 12, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true),
                Reposts(count = 34, userReposted = true),
                Likes(count = 56, userLikes = true, canLike = true, canPublish = true)
            )
        )

        val update = Post(
            id = 100,
            ownerId = 12366,
            fromId = 3456,
            createdBy = 565656,
            date = 51222,
            text = "Любой текст",
            replyOwnerId = 1234,
            replyPostId = 89056,
            friendsOnly = 1,
            copyright = "890",
            postType = "5443",
            signerId = "23457",
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = 1,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 343,
            Comments(count = 12, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true),
            Reposts(count = 34, userReposted = true),
            Likes(count = 56, userLikes = true, canLike = true, canPublish = true)
        )

        val result = service.update(update)

        assertFalse(result)
    }

}



