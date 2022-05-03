open class CrudService<T : Node> {

    private val elements = mutableListOf<T>()
    var nextId = 1

    fun add(elem: T): T {
        elem.id = nextId++
        elements.add(elem)
        return elements.last()
    }

    fun delete(elem: T): Boolean {
        for (node in elements) {
            if (node.id == elem.id)
                elements.remove(elem)
            return true
        }
        return false
    }

    fun update(elem: T): Boolean {
        for ((index, node) in elements.withIndex()) {
            if (node.id == elem.id)
                elements[index] = elem
            return true
        }
        return false
    }

    fun getById(id: Int): T? {
        return elements.find { it.id == id }
    }

    fun get(elements: T): T {
        return elements
    }
}

open class Node(var id: Int)