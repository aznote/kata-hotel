import business_logic.Room
import business_logic.get_rooms.GetAllRooms
import org.junit.Test

internal class GetAllRoomsTest {
    private var getAllRooms: GetAllRooms = GetAllRooms()

    @Test
    fun getAllRooms() {
        //Given

        //When
        val obtainedRooms = getAllRooms.execute()

        //Then
        val expectedRoom =
            Room("1", "101", "1 king size bed - A/C - Wi-Fi - private bathroom - wheelchair accessible", 2)
        val expectedRooms = listOf(expectedRoom)

        assert(expectedRooms == obtainedRooms)
    }
}