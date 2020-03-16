class Lyambda2 {

    //лямбда или анонимные методы(функции)

    val perimeter: (Int, Int) -> Int = {a,b -> (a+b)*2}

    var sayHello: (String) -> Unit = {a -> println("Прювет, $a") }

    fun functionPlus (a: Int, b: Int): Int {
        return a+b

    }

}