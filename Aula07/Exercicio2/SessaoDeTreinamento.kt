class SessaoDeTreinamento () {

    var experiencia: Int = 0

    fun treinarA (jogador: JogadorDeFutebol) {
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        println("Experiência inicial do jogador ${jogador.nome}: ${jogador.experiencia}")
        jogador.experiencia = jogador.experiencia + 1
        println("Experiência final do jogador ${jogador.nome}: ${jogador.experiencia}")
    }
}