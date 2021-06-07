import kotlin.random.Random
fun main(args: Array<String>) {


    val Ejercicio2 = Ejercicio2(10){
        Random.nextInt(50,250)
    }
    Ejercicio2.array.forEach { println(it) }





}
