package digitalhouse.codigoex4

class Tripe(
        var dobrado: Boolean,
        var alturaMinima: Int,
        var alturaMaxima: Int,
        var alturaAtual: Int
) {
    fun definirAltura(novaAltura: Int){
        when {
            (novaAltura <= alturaMaxima && novaAltura >= alturaMinima) -> {
                alturaAtual = novaAltura
                println("Nova altura: $novaAltura")
            }
            else -> println("Altura fora do limites!")
        }
    }

    fun dobrar(){
        dobrado = true
    }

    fun desdobrar(){
        dobrado = false
    }

    fun guardar(){
        alturaAtual = alturaMinima
        dobrar()
    }

    fun prontoParaGuardar(){
        when(dobrado && alturaAtual == alturaMinima){
            true -> println("O tripé pode ser guardado.")
            false -> println("O tripé não está pronto para ser guardado")
        }
    }

    fun prontoParaUsar(){
        when(!dobrado && alturaAtual > alturaMaxima/2){
            true -> println("O tripé está pronto para uso.")
            false -> println("O tripé não está pronto para ser usado")
        }
    }

}