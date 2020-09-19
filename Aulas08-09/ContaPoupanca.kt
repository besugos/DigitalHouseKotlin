class ContaPoupanca(numeroConta: Int, saldo: Double?, private var limite: Double?): ContaBancaria(numeroConta, saldo){


    override fun sacar(valor: Double): Boolean {


        if (valor >= (saldo!! + limite!!)) {
            saldo = saldo!! - valor
            return true
        } else {
            println("Saldo Insuficiente")
            return false
        }

    }

    override fun depositar(valor: Double): Boolean {

        this.saldo = this.saldo!! + valor
        return true

    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Limite: ${limite}")
    }

}