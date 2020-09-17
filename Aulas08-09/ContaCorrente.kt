class ContaCorrente (numeroConta: Int, saldo: Double, private var taxaDeOperacao: Double): ContaBancaria(numeroConta, saldo) {

    override fun sacar(valor: Double): Boolean {


        if (saldo >= (valor + taxaDeOperacao)) {
            saldo = saldo - (valor + taxaDeOperacao)
            return true
        } else {
            println("Saldo Insuficiente")
            return false
        }

    }


    override fun depositar(valor: Double): Boolean {


        if (this.saldo + valor >= taxaDeOperacao) {
            this.saldo = this.saldo - taxaDeOperacao
            this.saldo = this.saldo + valor
            return true
        } else {
            println("Saldo Insuficiente")
            return false
        }


    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Taxa de Operação: ${taxaDeOperacao}")

    }
}