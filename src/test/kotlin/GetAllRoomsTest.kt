import business_logic.room_management.Room
import business_logic.room_management.get_rooms.GetAllRooms
import org.junit.Test
import server_side.FakeHotelRooms
import kotlin.test.assertContentEquals

internal class GetAllRoomsTest {

    @Test
    fun whenHotelHasNoRoom_thenShouldReturnAnEmptyList() {
        //Given
        var getAllRooms = GetAllRooms(FakeHotelRooms())

        //When
        val obtainedRooms = getAllRooms.execute()

        //Then
        assertContentEquals(obtainedRooms, listOf())
    }

    @Test
    fun whenHotelHasTwoRooms_thenShouldReturnAListWithTwoRooms() {
        //Given
        val fakeHotelRooms = FakeHotelRooms()
        val roomOne = Room("1", "101", "1 king size bed - A/C - Wi-Fi - private bathroom - wheelchair accessible", 2)
        val roomTwo = Room("1", "102", "2 queen size beds - A/C - Wi-Fi - private bathroom - wheelchair accessible", 4)
        fakeHotelRooms.addRoom(roomOne)
        fakeHotelRooms.addRoom(roomTwo)
        var getAllRooms = GetAllRooms(fakeHotelRooms)


        //When
        val obtainedRooms = getAllRooms.execute()

        //Then
        val expectedRooms = listOf(roomOne, roomTwo)

        assertContentEquals(obtainedRooms, expectedRooms)
    }
}
