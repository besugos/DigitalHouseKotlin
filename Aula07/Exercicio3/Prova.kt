class Prova (val dificuldade: Int, val energiaNecessaria: Int) {

    fun realizarProva(atleta: Atleta): Boolean {

        var retorno = ((atleta.nivel >= this.dificuldade) && (atleta.energia >= this.energiaNecessaria))

        if (retorno) {

            atleta.energia = atleta.energia - this.energiaNecessaria

        }

        return retorno
    }
}