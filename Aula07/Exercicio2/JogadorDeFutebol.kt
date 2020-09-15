class JogadorDeFutebol (var nome: String, var energia: Int, var alegria: Int){
    var gols: Int = 0
    var experiencia: Int = 0

    fun fazerGol() {
        this.energia = this.energia - 5
        this.alegria = this.alegria + 10
        this.gols = this.gols + 1
        println("GOOOOL!")
    }

    fun correr() {
        this.energia = this.energia - 10
        println("Cansei")
    }
}