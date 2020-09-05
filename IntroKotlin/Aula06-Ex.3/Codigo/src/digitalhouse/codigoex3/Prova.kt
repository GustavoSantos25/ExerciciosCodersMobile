package digitalhouse.codigoex3

class Prova(
        var dificuldade: Int,
        var energiaNecessaria: Int
) {
    fun podeFazer(atleta: Atleta) : Boolean{
        return (atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria)
    }
}