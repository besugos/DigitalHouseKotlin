class Professor (nome: String, registro: Int): Pessoa(nome, registro){
    override val podeDarAula: Boolean
        get() = true

    override val podefazerChamada: Boolean
        get() = true

}