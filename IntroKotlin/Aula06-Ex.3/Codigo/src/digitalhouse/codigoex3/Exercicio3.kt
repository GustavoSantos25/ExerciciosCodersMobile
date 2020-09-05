package digitalhouse.codigoex3

fun main(){
    val atleta1 = Atleta("Ippo", 1000, 8001)
    val atleta2 = Atleta("Miyata", 1200, 5000)

    val prova1_atleta1 = Prova(300, 5000)
    if(prova1_atleta1.podeFazer(atleta1)) println("O atleta ${atleta1.nome} pode fazer a prova 1")
    else println("O atleta ${atleta1.nome} não pode fazer a prova 1")

    val prova2_atleta1 = Prova(500, 8002)
    if(prova2_atleta1.podeFazer(atleta1)) println("O atleta ${atleta1.nome} pode fazer a prova 2")
    else println("O atleta ${atleta1.nome} não pode fazer a prova 2")

    val prova3_atleta1 = Prova(1300, 100)
    if(prova3_atleta1.podeFazer(atleta1)) println("O atleta ${atleta1.nome} pode fazer a prova 3")
    else println("O atleta ${atleta1.nome} não pode fazer a prova 3")

    println()


    val prova1_atleta2 = Prova(500, 5500)
    if(prova1_atleta2.podeFazer(atleta2)) println("O atleta ${atleta2.nome} pode fazer a prova 1")
    else println("O atleta ${atleta2.nome} não pode fazer a prova 1")

    val prova2_atleta2 = Prova(1300, 4000)
    if(prova2_atleta2.podeFazer(atleta2)) println("O atleta ${atleta2.nome} pode fazer a prova 2")
    else println("O atleta ${atleta2.nome} não pode fazer a prova 2")

    val prova3_atleta2 = Prova(1200, 5000)
    if(prova3_atleta2.podeFazer(atleta2)) println("O atleta ${atleta2.nome} pode fazer a prova 3")
    else println("O atleta ${atleta2.nome} não pode fazer a prova 3")


}