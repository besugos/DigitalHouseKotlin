fun main() {

    var item1 = Item(1, "smartphone",1, 2000.00)
    var item2 = Item(2, "smartwatch", 2, 1000.00)
    var item3 = Item(3, "teste de qtd negativa", -1, 200.00)
    var item4 = Item(4, "teste de preço negativo", 1, -10.00)

    var listaNormal = arrayListOf<Item>(item1, item2)
    var fatura1 = Fatura(listaNormal)
    var listaTesteQtd = arrayListOf<Item>(item3)
    var fatura2 = Fatura(listaTesteQtd)
    var listaTestePreco = arrayListOf<Item>(item4)
    var fatura3 = Fatura(listaTestePreco)
    var listaTesteAmbosNegativos = arrayListOf<Item>(item3, item4)
    var fatura4 = Fatura(listaTesteAmbosNegativos)

    println("Teste com lista normal (qtd e preco positivos):")
    println(fatura1.getTotalFatura())
    println()
    println("Teste com qtd negativa e preco positivo:")
    println(fatura2.getTotalFatura())
    println()
    println("Teste com preço negativo e qtd negativa:")
    println(fatura3.getTotalFatura())
    println()
    println("Teste com preço negativo e qtd negativa:")
    println(fatura4.getTotalFatura())

}