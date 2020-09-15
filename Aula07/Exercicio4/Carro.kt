class Carro (val consumo: Int) {

    var qtdCombustivel: Int = 0

    fun andar(distancia: Int) {
        var distanciaPossivel = this.consumo * this.qtdCombustivel

        if (distancia >= distanciaPossivel) {
            this.qtdCombustivel = this.qtdCombustivel - (distancia / this.consumo)
        }
        else {
            println("Combustível insuficiente. Só é possível andar $distanciaPossivel Km")
        }


    }

    fun obterGasolina() {
        println(this.qtdCombustivel)
    }

    fun adicionarGasolina(qtdAbastecida: Int) {
        this.qtdCombustivel = this.qtdCombustivel + qtdAbastecida
    }

}