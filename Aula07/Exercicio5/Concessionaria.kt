class Concessionaria {

    var registroVenda = arrayListOf<RegistroVenda>()

    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Double) {
        var novaVenda = RegistroVenda (valor, veiculo, cliente)

        this.registroVenda.add(novaVenda)
    }


}