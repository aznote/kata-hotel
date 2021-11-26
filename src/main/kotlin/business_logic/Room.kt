package business_logic

class Room(
    private val étage: String,
    private val numéroChambre: String,
    private val description: String,
    private val capacité: Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Room

        if (étage != other.étage) return false
        if (numéroChambre != other.numéroChambre) return false
        if (description != other.description) return false
        if (capacité != other.capacité) return false

        return true
    }

    override fun hashCode(): Int {
        var result = étage.hashCode()
        result = 31 * result + numéroChambre.hashCode()
        result = 31 * result + description.hashCode()
        result = 31 * result + capacité
        return result
    }
}

