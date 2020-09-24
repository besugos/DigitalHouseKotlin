fun main() {

    val apelidos = mutableMapOf<String, MutableList<String>>()

    apelidos["Joao"] = mutableListOf<String>("Juan", "Fissura", "Maromba")
    apelidos["Miguel"] = mutableListOf<String>("Night Watch", "Bruce Wayne", "Tampinha")
    apelidos["Maria"] = mutableListOf<String>("Wonder Woman", "Mary", "Marilene")
    apelidos["Lucas"] = mutableListOf<String>("Lukinha", "Jorge", "George")

    apelidos.forEach() {
        println("${it.key} -> ${it.value}")
    }
}