

fun  sayHello(greeting:String, personsToGreet:List<String>) {
    personsToGreet.forEach { Person -> println("$greeting $Person") }
}

fun  sayHelloWithVararg(greeting:String, vararg personsToGreet: String) {
    personsToGreet.forEach { Person -> println("$greeting $Person") }
}

fun main() {
    val listOfPersons = listOf<String>("A1", "A2", "A3")
    val listOfPersons2 = arrayOf("C1", "C2")

    sayHello("Hi", listOfPersons)

sayHelloWithVararg("Hello", "B1", "B2")

    sayHelloWithVararg("Hallow", *listOfPersons2)


}
