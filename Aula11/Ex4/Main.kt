fun main() {

    val func1 = Funcionario("Alex", 1)
    val func2 = Funcionario("Alvaro", 2)
    val func3 = Funcionario("Alana", 3)
    val func4 = Funcionario("Ana", 4)

    val listaDeFuncionarios = arrayListOf<Funcionario>(func1, func2, func3, func4)

    val func5 = Funcionario("Amelia", 2)

    println(listaDeFuncionarios.contains(func5))
}