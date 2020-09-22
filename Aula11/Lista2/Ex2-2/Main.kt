fun main() {
    val lista = arrayListOf<String>()
    lista.add("Pato")
    lista.add("Cachorro")
    lista.add("Gato")
    println(lista[2])
    try{
        println(lista[5])
    } catch (ex:Exception) {
        println(ex.message)
    }
}