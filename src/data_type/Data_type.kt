package data_type

fun main() {

    //data type in Kotlin
    val name = "John Doe"
    val age: Int = 20
    val height: Double = 1.65
    val weight: Float = 53.5f
    val gender: Char = 'M'
    val isStudent: Boolean = true

    println("My name is $name")
    println("I'm $age years old")
    println("I'm $height m tall")
    println("I'm $weight kg")
    println("I'm $gender")
    if (isStudent) {
        println("I'm a student")
    } else {
        println("I'm not a student")
    }


    //any data type is a super type of all types in Kotlin
    val number: Any = 10

    println("Number is $number".uppercase())
}