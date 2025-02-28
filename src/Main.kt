//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*
    En una alcancía es posible guardar monedas de las siguientes denominaciones: $20, $50, $100, $200 y $500, no se guardan ni billetes ni monedas de otras denominaciones. Al dueño de la alcancía le parece muy útil conocer cuánto tiene en la alcancía sin necesidad de romperla, es más, él quiere conocer cuántas monedas tiene en cada denominación para así romper la alcancía sólo cuando quiera disponer de todo su dinero ahorrado.
    Se quiere un programa que ilustre el manejo de la alcancía. El programa debe permitir (1) agregar una moneda de una de las denominaciones indicadas, (2) contar cuántas monedas tiene de cada denominación, (3) calcular el total de dinero ahorrado, (4) romper la alcancía vaciando su contenido

    */

    var opcion =0
    var moneda20=20
    var moneda50=50
    var moneda100=100
    var moneda200=200
    var moneda500=500
    var cantidad20=0
    var cantidad50=0
    var cantidad100=0
    var cantidad200=0
    var cantidad500=0
    var total=0


    do {

        print(
            """ingrese una opcion
        1 ingresar monedas
        2 visualizar monedas
        3 total ahorrado 
        4 sacar dinero
        5 salir
        """
        )
        val menu = readln().toInt()
        when (menu) {
            1 -> {

                println("""
                    moneda a ingresar
                    1=20
                    2=50
                    3=100
                    4=200
                    5=500
                    
                    """)
                val valor_moneda= readln().toInt()
                println("ingrese la cantidad (=")
                val cantidad = readln().toInt()
                when(valor_moneda){
                    1-> {
                        println("ingrese la cantidad de 20")
                        cantidad20 += cantidad


                    }
                    2-> {
                        println("ingrese la cantidad de 50")
                        cantidad50 += cantidad

                    }
                    3-> {
                        println("ingrese la cantidad de 100")
                        cantidad100+= cantidad
                    }
                    4-> {
                        println("ingrese la cantidad de 200")
                        cantidad200+= cantidad
                    }
                    5-> {
                        println("ingrese la cantidad de 500")
                        cantidad500+= cantidad
                    }
                    else -> println("opcion no valida")
                }
            }
            2-> {
                println("la cantidad de monedas ingresadas es: ")
                println("monedas de 20: $cantidad20")
                println("monedas de 50: $cantidad50")
                println("monedas de 100: $cantidad100")
                println("monedas de 200: $cantidad200")
                println("monedas de 500 $cantidad500")
            }
            3 -> {

                total=(cantidad20*moneda20)+(cantidad50*moneda50)+(cantidad100*moneda100)+(cantidad200*moneda200)+(cantidad500*moneda500)
                println("El total ahorrado es de: $total")
            }
            4->{
                println("se ha roto la alcancia 💵💵")
                cantidad20=0
                cantidad50=0
                cantidad100=0
                cantidad200=0
                cantidad500=0
                total=0
            }
            5-> println("Saliendo del programa ")
            else -> println("ingrese una opcion valida")
        }
    }while (menu!=5)
}