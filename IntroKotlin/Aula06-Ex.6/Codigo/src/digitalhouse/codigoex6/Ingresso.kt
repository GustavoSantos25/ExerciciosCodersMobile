package digitalhouse.codigoex6

abstract class Ingresso(var valor: Double) {
    open fun imprimeValor(){
        println("Valor do ingresso: $valor")
    }
}