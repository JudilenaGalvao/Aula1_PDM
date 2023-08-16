fun main() {
    val s:Any = "Judilena"
    if(s is String){
        println("Quantidade: ${s.length}")
    }else{
        println("não é String")
    }
}