fun main(){

    //data type in Kotlin
    var name = "John Doe"
    var age: Int = 20
    var height: Double = 1.65
    var weight: Float = 53.5f
    var gender: Char = 'M'
    var isStudent: Boolean = true

    println("My name is $name")
    println("I'm $age years old")
    println("I'm $height m tall")
    println("I'm $weight kg")
    println("I'm $gender")
    if (isStudent) {
        println("I'm a student")
    }else{
        println("I'm not a student")
    }


    //any data type is a super type of all types in Kotlin
    var number: Any= 10

    println("Number is $number".uppercase())
}