class PhotoAttachment(override val type: String = "photo", val photo: Photo) : Attachments {
    class Photo(
        val id: Int,
        val albumId: Int,
        val ownerId: Int,
        val userId: Int
    )

}