fun main()
{

    var vSistemas = IntArray(6)
    var nomeSistema = arrayOf("Windows Server", "Unix          ", "Linux         ", "Netware      ", "MacOS         ", "Outro         ")
    var nomeSistemaNotab = arrayOf("Windows Server", "Unix", "Linux", "Netware", "MacOS", "Outro")
    var nTotal = 0
    println("${"Qual o melhor Sistema Operacional para uso em servidores?"}")
    println()
    println("As possíveis respostas são:")
    println()

    for(nCont in 0..5)
        println("${nCont + 1} - ${nomeSistema[nCont]}")

    println()

    do
    {
        print("Digite sua opção: ")
        val nOpcao = readLine()!!.toInt()
        if(nOpcao in 1..6)
        {
            vSistemas[nOpcao - 1]++
            nTotal ++
        }
        else if(nOpcao != 0)
            println("Opção inválida")
    } while (nOpcao !=0)

    println("Sistema Operacional\t\tVotos\t %")
    println("-------------------\t\t-----\t ---")




    for(nCont in 0..5) {
        println("${nomeSistema[nCont]} \t\t\t ${vSistemas[nCont]} \t\t ${"%.0f".format((100.0 * vSistemas[nCont]) / nTotal)}%")
    }
    println("-------------------\t\t-----")
    println("Total              \t\t  $nTotal")

    val vencedor = vSistemas.max()!!.toInt()

    println()

    for(nCont in 0..5)
        if(vSistemas[nCont]==vencedor)
            println("O Sistema Operacional mais votado foi o ${nomeSistemaNotab[nCont]}, com ${vSistemas[nCont]} votos, correspondendo a ${"%.0f".format((100.0 * vSistemas[nCont]) / nTotal)}% dos votos.")
}
