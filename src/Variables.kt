//const is used to declare a compile-time constant
const val PI = 3.14159
fun main() {

    // Variables in Kotlin
    // val is used to declare a read-only variable
    // var is used to declare a mutable variable
    val name = "John Doe"
    var age = 20

    // name = "Dara" // -> error
    age = 21 // -> ok

    println("My name is $name")
    println("I'm $age years old")
}