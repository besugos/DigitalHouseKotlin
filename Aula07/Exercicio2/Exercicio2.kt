fun main() {

    var mane = JogadorDeFutebol("Garrincha", 80, 100)

    mane.experiencia = 40
    mane.gols = 300

    var pele = JogadorDeFutebol( "Edson", 100, 90)

    pele.experiencia = 30
    pele.gols = 1000

    val treinoFinalizacao = SessaoDeTreinamento(10)

    treinoFinalizacao.treinarA(mane)

    treinoFinalizacao.treinarA(pele)

}