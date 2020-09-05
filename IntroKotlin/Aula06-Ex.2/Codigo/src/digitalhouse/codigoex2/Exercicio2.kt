package digitalhouse.codigoex2

fun main(){
    val jogador1 = JogadorDeFutebol("Paulo", 100, 70, 10, 120)
    val jogador2 = JogadorDeFutebol("Gustavo", 70, 80, 2, 30)

    val sessao = SessaoDeTreinamento(50)

    sessao.treinarA(jogador1)
    println("\n")
    sessao.treinarA(jogador2)
}