
fun main() {
    val libros = mutableListOf(
        Libro("El Alquimista", "Paulo Coelho", "123456789", 208, 20000.0, 5),
        Libro("El Principito", "Antoine de Saint-Exupéry", "987654321", 96, 20000.0, 3)
    )

    while (true) {
        println("\nMenú:")
        println("1. Ver libros")
        println("2. Prestar libro")
        println("3. Devolver libro")
        println("4. Salir")
        print("Opción: ")

        when (readLine()?.toIntOrNull()) {
            1 -> libros.forEach { println(it.mostrarInformacion()) }
            2 -> {
                print("Título del libro: ")
                val tituloIngresado = readLine()
                libros.find { it.titulo.equals(tituloIngresado, ignoreCase = true) }
                    ?.prestarLibro() ?: println("Libro no encontrado.")
            }
            3 -> {
                print("Título del libro: ")
                val tituloIngresado = readLine()
                libros.find { it.titulo.equals(tituloIngresado, ignoreCase = true) }
                    ?.devolverLibro() ?: println("Libro no encontrado.")
            }
            4 -> {
                println("Adiós.")
                break
            }
            else -> println("Opción inválida.")
        }
    }
}
