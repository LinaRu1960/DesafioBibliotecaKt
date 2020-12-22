package cl.eme.desafiobiblioteca

fun main(){
    var book1=Book("Orgullo y Prejuicio","9788415618782",2018,"Alma",448,11800,"Jane Austen",Printed())
    var book2=Book("Las Actas Secretas del Club de la Lengua de Vaca","9789567210398",2008,"Cerro Huelén",180,5500,"Sergio Mardones",Digital())
    var book3=Book("El Silencio de los Malditos","9789569585456",2018,"Penguin Random House",384,12000,"Carlos Pinto",Printed())
    val book4=Book("Las 25 Sombras de Grey","01234567899",2020,"Another Books",125,900,"Sasha Grey",Printed())

    val listOfBooks=listOf(book1,book2,book3,book4)

    for (book:Book in listOfBooks){
        book.printBook()
    }


}