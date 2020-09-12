package digitalhouse.exInterface

class ItemVenda(var produto: String, var quantidade: Int, var valor: Double) : IRecebivel{
    override fun totalizarReceita(): Double = quantidade * valor

    override fun toString() : String = when(quantidade){
        1 -> "$quantidade $produto foi comprado no valor de $valor reais\nPreço Total: ${totalizarReceita()}"
        0 -> "Nenhum produto foi comprado"
        else -> "$quantidade ${produto}s foram comprados no valor de $valor reais\n" +
                "Preço Total: ${totalizarReceita()}"
    }



}