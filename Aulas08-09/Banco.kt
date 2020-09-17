class Banco: Imprimivel {
    var listaContas = arrayListOf<ContaBancaria>()

    fun inserir(conta: ContaBancaria) {
        listaContas.add(conta)
    }

    fun remover(conta: ContaBancaria) {
        listaContas.remove(conta)
    }

    fun procurarConta(numeroConta: Int): ContaBancaria? {
        for (i in 0..listaContas.size) {
            if (listaContas[i].numeroConta == numeroConta) {
                return listaContas[i]
            }
        }
        return null
    }


    override fun mostrarDados() {

        listaContas.forEach{it.mostrarDados()}
    }


}