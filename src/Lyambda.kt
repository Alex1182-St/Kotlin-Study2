


//лямбда или анонимные методы(функции)
fun main () {

    val perimeter: (Int, Int) -> Int = {a,b -> (a+b)*2}
    println(perimeter(5, 10))

    val sayHello: (String) -> Unit = {a -> println("Прювет, $a") }
    sayHello ("Заиц")

}