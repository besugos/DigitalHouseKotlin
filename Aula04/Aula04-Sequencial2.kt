fun main() {
    print("Quanto vale sua hora? ")
    var valorHora = readLine()!!.toDouble()
    print("Quantas horas você trabalhou? ")
    var horas = readLine()!!.toDouble()
    var total = valorHora * horas
    println()
    println("Você receberá R$ ${"%.2f".format(total)}")
    
}