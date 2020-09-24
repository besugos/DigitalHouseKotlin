fun main() {

    var guardaVolumes = GuardaVolumes()
    var caneta = Caneta("bic", "cristal")
    var caderno = Caderno("tilibra", "espiral")

    var lista = mutableListOf<Peca>()

    lista.add(caneta)
    lista.add(caderno)

    println("Lista inicial: $lista")

    println("Estado inicial do guarda volumes: ${guardaVolumes.arquivo}")
    println("Guardando as peças...")
    var id = guardaVolumes.guardarPecas(lista)
    println("ID retornado: $id")
    println("Estado do guarda volumes após guardar os itens: ${guardaVolumes.arquivo}")
    println("Retirando as peças...")
    guardaVolumes.devolverPecas(id)
    println("Estado do guarda volumes após devolver os itens: ${guardaVolumes.arquivo}")

}