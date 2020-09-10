fun main() {
    print("Digite a temperatura em graus Fahrenheit: ")
    var grausF = readLine()!!.toDouble()
    var grausC = 5 * ((grausF - 32) / 9)
    print("Temperatura em graus Celsius: $grausC °C")
}