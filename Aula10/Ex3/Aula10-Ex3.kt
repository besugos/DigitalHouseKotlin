fun main() {

    val produto = Estoque ("produto", 100, 10)

    println("Estado inicial")
    println(produto.mostra())

    produto.mudarNome("produto novo")

    println()
    println("Nome modificado")
    println(produto.mostra())

    produto.darBaixa(90)

    println()
    println("Baixa possível")
    println(produto.mostra())

    println()
    println("Baixa impossível")
    produto.darBaixa(90)
    println(produto.mostra())

    produto.repor(10)
    println()
    println("Reposição")
    println(produto.mostra())

    produto.mudarQtdMinima(20)
    println()
    println("Mudar qtd minima")
    println(produto.mostra())

    println()
    println("Testando metodo precisaRepor")
    println(produto.mostra())
    print(message = produto.precisaRepor())

}