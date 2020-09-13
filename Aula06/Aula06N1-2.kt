fun main() {
    var lista = IntArray(10)

    for (i in 0..9) {
        print("Digite o ${i + 1}o numero: ")
        lista[i] = readLine()!!.toInt()
    }

    println()
    println("Os números digitados foram: ")

    lista.reverse()



    for (i in 0..9) {
        println(lista[i])
    }
}