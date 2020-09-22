fun main() {

    val lista = arrayListOf<String>()
    lista.add("Pato")
    lista.add("Cachorro")
    lista.add("Gato")
    try {
        println(lista[3])
    } catch(ex:Exception){
        println(ex.message)
    }
}