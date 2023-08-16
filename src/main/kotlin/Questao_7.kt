fun parOuImpar(i : Int): String{
    return(if(i % 2 == 0) "Par" else "impar")
}

fun main() {
    println(parOuImpar(1))
    println(parOuImpar(2))
}