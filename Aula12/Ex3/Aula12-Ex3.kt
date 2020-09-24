

fun main() {
    val conjunto = mutableSetOf<Int>()
    conjunto.add(10)
    conjunto.add(8)
    conjunto.add(7)
    conjunto.add(9)

    var prova = Prova()

    conjunto.forEach(){
        println(it)
    }

    prova.somaTotal(conjunto)



}