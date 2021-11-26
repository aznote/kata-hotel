import business_logic.Room
import business_logic.get_rooms.GetAllRooms
import org.junit.Test
import kotlin.test.assertContentEquals

internal class GetAllRoomsTest {
    private var getAllRooms: GetAllRooms = GetAllRooms()

    @Test
    fun shouldGet() {
        //Given

        //When
        val obtainedRooms = getAllRooms.execute()

        //Then
        val expectedRoom =
            Room("1", "101", "1 king size bed - A/C - Wi-Fi - private bathroom - wheelchair accessible", 2)
        val expectedRooms = listOf(expectedRoom)

        assertContentEquals(obtainedRooms, expectedRooms)
    }
}