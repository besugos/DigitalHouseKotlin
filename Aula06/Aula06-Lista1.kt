fun main() {
    var numero = IntArray(3)
    for (i in 0..2) {
        print("Digite o ${i+1}o número: ")
        numero[i] = readLine()!!.toInt()
    }
    var maior = numero.max()
    println()
    println("O maior número digitado foi $maior.")
    

}