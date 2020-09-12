package digitalhouse.exInterface

class RegistroRecebimentos {
    val RegistroRecebimentos = mutableListOf<IRecebivel>()

    fun adicionarRecebimentos(vararg r: IRecebivel) = r.forEach { RegistroRecebimentos.add(it) }

    fun apresentarRecebimentos() = RegistroRecebimentos.forEach { println(it.toString()) }
}