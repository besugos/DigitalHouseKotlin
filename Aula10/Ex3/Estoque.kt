import kotlin.math.max

class Estoque (var nome:String, var qtdAtual: Int, var qtdMinima: Int) {

    init{
        qtdAtual = max(0, qtdAtual)
        qtdMinima = max(0, qtdMinima)
    }

    fun mudarNome(novoNome: String) {
        nome = novoNome
    }

    fun mudarQtdMinima(novaQtdMinima: Int) {
        qtdMinima = novaQtdMinima
    }

    fun repor (qtd: Int) {
        qtdAtual += qtd
    }

    fun darBaixa (qtd: Int) {
        if (qtd <= qtdAtual) {
            qtdAtual -= qtd
        } else {
            println("Quantidade insuficiente")
        }
    }

    fun mostra(): String {
        return "Produto: $nome    |    Quantidade Minima $qtdMinima    |    Quantidade Atual: $qtdAtual"
    }

    fun precisaRepor(): Boolean{
        return (qtdAtual <= qtdMinima)
    }


}