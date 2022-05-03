import org.junit.Assert.*
import org.junit.Test

class CrudServiceTest {

    @Test
    fun add() {
        val noteNew = Note(id = 1)
        val service = CrudService<Note>()
        val elementsNew = mutableListOf(noteNew)

        val result = service.add(noteNew)

        assertEquals(elementsNew[0], result)
    }

    @Test
    fun deleteFalse() {
        val noteNew = Note(id = 1)
        val service = CrudService<Note>()

        val result = service.delete(noteNew)

        assertFalse(result)
    }

    @Test
    fun deleteTrue() {
        val noteNew = Note(id = 1)
        val service = CrudService<Note>()
        service.add(noteNew)

        val result = service.delete(noteNew)

        assertTrue(result)
    }

    @Test
    fun updateTrue() {
        val noteNew = Note(id = 1)
        val noteOld = Note(id = 1)
        val service = CrudService<Note>()
        service.add(noteNew)

        val result = service.update(noteOld)

        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        val noteOld = Note(id = 2)
        val service = CrudService<Note>()

        val result = service.update(noteOld)

        assertFalse(result)
    }

    @Test
    fun getById() {
        val noteNew = Note(id = 2)
        val noteOld = Note(id = 1)
        val service = CrudService<Note>()
        service.add(noteNew)
        service.add(noteOld)

        val result = service.getById(id = noteOld.id)

        assertEquals(noteOld, result)


    }


}