fun main(){

    print("Quanto você ganha por hora? ")
    var salarioPorHora = readLine()!!.toDouble()
    print("Qual o número de horas trabalhadas? ")
    var horasTrabalhadas = readLine()!!.toDouble()

    var salarioBruto = salarioPorHora * horasTrabalhadas
    var ir = salarioBruto * 0.11
    var inss = salarioBruto * 0.08
    var sindicato = salarioBruto * 0.05
    var salarioLiquido = salarioBruto - ir - inss - sindicato

    println("")
    println("+ Salário Bruto : R$ ${"%.2f".format(salarioBruto)}")
    println("- IR (11%) : R$ ${"%.2f".format(ir)}")
    println("- INSS (8%) : R$ ${"%.2f".format(inss)}")
    println("- Sindicato (5%) : R$ ${"%.2f".format(sindicato)}")
    println("= Salário Líquido: R$ ${"%.2f".format(salarioLiquido)}")

}