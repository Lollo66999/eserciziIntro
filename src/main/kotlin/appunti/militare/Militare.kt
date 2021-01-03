package appunti.militare

abstract class Militare(var nome: String, var cognome: String, var sesso: String, var arma: String) {
    val descrizione
        get() = "$nome $cognome, $sesso, arma principlae $arma"
}