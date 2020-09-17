fun main() {

    var contaCorrente1 = ContaCorrente (101, 100.00, 1.00)

    var contaPoupanca1 = ContaPoupanca (201, 200.00, 200.00)

    contaCorrente1.depositar(100.00)

    contaPoupanca1.depositar(50.00)

    contaCorrente1.sacar(50.00)

    contaPoupanca1.sacar(300.00)

    var relatorio = Relatorio()

    relatorio.gerarRelatorio(contaCorrente1)

    relatorio.gerarRelatorio(contaPoupanca1)
    
}