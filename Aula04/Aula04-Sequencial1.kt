fun main() {
    print("Digite a nota 1: ")
    var nota1 = readLine()!!.toDouble()
    print("Digite a nota 2: ")
    var nota2 = readLine()!!.toDouble()
    print("Digite a nota 3: ")
    var nota3 = readLine()!!.toDouble()
    print("Digite a nota 4: ")
    var nota4 = readLine()!!.toDouble()
    var media = (nota1 + nota2 + nota3 + nota4) / 4

    println()

    println("A média é " + media)

    /* Para forçar nota formatada com duas casas:

    println("A média é ${"%.2f".format(media)}")
    */

}