import kotlin.system.exitProcess

fun main() {

    var banco = Banco()

    menu(banco)
}

fun menu(banco: Banco) {
    var opcao: Int = 0
        println()
        println("-----------------------")
        println("MENU PRINCIPAL")
        println("-----------------------")
        println("1 - Criar conta")
        println("2 - Selecionar conta")
        println("3 - Remover conta")
        println("4 - Gerar relatório")
        println("5 - Finalizar")
        println()
        print("Entre a opção desejada: ")
        opcao = readLine()!!.toInt()

        when (opcao) {
            1 -> criarConta(banco)
            2 -> selecionarConta(banco)
            3 -> removerConta(banco)
            4 -> gerarRelatorio(banco)
            5 -> exitProcess(0)
            else -> {
                println("Opção Inválida")
                menu(banco)
            }
        }
    }




fun criarConta(banco: Banco) {
    println()
    while (true) {
        print("Conta Corrente ou Poupança? (C/P) ")
        val opcao: String = readLine()!!.toString().toUpperCase()
        when (opcao) {
            "C" -> criarContaCorrente(banco)
            "P" -> criarContaPoupanca(banco)
            else -> {
                println()
                println("Opcao invalida")
                println()
                continue
            }
        }
    }

}


fun selecionarConta(banco: Banco) {
    while (true) {
        println()
        print("Informe o numero da conta: ")
        val numeroConta = readLine()!!.toInt()
        for (i in 0..banco.listaContas.size) {
            if (banco.listaContas[i].numeroConta == numeroConta) {
                menu2(banco.listaContas[i], banco)
            } else {
                println("Conta Inexistente")
                continue
            }
        }

    }
}

fun removerConta(banco: Banco) {

        println()
        print("Informe o numero da conta: ")
        val numConta = readLine()!!.toInt()
        if (banco.listaContas.size > 0) {
            for (listaConta in banco.listaContas) {
                if (listaConta.numeroConta == numConta) {
                    var j = banco.listaContas.indexOf(listaConta)
                    banco.listaContas.removeAt(j)
                    break
                }
            }

        } else {
                println("Conta Inexistente")
                removerConta(banco)
            }
        }




fun gerarRelatorio(banco: Banco) {
    banco.mostrarDados()
}

fun criarContaPoupanca(banco: Banco) {
    println()
    print("Entre o numero da conta: ")
    val numConta = readLine()!!.toInt()
    if (banco.listaContas.size > 0) {
        for (listaConta in banco.listaContas) {
            if (listaConta.numeroConta == numConta) {
                criarContaPoupanca(banco)
            }
        }
    }
    print("Entre o saldo: ")
    val saldo = readLine()!!.toDouble()
    print("Entre o limite: ")
    val limite = readLine()!!.toDouble()
    val novaConta = ContaCorrente(numConta, saldo, limite)
    banco.listaContas.add(novaConta)
    println("Conta criada com sucesso!")
    menu(banco)
}

fun criarContaCorrente(banco: Banco) {
    println()
    print("Entre o numero da conta: ")
    val numConta = readLine()!!.toInt()
    if (banco.listaContas.size > 0) {
        for (listaConta in banco.listaContas) {
            if (listaConta.numeroConta == numConta) {
                criarContaCorrente(banco)
            }
        }
    }
    print("Entre o saldo: ")
    val saldo = readLine()!!.toDouble()
    print("Entre a taxa de operação: ")
    val taxa = readLine()!!.toDouble()
    val novaConta = ContaCorrente(numConta, saldo, taxa)
    banco.listaContas.add(novaConta)
    println("Conta criada com sucesso!")
    menu(banco)
}



fun menu2(conta: ContaBancaria, banco: Banco) {
    var opcao: String
    while (true) {
        println("-----------------------")
        println("a - Depositar")
        println("b - Sacar")
        println("c - Transferir")
        println("d - Gerar relatório")
        println("e - Retornar ao menu anterior")
        println()
        print("Entre a opção desejada: ")
        opcao = readLine()!!.toString().toUpperCase()

        when (opcao) {
            "A" -> depositar(conta)
            "B" -> sacar(conta)
            "C" -> transferir(conta, banco)
            "D" -> gerarRelatorioConta(conta)
            "E" -> menu(banco)
            else -> {
                println("Opção Inválida")
                continue
            }
        }
    }
}

fun depositar(conta: ContaBancaria) {
    println()
    print("Entre o valor a depositar: ")
    val valor = readLine()!!.toDouble()
    conta.depositar(valor)
}

fun sacar(conta: ContaBancaria) {
    println()
    print("Entre o valor a sacar: ")
    val valor = readLine()!!.toDouble()
    conta.sacar(valor)
}

fun transferir(conta: ContaBancaria, banco: Banco) {

        println()
        print("Entre o numero da conta de destino: ")
        val numero = readLine()!!.toInt()
        if (banco.listaContas.size > 0) {
            for (listaConta in banco.listaContas) {
                if (listaConta.numeroConta == numero) {
                    print("Entre o valor a depositar: ")
                    var valor = readLine()!!.toDouble()
                    var j = banco.listaContas.indexOf(listaConta)
                    conta.transferir(valor, banco.listaContas[j])
                    println("Transferencia realizada com sucesso")
                    menu2(conta, banco)
                }
            }
            print("Conta inexistente")
            transferir(conta, banco)
        }

    }


fun gerarRelatorioConta(conta: ContaBancaria) {
    conta.mostrarDados()
}