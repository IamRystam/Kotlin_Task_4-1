import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test
    fun addIdNotNull() {
        val service = WallService()
        val id1: Long = 1

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
            postType = "5443",
            signerId = "23457",
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = 1,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 343,
            Comments(postId = 12, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true),
            Reposts(count = 34, userReposted = true),
            Likes(count = 56, userLikes = true, canLike = true, canPublish = true),
            views = Views(count = 121),
            geo = Geo(type = "121", coordinates = "", place = Place("")),
            copyHistory = null,
            attachments = (AudioAttachment(type = "audio", audio = AudioAttachment.Audio(12, 12, 12, 12)))

        )
        val result = service.add(post)

        assertEquals(id1, result.id)
    }

    @Test
    fun updateTrue() {

        val service = WallService()

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
                postType = "5443",
                signerId = "23457",
                canPin = true,
                canDelete = false,
                canEdit = false,
                isPinned = 1,
                markedAsAds = true,
                isFavorite = true,
                postponedId = 343,
                comments = Comments(
                    postId = 12,
                    canPost = true,
                    groupsCanPosts = true,
                    canClose = true,
                    canOpen = true
                ),
                reposts = Reposts(count = 34, userReposted = true),
                likes = Likes(count = 56, userLikes = true, canLike = true, canPublish = true),
                views = Views(count = 121),
                geo = Geo(type = "121", coordinates = "", place = Place("")),
                copyHistory = null,
                attachments = (AudioAttachment(type = "audio", audio = AudioAttachment.Audio(12, 12, 12, 12)))

            )
        )

        val update = Post(
            id = 1,
            ownerId = 12366,
            fromId = 3456,
            createdBy = 565656,
            date = 51222,
            text = "Любой текст",
            replyOwnerId = 1234,
            replyPostId = 89056,
            friendsOnly = 1,
            postType = "5443",
            signerId = "23457",
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = 1,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 343,
            Comments(postId = 12, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true),
            Reposts(count = 34, userReposted = true),
            Likes(count = 56, userLikes = true, canLike = true, canPublish = true),
            views = Views(count = 121),
            geo = Geo(type = "121", coordinates = "", place = Place("")),
            copyHistory = null,
            attachments = (AudioAttachment(type = "audio", audio = AudioAttachment.Audio(12, 12, 12, 12)))
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
                postType = "5443",
                signerId = "23457",
                canPin = true,
                canDelete = false,
                canEdit = false,
                isPinned = 1,
                markedAsAds = true,
                isFavorite = true,
                postponedId = 343,
                Comments(postId = 12, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true),
                Reposts(count = 34, userReposted = true),
                Likes(count = 56, userLikes = true, canLike = true, canPublish = true),
                views = Views(count = 121),
                geo = Geo(type = "121", coordinates = "", place = Place("")),
                copyHistory = null,
                attachments = (AudioAttachment(type = "audio", audio = AudioAttachment.Audio(12, 12, 12, 12)))
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
            postType = "5443",
            signerId = "23457",
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = 1,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 343,
            Comments(postId = 12, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true),
            Reposts(count = 34, userReposted = true),
            Likes(count = 56, userLikes = true, canLike = true, canPublish = true),
            views = Views(count = 121),
            geo = Geo(type = "121", coordinates = "", place = Place("")),
            copyHistory = null,
            attachments = (AudioAttachment(type = "audio", audio = AudioAttachment.Audio(12, 12, 12, 12)))
        )

        val result = service.update(update)

        assertFalse(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {


        val service = WallService()
        val commentNew = Comments(postId = 4, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true)
       /* val post = Post(
            id = 0,
            ownerId = 12366,
            fromId = 3456,
            createdBy = 565656,
            date = 51222,
            text = "Любой текст",
            replyOwnerId = 1234,
            replyPostId = 89056,
            friendsOnly = 1,
            postType = "5443",
            signerId = "23457",
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = 1,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 343,
            comments = Comments(
                postId = 7,
                canPost = true,
                groupsCanPosts = true,
                canClose = true,
                canOpen = true
            ),
            reposts = Reposts(count = 34, userReposted = true),
            likes = Likes(count = 56, userLikes = true, canLike = true, canPublish = true),
            geo = Geo(type = "121", coordinates = "", place = Place("")),
            copyHistory = null,
            views = Views(count = 121),
            attachments = (AudioAttachment(type = "audio", audio = AudioAttachment.Audio(12, 12, 12, 12)))
        )*/


        service.createComment(commentNew)
    }

    @Test
    fun shouldNotThrow() {

        val service = WallService()
        val commentNew = Comments(postId = 1, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true)
        val post = Post(
            id = 1,
            ownerId = 12366,
            fromId = 3456,
            createdBy = 565656,
            date = 51222,
            text = "Любой текст",
            replyOwnerId = 1234,
            replyPostId = 89056,
            friendsOnly = 1,
            postType = "5443",
            signerId = "23457",
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = 1,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 343,
            comments = Comments(
                postId = 5,
                canPost = true,
                groupsCanPosts = true,
                canClose = true,
                canOpen = true
            ),
            reposts = Reposts(count = 34, userReposted = true),
            likes = Likes(count = 56, userLikes = true, canLike = true, canPublish = true),
            geo = Geo(type = "121", coordinates = "", place = Place("")),
            copyHistory = null,
            views = Views(count = 121),
            attachments = (AudioAttachment(type = "audio", audio = AudioAttachment.Audio(12, 12, 12, 12)))
        )
        service.add(post)

        val result = service.createComment(commentNew)

        assertEquals(commentNew.postId, result.postId)

    }
}



