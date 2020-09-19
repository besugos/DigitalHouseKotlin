class Aluno (val registro: Int, val nome: String, val sobrenome: String): Pessoa(nome, registro) {

    override val podeAssistirAula: Boolean
        get() = true

    override val podeFazerLicaoDeCasa: Boolean
        get() = true
}