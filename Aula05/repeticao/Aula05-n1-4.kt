fun main() {
    var nome: String
    var idade: Int
    var salario: Double
    var sexo: String
    var estadoCivil: String

    do {
        print("Digite seu nome: ")
        nome = readLine()!!.toString()
        if (nome.length > 3) {
            break
        }
        println("Nome inválido!")
    } while (true)

    do {
        print("Digite sua idade: ")
        idade = readLine()!!.toInt()
        if (idade in 0..150) {
            break
        }
        println("Idade inválida!")
    } while (true)

    do {
        print("Digite seu Salário: ")
        salario = readLine()!!.toDouble()
        if (salario > 0) {
            break
        }
        println("Salário inválido!")
    } while (true)

    do {
        print("Digite seu sexo (f/m): ")
        sexo = readLine()!!.toLowerCase()
        when (sexo) {
            "f", "m" -> break
            else -> println("Sexo inválido!")
        }

    } while (true)

    do {
        print("Digite seu estado civil (s/c/v/d): ")
        estadoCivil = readLine()!!.toLowerCase()
        when (estadoCivil){
            "s", "c", "v", "d" -> break
            else -> println("Estado civil inválido!")
        }

    } while (true)
}