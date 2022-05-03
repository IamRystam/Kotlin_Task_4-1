class Note(id:Int, val comments:MutableList<Comments> = mutableListOf()): Node(id) {
    override fun toString(): String {
        return "$id  $comments"
    }
}