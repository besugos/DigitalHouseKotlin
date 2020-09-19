abstract class Pessoa (nome: String, registro: Int) {

    open val podeDarAula: Boolean
        get() = false

    open val podefazerChamada: Boolean
        get() = false

    open val podeAssistirAula: Boolean
        get() = false

    open val podeFazerLicaoDeCasa: Boolean
        get() = false

}