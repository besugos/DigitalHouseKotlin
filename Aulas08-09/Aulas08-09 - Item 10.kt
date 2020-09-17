fun main() {

    var banco = Banco()

    menu(banco)
}

    fun menu(banco: Banco){
        var opcao: Int = 0
        while (true) {
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
                5 -> break
                else -> {
                    println("Opção Inválida")
                    continue
                }
            }
        }

    }


fun criarConta(banco: Banco) {
    println()
    while (true) {
        print("Conta Corrente ou Poupança? (C/P) ")
        var opcao: String = readLine()!!.toString().toUpperCase()
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
    while (true) {
        println()
        print("Informe o numero da conta: ")
        val numeroConta = readLine()!!.toInt()
        for (i in 0..banco.listaContas.size) {
            if (banco.listaContas[i].numeroConta == numeroConta) {
                banco.listaContas.removeAt(i)
                println("Conta removida com sucesso")
            } else {
                println("Conta Inexistente")
                continue
            }
        }

    }
}

fun gerarRelatorio(banco: Banco) {
    banco.mostrarDados()
}


fun criarContaPoupanca(banco: Banco) {
    println()
    while (true) {
        print("Entre o numero da conta: ")
        val numero = readLine()!!.toInt()
        if (banco.listaContas.size > 0) {
            for (i in 0..(banco.listaContas.size)) {
                if (banco.listaContas[i].numeroConta == numero) {
                    println("Conta já existente")
                    println()
                    continue
                } else {
                    print("Entre o saldo: ")
                    val saldo = readLine()!!.toDouble()
                    print("Entre o limite: ")
                    val limite = readLine()!!.toDouble()
                    var novaConta = ContaCorrente(numero, saldo, limite)
                    banco.listaContas.add(novaConta)
                    println("Conta criada com sucesso!")
                }
            }

        } else {
            print("Entre o saldo: ")
            val saldo = readLine()!!.toDouble()
            print("Entre o limite: ")
            val limite = readLine()!!.toDouble()
            val novaConta = ContaCorrente(numero, saldo, limite)
            banco.listaContas.add(novaConta)
            println("Conta criada com sucesso!")
        }
    }
}


fun criarContaCorrente(banco: Banco) {
    println()
    while (true) {
        print("Entre o numero da conta: ")
        val numero = readLine()!!.toInt()
        if (banco.listaContas.size > 0) {
            for (i in 0..(banco.listaContas.size)) {
                if (banco.listaContas[i].numeroConta == numero) {
                    println("Conta já existente")
                    println()
                    continue
                } else {
                    print("Entre o saldo: ")
                    val saldo = readLine()!!.toDouble()
                    print("Entre a taxa de operação: ")
                    val taxa = readLine()!!.toDouble()
                    var novaConta = ContaCorrente(numero, saldo, taxa)
                    banco.listaContas.add(novaConta)
                    println("Conta criada com sucesso!")
                }
            }

        } else {
            print("Entre o saldo: ")
            val saldo = readLine()!!.toDouble()
            print("Entre a taxa de operação: ")
            val taxa = readLine()!!.toDouble()
            val novaConta = ContaCorrente(numero, saldo, taxa)
            banco.listaContas.add(novaConta)
            println("Conta criada com sucesso!")
        }
    }
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
    println("Entre o valor a depositar: ")
    val valor = readLine()!!.toDouble()
    conta.depositar(valor)
}

fun sacar(conta: ContaBancaria) {
    println()
    println("Entre o valor a sacar: ")
    val valor = readLine()!!.toDouble()
    conta.sacar(valor)
}

fun transferir(conta: ContaBancaria, banco: Banco) {
    while (true) {
        println()
        println("Entre o numero da conta de destino: ")
        val numero = readLine()!!.toInt()
        for (i in 0..(banco.listaContas.size)) {
            if (banco.listaContas[i].numeroConta == numero) {
                println("Entre o valor a depositar: ")
                var valor = readLine()!!.toDouble()
                conta.transferir(valor, banco.listaContas[i])
                println("Transferencia realizada com sucesso")
                break
            }
        }
        print ("Conta inexistente")
        continue
    }

}

fun gerarRelatorioConta(conta: ContaBancaria) {
    conta.mostrarDados()
}