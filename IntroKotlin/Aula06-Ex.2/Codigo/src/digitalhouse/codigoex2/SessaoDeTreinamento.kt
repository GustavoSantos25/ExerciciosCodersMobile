package digitalhouse.codigoex2

class SessaoDeTreinamento(var experiencia: Int) {

    fun treinarA(jogador: JogadorDeFutebol){
        println("Experiência inicial: ${jogador.experiencia}")

        jogador.correr()
        jogador.fazerGol()
        jogador.correr()

        jogador.experiencia += experiencia
        println("Experiência final: ${jogador.experiencia}")
    }
}