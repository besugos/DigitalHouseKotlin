import kotlin.math.max

class Item (var numeroItem: Int,
            val descItem: String,
            var qtdComprada: Int,
            var precoUnitario: Double) {

    init {
        qtdComprada = max(0, qtdComprada)
        if (precoUnitario < 0.0) {
            precoUnitario = 0.0
        }
    }

}