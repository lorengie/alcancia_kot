import java.util.*
fun main() {
   /* Un edificio tiene un sistema de control de acceso basado en identificaciones.
    Requisitos:
    •	Pedir al usuario que ingrese su código de acceso.
    •	Los códigos válidos son del 1000 al 1999 (empleados) y del 2000 al 2999 (visitantes).
    •	Si el código es incorrecto 3 veces seguidas, bloquear el acceso.
    •	Si es un empleado, mostrar un mensaje personalizado con su ID.
    •	Si es un visitante, registrar su nombre y motivo de visita antes de ingresa
    */

    val scanner= Scanner(System.`in`)
    var intentos =0;
    var codigo:Int

    while (intentos<3){
        println("Bienvenid@, ingrese su codigo para acceder")
        codigo=scanner.nextInt()
        scanner.nextLine()
        if(codigo in 1000..1999){
            println("Acceso exitoso, Bienvenido, ID= ${codigo}")
        }else if (codigo in 2000 ..2999){
            println("Ingrese su nombre")
            var nomae= scanner.nextLine()
            println("Cual es el motivo de su visita?")
            var motivo = scanner.nextLine()
            println("Bienvenido, acceso valido ${nomae}, motivo de visita = ${motivo}")
        }else{
            intentos++
            val intentosrest = 3 - intentos
            println("Codigo invalido, tiene $intentosrest Intentos")
        }
    }
    println("Acceso Bloqueado")

}
