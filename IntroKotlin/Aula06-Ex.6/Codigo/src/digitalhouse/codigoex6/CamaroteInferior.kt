package digitalhouse.codigoex6

class CamaroteInferior (var localizacao: String, valor: Double) : VIP(0.0, valor){
    fun imprimeLocalizacao(){
        println("Localização do ingresso: $localizacao")
    }
}