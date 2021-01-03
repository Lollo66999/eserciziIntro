package esercizi.scuola

fun main() {
    val persona1: Studente = Poliziotto()
    val persona2: Studente = Pompiere()
    val persona3: Studente = Meccanica()
    val persona4: Studente = Soldato()

    println(persona1.descrizione)
    println(persona2.descrizione)
    println(persona3.descrizione)
    println(persona4.descrizione)
}