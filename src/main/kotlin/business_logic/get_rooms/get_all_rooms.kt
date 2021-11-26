package business_logic.get_rooms

import business_logic.Room

class GetAllRooms {

    fun execute(): List<Room> {
        val room = Room("1", "101", "1 king size bed - A/C - Wi-Fi - private bathroom - wheelchair accessible", 2)
        val otherRoom = Room("1", "102", "1 king size bed - A/C - Wi-Fi - private bathroom - wheelchair accessible", 2)
        return listOf(room,otherRoom)
    }

}
