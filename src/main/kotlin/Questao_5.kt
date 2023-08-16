fun main() {
    val s:Any = "Judilena"
    println (s as String) //converte para string
    println (s as? Int) //tenta converter para inteiro(não convete pois o s esta sendo tratado como string)
    if(s is String){
        println("$s é uma String")
    }
}