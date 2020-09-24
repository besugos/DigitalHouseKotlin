class GuardaVolumes {

    val arquivo = mutableMapOf<Int, MutableList<Peca>>()
    var contador = 0

    fun guardarPecas(listaDePeca: MutableList<Peca>): Int {
        contador++
        arquivo[contador - 1] = listaDePeca
        return (contador - 1)
    }

    fun mostrarPecas() {
        arquivo.forEach(){
            println("${it.key} - ${it.value}")
        }
    }

    fun mostrarPecas(id: Int) {
        println(arquivo[id])
    }

    fun devolverPecas(id: Int) {
        arquivo.remove(id)
    }

}