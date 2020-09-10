import kotlin.math.max

fun main() {
    print("Digite o peso dos peixes: ")
    var peso = readLine()!!.toDouble()

    var excedente = max(0.0, (peso - 50))

    /*
    Para o evitar a função 'max' acima e o programa funcionar corretamente no caso do peso informado ser inferior a 50
    uma alternativa é:

        excedente = (peso - 50)

        if (excedente < 0) {
            excedente = 0.0
        }

    */


    var multa = (excedente * 4)

    println()
    println("Excedeu ${"%.0f".format(excedente)}Kg")
    println("O valor a ser pago é de R$ ${"%.2f".format(multa)}")

}