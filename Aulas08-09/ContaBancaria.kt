abstract class ContaBancaria (val numeroConta: Int, protected var saldo: Double): Imprimivel{

    abstract fun sacar(valor: Double): Boolean

    abstract fun depositar(valor: Double): Boolean

    fun transferir(valor: Double, conta: ContaBancaria) {
        var saldoInicial = saldo
        if (!this.sacar(valor) || !conta.depositar(valor)) {
            saldo = saldoInicial
            println("Saldo Insuficiente - operação cancelada")
        } else {
            sacar(valor)
            conta.depositar(valor)
        }

    }

    override fun mostrarDados() {
        println("-----------------------------")
        println("Conta: ${numeroConta}")
        println("Saldo: ${saldo}")

    }

}