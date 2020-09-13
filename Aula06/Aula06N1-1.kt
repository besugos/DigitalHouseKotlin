fun main() {
    val lista = IntArray(5)

    for (i in 0..4) {
        print("Digite o ${i + 1}o numero: ")
        lista[i] = readLine()!!.toInt()
    }

    println()
    println("Os números digitados foram: ")
    for (i in 0..4) {
        println(lista[i])
    }
}