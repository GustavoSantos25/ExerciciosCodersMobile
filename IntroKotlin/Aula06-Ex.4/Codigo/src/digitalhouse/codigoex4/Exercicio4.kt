package digitalhouse.codigoex4

fun main(){
    val tripe = Tripe(true, 10, 100, 10)

    // usando normalmente sem problemas
    println("Caso 1:")
    tripe.desdobrar()
    tripe.definirAltura(55)
    tripe.prontoParaUsar()
    tripe.guardar()
    tripe.prontoParaGuardar()

    //colocando altura indesejada
    println()
    println("Caso 2:")
    tripe.desdobrar()
    tripe.definirAltura(120)
    tripe.definirAltura(5)
    tripe.guardar()
    tripe.prontoParaGuardar()

    //usando tripe indevidamente
    println()
    println("Caso 3:")
    tripe.definirAltura(60)
    tripe.prontoParaUsar()
    tripe.desdobrar()
    tripe.definirAltura(40)
    tripe.prontoParaUsar()
    tripe.guardar()
    tripe.prontoParaGuardar()

    //tentando guardar tripe de forma errada
    println()
    println("Caso 4:")
    tripe.desdobrar()
    tripe.definirAltura(20)
    tripe.prontoParaGuardar()
    tripe.dobrar()
    tripe.prontoParaGuardar()
    tripe.desdobrar()
    tripe.definirAltura(10)
    tripe.prontoParaGuardar()
    tripe.guardar()
    tripe.prontoParaGuardar()



}