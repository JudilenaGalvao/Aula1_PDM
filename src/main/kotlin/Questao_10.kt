class Carro1(val nome:String){
    var ano:Int = 0

    constructor(x:String, y:Int):this(x){
        this.ano = y
    }

    override fun toString() = "Carro ${nome}(${ano})"
}

fun main() {
    var c1:Carro1
    c1 = Carro1("Corsa", 1999)
    println(c1)
    println(c1.nome)
}