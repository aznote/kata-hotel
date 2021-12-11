package user_side

import business_logic.room_management.Room
import business_logic.room_management.get_rooms.GetAllRooms
import server_side.InMemoryHotelRooms


class InlineLayer : FormatLayer {
    override fun display(rooms: List<Room>) {
        rooms.forEach { println(it.numéroChambre) }
    }

    override fun isMyResponsibility(format: String): Boolean {
        return (format == "ln")
    }
}

interface FormatLayer {
    fun display(rooms: List<Room>)
    fun isMyResponsibility(format: String): Boolean
}

class PresentationLayer(private val layers : List<FormatLayer>) {
    fun display(rooms: List<Room>, format: String) {
        layers.forEach {
            if (it.isMyResponsibility(format)){
                it.display(rooms)
            }
        }
    }
}

fun main() {
    val databaseHotelRoomsAdapter = InMemoryHotelRooms() // couche Infra
    val getAllRooms = GetAllRooms(databaseHotelRoomsAdapter) // couche applicative
    val presentationLayer = PresentationLayer(listOf(InlineLayer(), JsonLayer())) // couche présentation

    val rooms = getAllRooms.execute() // Domaine
    presentationLayer.display(rooms, "ln")
}

class JsonLayer : FormatLayer {
    override fun display(rooms: List<Room>) {
        println("JSON")
    }
    override fun isMyResponsibility(format: String): Boolean {
        return (format == "json")
    }

}
