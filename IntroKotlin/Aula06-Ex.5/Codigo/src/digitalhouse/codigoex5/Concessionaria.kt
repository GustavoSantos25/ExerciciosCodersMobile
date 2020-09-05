package digitalhouse.codigoex5

class Concessionaria(
        val registoDeVendas: ArrayList<Vendas> = arrayListOf<Vendas>()
) {
    fun registrarVenda(novaVenda: Vendas){
        registoDeVendas.add(novaVenda)
        println("O cliente ${novaVenda.cliente.nome} " +
                "comprou o veículo ${novaVenda.veiculoVendido.modelo} " +
                "da marca ${novaVenda.veiculoVendido.marca}, " +
                "pelo valor de R$${novaVenda.valorDaVenda}")
    }

}