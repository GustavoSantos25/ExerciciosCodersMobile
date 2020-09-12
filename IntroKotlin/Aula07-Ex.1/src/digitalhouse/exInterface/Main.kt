package digitalhouse.exInterface

fun main(){
    val item1 = ItemVenda("Pão", 3, 2.0)
    val item2 = ItemVenda("Jogo", 1, 100.0)

    val servico1 = Servico("Coach", 5, 50.0)
    val servico2 = Servico("Pedreiro", 10, 60.0)

    val registro = RegistroRecebimentos()

    registro.adicionarRecebimentos(item1, item2, servico1, servico2)
    registro.apresentarRecebimentos()
}
