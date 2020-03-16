
fun sayHello1(var1:String, var2:String) = println("$var1$var2")

fun sayHello2(var3:String, var4:String) {
    val msg = var3 + var4
    println(msg)
}

fun main() {

sayHello1("Hello", " Oleksandr")

    sayHello2("Good Day", " Oleksandr")
}