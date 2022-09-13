fun main() {
    menu()
}

fun menu() {
    do {
        println(
            """
        Seleccione una opción:
            1.Tabla de multiplicar.
            2.Comprobar email.
            3.Comprobar DNI.
            4.Comprobar tarjeta de crédito
            5.Salir
    """.trimIndent()
        )
        print("Opcion: ")
        var opcion = readln().toInt()
        when (opcion) {
            1 -> {
                print("Dame un número: ")
                val num: Int = readln().toInt()

                println("Rango del 1 a $num")
                for (i in 1..num step 2)
                    print("$i-")
                println()

                println("Tabla de multiplicar")
                for (i in 1..10) {
                    val mult: Int = num * i
                    println("$num * $i = $mult")
                }
            }

            2 -> {
                val regex = "^[a-z0-9]+@[a-z]+\\.[a-z]{2,3}".toRegex()//texto@texto.texto
                do {
                    println("Dame un email válido:")
                    val email = readln()
                    val correo = email.matches(regex)
                } while (!correo)
            }

            3 -> {
                val regex = "^[0-9]{7,8}[A-Za-z]".toRegex()//8 dígitos y una letra
                do {
                    println("Dame un DNI válido:")
                    val dni = readln()
                    val validar = dni.matches(regex)
                } while (!validar)
            }

            4 -> {
                val regex = "^4[0-9]{12}(?:[0-9]{3})?\$".toRegex()//16 dígitos
                do {
                    println("Dame un tarjeta válida:")
                    val tarjeta = readln()
                    val validar = tarjeta.matches(regex)
                } while (!validar)
            }

            5 -> println("Adiós")
        }
    } while (opcion != 5)

}