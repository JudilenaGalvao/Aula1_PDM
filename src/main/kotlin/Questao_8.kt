fun enviarEmail(usuario:String, titulo:String?=null): String{
    val s = titulo?: "Bem vindo"
    return "$s $usuario"
}

fun main() {
    println(enviarEmail("judilena"))
    println(enviarEmail("judilena", "Welcome"))
}
