class Carro(val nome:String, val ano:Int){

    override fun toString() = "Carro ${nome}(${ano})"
}

fun main() {
    var c1:Carro
    c1 = Carro("Corsa", 1999)
    println(c1)
    println(c1.nome)
}