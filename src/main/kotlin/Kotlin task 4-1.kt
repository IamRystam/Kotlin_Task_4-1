fun main() {

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
         comments = Comments(postId = 12, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true),
         reposts = Reposts(count = 34, userReposted = true),
         likes = Likes(count = 56, userLikes = true, canLike = true, canPublish = true),
         geo = Geo(type = "121", coordinates = "", place = Place("")),
         copyHistory = null,
         views = Views(count = 121),
         attachments = (AudioAttachment(type = "audio", audio = AudioAttachment.Audio(12, 12, 12, 12)))
     )

     val post1 = Post(
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
         comments = Comments(postId = 12, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true),
         reposts = Reposts(count = 34, userReposted = true),
         likes = Likes(count = 56, userLikes = true, canLike = true, canPublish = true),
         geo = Geo(type = "121", coordinates = "", place = Place("")),
         copyHistory = null,
         views = Views(count = 121),
         attachments = (AudioAttachment(type = "audio", audio = AudioAttachment.Audio(12, 12, 12, 12)))
     )
     val post2 = Post(
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
         comments = Comments(postId = 12, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true),
         reposts = Reposts(count = 34, userReposted = true),
         likes = Likes(count = 56, userLikes = true, canLike = true, canPublish = true),
         geo = Geo(type = "121", coordinates = "", place = Place("")),
         copyHistory = null,
         views = Views(count = 121),
         attachments = (AudioAttachment(type = "audio", audio = AudioAttachment.Audio(12, 12, 12, 12)))
     )

     val comments1 = Comments(postId = 6, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true)


     val wallService = WallService()




     wallService.add(post)
     wallService.add(post1)
     wallService.add(post2)
     println(wallService.add(post))
     println(wallService.add(post1))
     println(wallService.add(post2))

     println(wallService.createComment(comments1))


     println(wallService.update(post1))

    val elements = mutableListOf<Note>()

    val comments4 = Comments(123, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true, delete = false)
    val comments2 = Comments(124, canPost = true, groupsCanPosts = true, canClose = true, canOpen = true, delete = false)
    val comments3 = Comments(123,canPost = true, groupsCanPosts = true, canClose = true, canOpen = true, delete = false)
    val note1 = Note(1)
    val note2 = Note(2)

    val service = NoteService()
    service.add(note1)
    service.add(note2)

    service.createComment(1, comments4)
    service.createComment(1, comments2)

    println(note1)
    service.deleteComment(1, comments4)
    println(note1)
    service.deleteComment(1, comments4)
    println(note1)
    println(service.getComments(1, comments4))

    service.restoreComment(1, comments4)
    println(note1)


    service.editComment(1, comments3)
    println(note1)
}