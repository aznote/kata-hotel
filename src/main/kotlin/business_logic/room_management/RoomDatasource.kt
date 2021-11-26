package business_logic.room_management

interface RoomDatasource {
    fun getAllRooms(): List<Room>;
}