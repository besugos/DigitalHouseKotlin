class Conta (var numeroConta: Int, var saldo: Double, var titular: Cliente) {


    fun deposito(valorDeposito: Double) {
        this.saldo = this.saldo + valorDeposito
        println("Operação realizada: Depósito")
        println("Novo saldo: R$ ${"%.2f".format(this.saldo)}")
    }

    fun saque(valorSaque: Double) {
        if (this.saldo < valorSaque) {
            println("Saldo Insuficiente")
        } else {
            this.saldo = this.saldo - valorSaque
            println("Operação realizada: Saque")
            println("Novo saldo: R$ ${"%.2f".format(this.saldo)}")
        }


    }
}