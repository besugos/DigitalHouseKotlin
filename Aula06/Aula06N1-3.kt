fun main() {
    var alturas = DoubleArray(5)

    for (i in 0..4) {
        print("Digite a altura da ${i + 1}a pessoa: ")
        alturas[i] = readLine()!!.toDouble()
    }

    println()

    alturas.reverse()



    for (i in 0..4) {
        println("Altura da ${5-i}a pessoa: ${alturas[i]}")
    }
}