package business_logic.room_management.get_rooms

import business_logic.room_management.Room
import business_logic.room_management.HotelRooms

class GetAllRooms (private val hotelRooms: HotelRooms) {

    fun execute(): List<Room> {
        return hotelRooms.getAllRooms();
    }

}
