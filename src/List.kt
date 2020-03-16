
fun sayHellooo(greeting:String, listOfThings:List<String>) {
    listOfThings.forEach { listOfThings -> println("$greeting $listOfThings") }
}

fun main() {

val ourList = mutableListOf<String>("varian1", "variant2", "variant3")

    sayHellooo("Hi", ourList)

}