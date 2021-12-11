package server_side

import business_logic.room_management.HotelRooms
import business_logic.room_management.Room

val roomInMemoryDatabase: HashMap<Int, Room> = hashMapOf(
    1 to Room("1", "101", "1 king size bed - A/C - Wi-Fi - private bathroom - wheelchair accessible", 2),
    2 to Room("1", "102", "2 queen size beds - A/C - Wi-Fi - private bathroom - wheelchair accessible", 4),
    3 to Room("1", "103", "3 single beds - A/C - Wi-Fi - private bathroom - wheelchair accessible", 3),
    4 to Room("2", "201", "1 king size bed - A/C - Wi-Fi - private bathroom", 2),
    5 to Room("2", "202", "1 queen size bed - Wi-Fi - private bathroom  ", 2),
    6 to Room("2", "203", "1 king size bed + 3 single beds - A/C - Wi-Fi - private bathroom", 5),
    7 to Room("2", "204", "1 single bed - Wi-Fi - shared bathroom", 1),
    8 to Room("2", "205", "2 single beds - A/C - Wi-Fi - shared bathroom", 2),
    9 to Room("3", "301", "1 queen size bed - A/C - private bathroom   ", 2),
    10 to Room("3", "302", "2 single beds - A/C - private bathroom ", 2)
)

class InMemoryHotelRooms : HotelRooms {
    override fun getAllRooms(): List<Room> {
        val allRoomsList = mutableListOf<Room>()
        roomInMemoryDatabase.forEach { (_, room) -> allRoomsList.add(room) }
        return allRoomsList
    }

}