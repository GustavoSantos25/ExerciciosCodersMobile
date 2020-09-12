package digitalhouse.exInterface

class Servico(var descricao: String, var horas: Int, var precoHora: Double) : IRecebivel{
    override fun totalizarReceita(): Double = horas * precoHora

    override fun toString() : String = when(horas){
        1 -> "Serviço $descricao feito por $horas hora, ao custo de ${precoHora}/hora\n" +
                " Preço Total: ${totalizarReceita()}"
        else -> "Serviço $descricao feito por $horas hora, ao custo de ${precoHora}/hora\n" +
                "Preço Total: ${totalizarReceita()}"
    }

}