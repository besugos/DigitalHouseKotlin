fun main() {

    var paratiPrata = Veiculo("volkswagen", "parati","prata", 2003, 145000)

    var comprador = Cliente ("Rafael", "Valle", "rafael.valle@anymail.com")

    var concessionaria = Concessionaria()

    concessionaria.registrarVenda(paratiPrata, comprador, 6500.00)

}