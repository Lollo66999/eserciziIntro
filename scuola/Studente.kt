package esercizi.scuola

fun main() {
    val persona1: Studente = Poliziotto()
    val persona2: Studente = Pompiere()
    val persona3: Studente = Meccanica()
    val persona4: Studente = Soldato()

    print(persona1.descrizione)
}