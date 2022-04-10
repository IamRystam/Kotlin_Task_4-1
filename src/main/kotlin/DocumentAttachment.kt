class DocumentAttachment(override val type: String = "document", val document: Document) : Attachments {
    class Document(
        val id: Int,
        val albumId: Int,
        val ownerId: Int,
        val userId: Int
    )
}
