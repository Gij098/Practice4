
    /*Задание 1
    * */
    fun main(args: Array<String>) {

    fun printFullName(firstName: String, lastName: String) {
        println(firstName + " " + lastName)
    }
    printFullName("Lili", "Mills")

    /*Задание 2
    * */
    val  firstName ="Lili"
    val  lastName ="Mills"
    println("$firstName $lastName")

    /*Задание 3
    * */
        fun calculateFullName(firstName:String, lastName:String): String {
        return "$firstName $lastName"

        }
        val myname:String = calculateFullName(firstName,lastName)

    /*Задание 4
    * */
    fun  calculateFullNameas(firstName:String, lastName:String): Pair<String, Int> {
        return Pair("$firstName $lastName", (firstName + lastName).length)
    }
    /*Задание 5
    * */
     fun Prime(number:Int ):Boolean {
        if (number <= 1) {
            return false
        }

        for (i in 2..<number) {
            if (number % i == 0) {
                return false
            }


        }
        return true
    }
        println(Prime(2))




}