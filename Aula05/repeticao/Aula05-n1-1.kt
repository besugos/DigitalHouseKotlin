import kotlin.math.max

fun main() {
    var maior = Int.MIN_VALUE
    for (i in 1..5) {
        print("Digite um número: ")
        var numero = readLine()!!.toInt()
        maior = max(maior,numero)
    }

    println("O maior numero digitado foi $maior")
}