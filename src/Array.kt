
fun sayHelloo1(var1:String, var2:String) = println("$var1  $var2")
fun sayHelloo3(var1:String, var2:String) = println(var1 + "h- h -h" + var2)

fun sayHelloo2(var3:String, var4:String) {
    val msg = var3 + var4
    println(msg)
}


fun main() {

    val customer = Customer()
    val dsfdsf = customer.print()
    println(dsfdsf)


    val var5:String? = "Var5"
    val var6:String? = "Var6"

    val var7:String = "Var5"
    val var8:String = "Var6"

    val var9: String

    sayHelloo2(var7, var8)
    sayHelloo1("ghgfhgf", "jhgjgh")
    sayHelloo3("kll", "hlk")


val ourArray = arrayOf(var5,var6, "hello")
    println(ourArray.size)
    println(ourArray.get(2))
    println(ourArray[0])


    for (element in ourArray) {  // ЗАПАМ'ЯТАТИ ЦЕ
     println("allArrayElement - " + element)
    }

    ourArray.forEachIndexed {indexOfElementInArray, element -> println("$element is at index $indexOfElementInArray")
    }
    ourArray.forEachIndexed {indexOfelementInArray, element -> println(element) } // indexOfelementInArray - те ж саме, що й "і" в циклі, в Ява

    for (i in ourArray.indices) {
        println(ourArray[i])
    }

    for (x in 1..5)
        print(x)

}




