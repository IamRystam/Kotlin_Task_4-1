class MarketAttachment(override val type: String = "market", val market: Market) : Attachments {
    class Market(
        val id: Int,
        val albumId: Int,
        val ownerId: Int,
        val userId: Int
    )
}