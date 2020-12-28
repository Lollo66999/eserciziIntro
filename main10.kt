package appunti

fun main() {
    val voto: Int
    voto= 9

    when(voto) {
        1,2,3,4,5 -> print ("Insufficente")
        6,7,8,9 -> print ("Sufficente")
        10 -> print ("Massimo")
    }
}