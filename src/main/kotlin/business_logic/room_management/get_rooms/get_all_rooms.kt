package business_logic.room_management.get_rooms

import business_logic.room_management.Room
import business_logic.room_management.RoomDatasource

class GetAllRooms (private val roomDatasource: RoomDatasource) {

    fun execute(): List<Room> {
        return roomDatasource.getAllRooms();
    }

}
