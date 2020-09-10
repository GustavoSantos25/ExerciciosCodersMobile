package digitalhouse.codigoex6

import java.util.*

fun main(){
    print("Digite 1 para ingresso normal e 2 para ingresso VIP :")
    val reader = Scanner(System.`in`)
    val escolhaDoIngresso = reader.nextInt()
    when(escolhaDoIngresso){
        1 -> {
            val ingressoNormal = Normal(50.0)
            ingressoNormal.imprime()
            ingressoNormal.imprimeValor()
        }
        2 -> {
            print("Digite 1 para Camarote Superior e 2 para Camarote Inferior: ")
            val escolhaDoCamarote = reader.nextInt()
            when(escolhaDoCamarote){
                1 -> {
                    val ingressoVIP_CS = CamaroteSuperior("J10", 100.0, 50.0)
                    println("Ingresso VIP para camarote superior")
                    ingressoVIP_CS.imprimeLocalizacao()
                    println("Valor do ingresso: ${ingressoVIP_CS.retornaValorCS()}")
                }
                2 -> {
                    val ingressoVIP_CI = CamaroteInferior("A10", 100.0)
                    println("Ingresso VIP para camarote inferior")
                    ingressoVIP_CI.imprimeLocalizacao()
                    println("Valor do ingresso: ${ingressoVIP_CI.valorIngressoVIP()}")
                }
            }
        }
    }

}