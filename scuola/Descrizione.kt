package esercizi.scuola

interface Studente {
    val nome: String
    val cognome: String
    val corso: String

    val descrizione: String
        get() = "Nome:$nome,Cognome:$cognome,Corso:$corso"
}

class Poliziotto: Studente {
    override val nome: String = "Mario"
    override val cognome: String = "Pizza"
    override val corso: String = "polizia"
}

class Pompiere: Studente {
    override val nome: String = "Fabio"
    override val cognome: String = "Roccia"
    override val corso: String = "vigili del fuoco"
}

class Meccanica: Studente {
    override val nome: String = "Federica"
    override val cognome: String = "De Villa"
    override val corso: String = "meccanica"
}

class Soldato: Studente {
    override val nome: String = "Roberto"
    override val cognome: String = "Pallotola"
    override val corso: String = "appunti/militare"
}