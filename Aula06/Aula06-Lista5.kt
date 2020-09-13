fun main() {
    print("Digite um número inteiro A: ")
    var numA = readLine()!!.toInt()
    print("Digite um número inteiro B: ")
    var numB = readLine()!!.toInt()
    print("Digite um número inteiro C: ")
    var numC = readLine()!!.toInt()
    print("Digite um número inteiro D: ")
    var numD = readLine()!!.toInt()
    println(((numA > numC) && (numA > numD)) || ((numB > numC) && (numB > numD)))
}