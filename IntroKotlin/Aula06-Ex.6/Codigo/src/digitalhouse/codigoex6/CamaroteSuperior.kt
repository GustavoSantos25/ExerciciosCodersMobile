package digitalhouse.codigoex6

class CamaroteSuperior(var localizacao: String, valor: Double, valorAdicional: Double) : VIP(valorAdicional, valor){
    fun retornaValorCS(): Double{
        return super.valorIngressoVIP()
    }

    fun imprimeLocalizacao(){
        println("Localização do ingresso: $localizacao")
    }
}