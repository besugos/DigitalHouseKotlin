fun main() {
    print("Qual a sua altura? ")
    var altura = readLine()!!.toDouble()
    var pesoHomem = (altura * 72.7) - 58
    var pesoMulher = (altura * 62.1) - 44.7
    println()
    println("Para homens: ${"%.2f".format(pesoHomem)}")
    println("Para mulheres: ${"%.2f".format(pesoMulher)}")

}