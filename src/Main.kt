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
    var catidad50=0
    var cantidad100=0
    var cantidad200=0
    var cantidad500=0
    var total=0

    var canti20=0
    var canti50=0
    var canti100=0
    var canti200=0
    var canti500=0

    do {

        print(
            """ingrese una opcion
        1 ingresar monedas
        2 visualizar monedas
        3 sacar el dinero 
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
                when(valor_moneda){
                    1-> {
                        println("ingrese la cantidad de 20")
                        var canti20= readln().toInt()
                        cantidad20= cantidad20+canti20
                        //var total20=(canti20*20)

                    }
                    2-> {
                        println("ingrese la cantidad de 50")
                        var canti50= readln().toInt()

                    }
                    3-> {
                        println("ingrese la cantidad de 100")
                        var canti100= readln().toInt()
                    }
                    4-> {
                        println("ingrese la cantidad de 200")
                        var canti200= readln().toInt()
                    }
                    5-> {
                        println("ingrese la cantidad de 500")
                        var canti500= readln().toInt()
                    }
                }
            }
            2-> {
                var cantidad20= (canti20*moneda20)
                println("tiene"+cantidad20)
                println("tiene"+canti20)
            }
            3 -> {print("")
            }

            else -> println("ingrese una opcion valida")
        }
    }while (menu!=4)
}