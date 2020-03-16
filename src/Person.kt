class Person (val namePerson: String, val surnamePerson:String) // Конструктор
{
   /*
    val namePerson: String = _namePerson  // Щоб не писати init
    val surnamePerson: String = _surnamePerson
*/
// або
 /*
    init {
        namePerson = _namePerson
        surnamePerson = _surnamePerson
    }
*/

    constructor(): this("S", "T") // secondary constructor
    {
        println("secondary constructor")}

    init {
        println("init1")
    }

    init {
        println("init2")
    }


}