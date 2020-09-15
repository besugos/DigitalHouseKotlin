class SessaoDeTreinamento (val experiencia: Int) {


    fun treinarA (jogador: JogadorDeFutebol) {
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        println("Experiência inicial do jogador ${jogador.nome}: ${jogador.experiencia}")
        jogador.experiencia = jogador.experiencia + this.experiencia
        println("Experiência final do jogador ${jogador.nome}: ${jogador.experiencia}")
    }
}