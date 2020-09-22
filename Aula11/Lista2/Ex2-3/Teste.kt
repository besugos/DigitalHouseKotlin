
import kotlin.ArithmeticException

fun main() {

    val calculo = CalculoMatematico()

    try{
        println(calculo.divisao(4, 0))
    } catch (ex: ArithmeticException) {
        println(ex.message)
    }



}