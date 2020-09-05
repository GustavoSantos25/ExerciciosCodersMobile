package digitalhouse.codigoex5

fun main(){
    val concessionaria = Concessionaria()

    val carro = Veiculo("BMW", "A8", 2019, "Preto", 100000.0)
    val cliente = Cliente("Gustavo", "Santos", "4002-8922")
    

    val venda = Vendas(cliente, carro, 100000.0)

    concessionaria.registrarVenda(venda)


}