package server_side

import business_logic.room_management.Room
import business_logic.room_management.RoomDatasource

class FakeRoomRepository : RoomDatasource{
    val fakeRooms: HashMap<String, Room> = HashMap();
    init {
        fakeRooms["1"] = Room("1", "101", "1 king size bed - A/C - Wi-Fi - private bathroom - wheelchair accessible", 2)
        fakeRooms["2"] = Room("1", "102", "2 queen size beds - A/C - Wi-Fi - private bathroom - wheelchair accessible", 4)
        fakeRooms["3"] = Room("2", "201", "1 king size bed - A/C - Wi-Fi - private bathroom", 2)
    }
    override fun getAllRooms(): List<Room> {
        var allRoomsList = listOf<Room>();
        fakeRooms.forEach{(id, room) -> allRoomsList += room};
        return allRoomsList;
    }
}