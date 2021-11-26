import business_logic.Room
import business_logic.get_rooms.GetAllRooms
import org.junit.Test
import kotlin.test.assertContentEquals

internal class GetAllRoomsTest {
    private var getAllRooms: GetAllRooms = GetAllRooms()

    @Test
    fun whenHotelHave1Room_thenShouldReturnTheListWithThisRoom() {
        //Given

        //When
        val obtainedRooms = getAllRooms.execute()

        //Then
        val expectedRoom =
            Room("1", "101", "1 king size bed - A/C - Wi-Fi - private bathroom - wheelchair accessible", 2)
        val expectedRooms = listOf(expectedRoom)

        assertContentEquals(obtainedRooms, expectedRooms)
    }

    @Test
    fun whenHotelHave2Rooms_thenShouldReturnTheListWithTheseRooms() {
        //When
        val obtainedRooms = getAllRooms.execute()

        //Then
        val expectedRoom1 =
            Room("1", "101", "1 king size bed - A/C - Wi-Fi - private bathroom - wheelchair accessible", 2)
        val expectedRoom2 =
            Room("1", "102", "1 king size bed - A/C - Wi-Fi - private bathroom - wheelchair accessible", 2)
        val expectedRooms = listOf(expectedRoom1, expectedRoom2)

        assertContentEquals(obtainedRooms, expectedRooms)
    }
}
