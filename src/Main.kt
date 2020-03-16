
val hello: String = "Hello"
var exclamationMark: String = "!"
var mark: String? = "mark"

fun main () {

    val name: String = "Oleksandr"
    val surname: String = "Stepaniuk"
    println(hello + " " + name + " " + surname + exclamationMark)

    exclamationMark = "!!"
    println(hello + " " + name + " " + surname + exclamationMark)
    println(name + " " + surname + exclamationMark)

    println(mark)
    mark = null
    println(mark)

    var exclamationMark: String = "!"
    println(name + " " + surname + exclamationMark)

    if (exclamationMark != "!"){
        println("exclamationMark has been changed")}
        else {
            println("exclamationMark has been changed")
        }
    }


