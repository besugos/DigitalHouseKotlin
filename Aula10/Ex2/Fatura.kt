class Fatura(val listaItens: ArrayList<Item>){

    fun getTotalFatura(): Double {
        var total = 0.0
        listaItens.forEach() {
            total = total + (it.qtdComprada * it.precoUnitario)
        }
        return total
    }
}

