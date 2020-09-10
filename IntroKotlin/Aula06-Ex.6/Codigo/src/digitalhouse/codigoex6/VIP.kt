package digitalhouse.codigoex6

abstract class VIP(var valorAdicional: Double, valor: Double) : Ingresso(valor){
    fun valorIngressoVIP() : Double{
        return super.valor + valorAdicional
    }
}