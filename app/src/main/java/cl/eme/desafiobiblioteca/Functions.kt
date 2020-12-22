package cl.eme.desafiobiblioteca


/*
● Nombre del libro.
● ISBN.
● Año publicación
● Editorial
● Cantidad de páginas
● Precio
● Autor del libro
● Tipo de libro (D: Digital / I: Impreso)
 */
fun formatPrice(pPrice: Int): String {

    return "$$pPrice"
}

fun Book.printBook() {
    println(
        "Title: $title \n ISBN: $isbn \n Year: $yearPub \n Publisher: $publisher \n Pages: $numPages \n Price: ${
            formatPrice(
                price
            )
        } \n  Author: $author \n Book Type: $bookType"

    )
    println("---------------------------------------------------------------")

}