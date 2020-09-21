fun main() {

    val aluno1 = Aluno("Joao", 1)
    val aluno2 = Aluno("Jose", 2)
    val aluno3 = Aluno("Jonas", 3)
    val aluno4 = Aluno("Julia", 4)


    var listaDeAlunos = arrayListOf<Aluno>(aluno1, aluno2, aluno3, aluno4)

    val aluno5 = Aluno("Jessica", 4)

    println(listaDeAlunos.contains(aluno5))

}