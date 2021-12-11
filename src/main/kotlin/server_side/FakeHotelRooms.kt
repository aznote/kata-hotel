package server_side

import business_logic.room_management.HotelRooms
import business_logic.room_management.Room

class FakeHotelRooms : HotelRooms {
    private val fakeRooms: HashMap<Int, Room> = HashMap()
    private var id: Int = 1

    override fun getAllRooms(): List<Room> {
        val allRoomsList = mutableListOf<Room>()
        fakeRooms.forEach { (_, room) -> allRoomsList.add(room) }
        return allRoomsList
    }

    fun addRoom(room: Room) {
        fakeRooms[id] = room
        id++
    }
}