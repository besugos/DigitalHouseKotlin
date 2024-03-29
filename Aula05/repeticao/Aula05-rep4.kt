
fun main () {
    var codigoMaisAlto = 0
    var codigoMaisBaixo = 0
    var codigoMaisGordo  = 0
    var codigoMaisMagro = 0
    var pesoMaisGordo = 0.0
    var pesoMaisMagro = 0.0
    var alturaMaisAlta = 0.0
    var alturaMaisBaixa = 0.0
    var totalPeso = 0.0
    var totalAltura = 0.0
    var numeroAlunos = 0
    do {
        print("Insira o código do aluno: ")
        var codigoInserido = readLine()!!.toInt()
        if (codigoInserido == 0) {
            break
        }
        print("Insira o peso: ")
        var pesoInserido = readLine()!!.toDouble()
        if (pesoMaisGordo.equals(0.0) || pesoInserido.compareTo(pesoMaisGordo) > 0) {
            pesoMaisGordo = pesoInserido
            codigoMaisGordo = codigoInserido
        }
        if (pesoMaisMagro.equals(0.0) || pesoInserido.compareTo(pesoMaisMagro) < 0) {
            pesoMaisMagro = pesoInserido
            codigoMaisMagro = codigoInserido
        }
        print("Insira a altura: ")
        var alturaInserida = readLine()!!.toDouble()
        if (alturaMaisAlta.equals(0.0) || alturaInserida.compareTo(alturaMaisAlta) > 0) {
            alturaMaisAlta = alturaInserida
            codigoMaisAlto = codigoInserido
        }
        if (alturaMaisBaixa.equals(0.0) || alturaInserida.compareTo(alturaMaisBaixa) < 0) {
            alturaMaisBaixa = alturaInserida
            codigoMaisBaixo = codigoInserido
        }
        totalPeso += pesoInserido
        totalAltura += alturaInserida
        numeroAlunos++
    } while (true)
    println("Código aluno mais alto: $codigoMaisAlto ($alturaMaisAlta)")
    println("Código aluno mais baixo: $codigoMaisBaixo ($alturaMaisBaixa)")
    println("Código aluno mais gordo: $codigoMaisGordo ($pesoMaisGordo)")
    println("Código aluno mais magro: $codigoMaisMagro ($pesoMaisMagro)")
    println("Média alturas: ${"%.2f".format(totalAltura.div(numeroAlunos))}")
    println("Média pesos: ${"%.2f".format(totalPeso.div(numeroAlunos))}")
}
