import business_logic.room_management.Room
import business_logic.room_management.get_rooms.GetAllRooms
import org.junit.Test
import server_side.FakeRoomRepository
import kotlin.test.assertContentEquals

internal class GetAllRoomsTest {
    private var getAllRooms: GetAllRooms = GetAllRooms(FakeRoomRepository())

    @Test
    fun whenHotelHave1Room_thenShouldReturnTheListWithThisRoom() {
        //Given

        //When
        val obtainedRooms = getAllRooms.execute()

        //Then
        val expectedRoom =
            Room("1", "101", "1 king size bed - A/C - Wi-Fi - private bathroom - wheelchair accessible", 2)
        val expectedRoom2 = Room("1", "102", "2 queen size beds - A/C - Wi-Fi - private bathroom - wheelchair accessible", 4)
        val expectedRoom3 = Room("2", "201", "1 king size bed - A/C - Wi-Fi - private bathroom", 2)
        val expectedRooms = listOf(expectedRoom, expectedRoom2, expectedRoom3)

        assertContentEquals(obtainedRooms, expectedRooms)
    }
}
