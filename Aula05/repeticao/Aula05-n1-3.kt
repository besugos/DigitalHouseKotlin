import kotlin.math.max
import kotlin.math.min

fun main() {
    print("Digite o primeiro numero do intervalo: ")
    var num1 = readLine()!!.toInt()
    print("Digite o segundo numero do intervalo: ")
    var num2 = readLine()!!.toInt()
    for (i in min(num1, num2)..max(num1,num2)) {
        println(i)
    }
}