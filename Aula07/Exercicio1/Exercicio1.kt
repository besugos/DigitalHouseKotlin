fun main() {
    val primeiroCliente = Cliente("John", "Denver")
    val segundoCliente = Cliente("Jane", "Doe")

    var primeiraConta = Conta(101, 2000.00, primeiroCliente)
    var segundaConta = Conta(102, 1500.00, segundoCliente)

    primeiraConta.deposito(100.00)
    segundaConta.deposito(330.00)

    primeiraConta.saque(10000.00)
    segundaConta.saque(230.00)


}