import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*
    Crea el juego “Apuesta y gana”. El usuario debe introducir inicialmente una cantidad de dinero.
    A continuación aparecerá por pantalla un numero de forma aleatoria. Si sale un 3, el usuario pierde
    todo su dinero y termina el juego. Si sale 2, el usuario pierde la mitad del dinero y puede seguir jugando con esa cantidad
     o puede dejar de jugar. Si sale el 1, el usuario multiplica por dos su dinero y puede seguir jugando con esa cantidad o
     puede dejarde jugar
    * */
    println(""""
            Bienvenido 
            Ingrese la cantidad dinero que desea apostar
    
        """.trimMargin())
    var cantidad= readln().toInt()
    var continuar=1
    do{
        val random= Random.nextInt(1,4)
        if(random==1){
            println("Felicidades, su dinero se ha multiplicado")
            cantidad*=2
            println("su dinero es $cantidad")
        }
        if (random==2){
            println("Ha perdido la mitad del dinero")
            cantidad/=2
            println("su dinero es: $cantidad")

        }
        if(random==3){
            cantidad =0
            println("Ha perdido su dinero )=")
            continuar==0
            break
        }
        if (cantidad>0){
            println(""""
                |¿Quiere seguir jugando?
                |1 Si
                |2 No 
                |""".trimMargin())
            continuar= readln().toInt()
        } else  {
            continuar==2
        }
    } while (continuar==1)
    println("Ha finalizado el juego su total es de $cantidad")

}