class VideoAttachment(override val type: String = "video", val video: Video) : Attachments {
    class Video(
        val id: Int,
        val albumId: Int,
        val ownerId: Int,
        val userId: Int
    )
}