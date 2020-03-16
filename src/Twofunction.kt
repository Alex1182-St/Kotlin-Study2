fun  getGreeting(): String {
    return  "Hello !!"
}

fun  getGreetingVoid(): Unit {
    println("Hello Void!")
}


fun main () {
    println(getGreetingVoid())

    println(" ")
    getGreetingVoid()
    println(getGreeting())
}