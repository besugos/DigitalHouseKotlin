fun main() {

    var joao = Atleta("João", 2, 300)
    var jose = Atleta("José", 5, 550)

    val provaMuitoFacil = Prova(1, 100)
    val provaFacil = Prova (2, 200)
    val provaMedia = Prova (3, 300)

    val provaDificil = Prova (4, 400)
    val provaMuitoDificil = Prova (5, 500)
    val provaImpossivel = Prova (6, 600)


    println("Retorno da 1a prova de Joao: ${provaMuitoFacil.realizarProva(joao)}. Sua energia agora é ${joao.energia}")
    println("Retorno da 2a prova de Joao: ${provaFacil.realizarProva(joao)}. Sua energia agora é ${joao.energia}")
    println("Retorno da 3a prova de Joao: ${provaMedia.realizarProva(joao)}. Sua energia agora é ${joao.energia}")

    println()

    println("Retorno da 1a prova de Jose: ${provaDificil.realizarProva(jose)}. Sua energia agora é ${jose.energia}")
    println("Retorno da 2a prova de Jose: ${provaMuitoDificil.realizarProva(jose)}. Sua energia agora é ${jose.energia}")
    println("Retorno da 3a prova de Jose: ${provaImpossivel.realizarProva(jose)}. Sua energia agora é ${jose.energia}")

}