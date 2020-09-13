import kotlin.random.Random

fun main() {
    print("Rolar dados? (s ou n) ")
    var resposta = readLine()!!.toString()
    if (resposta.toUpperCase() == "S") {
        var valor = rolaDados()
        verificaResultado(valor)

    }

}

fun rolaDados():Int {
    return Random.nextInt(2,12)
}

fun verificaResultado(valor: Int) {
    when (valor) {
        2, 3, 12 -> println("Você tirou ${valor}! Você perdeu =(")
        7, 11 -> println("Você tirou ${valor}! Parabéns você ganhou!")
        else -> segundoRound(valor)
    }
 }

fun segundoRound(valor:Int) {
    print("Você tirou ${valor}! Aperte enter para tentar novamente")
    var deNovo = readLine()!!.toString()
    while (deNovo=="") {
        var segundoValor = rolaDados()
        when (segundoValor) {
            valor -> {
                println("Você tirou ${segundoValor}! Parabéns você ganhou!")
                break
            }
            7 -> {
                println("Você tirou 7! Você perdeu =(")
                break
            }
            else -> {
                print("Você tirou ${segundoValor}! Aperte enter para tentar novamente")
                deNovo = readLine()!!.toString()
            }
        }

    }

}


