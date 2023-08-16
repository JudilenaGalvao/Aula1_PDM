open class Veiculo(val modelo: String, val ano: Int) {
    open fun acelerar() = println("Veiculo acelerando....")
}

class Carro2(val cor: String, modelo: String, ano: Int) : Veiculo(modelo, ano) {

    override fun acelerar() = println("Carro acelerando....")

    override fun toString(): String {
        return "Carro(cor='$cor', modelo='$modelo', ano=$ano)"
    }
}

fun main() {
    val c1: Carro2 = Carro2("Roxo", "Corsa", 1999)
    println(c1)
}