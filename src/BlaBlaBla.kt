
val name: String = "Vova"
var greeting: String? = null
val greeting4: String = "Good morning"

fun main() {

  val greeting2 = if (greeting !=null) greeting else "Hi"
    println(greeting2 + " $name " + name)

    var greeting3: String? = null
    if (greeting ==null) {
        greeting3 = "hello"
    }
    else greeting3 = greeting4

    println(greeting3 + name)
}