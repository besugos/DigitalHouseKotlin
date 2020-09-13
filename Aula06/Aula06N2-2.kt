import kotlin.math.floor

fun main() {
    val valorNota = arrayOf(100.0,50.0,10.0,5.0,1.0)
    print("Qual o valor do saque? ")
    var valor = readLine()!!.toInt()
    if (valor !in 10..600) {
        println("Valor inválido")
    }
    else {
        for (i in valorNota) {
            if (valor >= i) {
                var qtdNota = floor(valor/i)!!.toInt()
                println("$qtdNota notas de R$ ${"%.2f".format(i)}")
                valor -= (qtdNota * i)!!.toInt()
            }
        }
    }
}