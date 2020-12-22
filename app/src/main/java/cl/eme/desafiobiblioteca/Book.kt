package cl.eme.desafiobiblioteca

/*
[X] Los datos que deben almacenar son:
[X] Nombre del libro.
[X] ISBN.
[X] Año publicación
[X] Editorial
[X] Cantidad de páginas
[X] Precio
[X] Autor del libro
[X] Tipo de libro (D: Digital / I: Impreso)
 */
data class Book(val title:String,
                val isbn:String,
                val yearPub:Int,
                val publisher: String,
                val numPages: Int,
                val price:Int,
                val author:String,
                val bookType:BookType
)

sealed class BookType
class Printed:BookType(){
    override fun toString(): String {
        return "I"
    }
}
class Digital:BookType(){
    override fun toString(): String {
        return "D"
    }
}