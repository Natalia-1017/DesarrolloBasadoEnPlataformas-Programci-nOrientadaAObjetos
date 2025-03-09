class Libro(
    val titulo: String,
    val autor: String,
    val isbn: String,
    val numeroPaginas: Int,
    val precio: Double,
    var cantidadDisponible: Int
) {

    constructor() : this("", "", "", 0, 0.0, 0)

    fun prestarLibro(): Boolean {
        return if (cantidadDisponible > 0) {
            cantidadDisponible--
            println("Prestamo exitoso.")
            true
        } else {
            println("No disponible.")
            false
        }
    }

    fun devolverLibro(): Int {
        cantidadDisponible++
        println("Devuelto con éxito.")
        return cantidadDisponible
    }

    fun mostrarInformacion(): String {
        return "Título: $titulo, Autor: $autor, ISBN: $isbn, Páginas: $numeroPaginas, Precio: $$precio, Disponibles: $cantidadDisponible"
    }
}