class AudioAttachment(override val type: String = "audio", val audio: Audio) : Attachments {
    class Audio(
        val id: Int,
        val albumId: Int,
        val ownerId: Int,
        val userId: Int
    )
}