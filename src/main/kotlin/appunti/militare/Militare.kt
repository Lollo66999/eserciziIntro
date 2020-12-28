package appunti.militare

abstract class Militare(var nome: String, var cognome: String, var arma: String) {
    val descrizione: String
        get() = "$nome $cognome, arma principlae $arma"
}