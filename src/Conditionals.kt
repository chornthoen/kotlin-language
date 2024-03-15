
fun main(){
    var isStudent: Boolean = false
    var isEmployee: Boolean = false

    println(isEmployee && isStudent)

    //logical in Kotlin
    // &&, ||, !
    if (isStudent && isEmployee) {
        println("I'm a student and an employee")
    }else if (isStudent || isEmployee) {
        println("I'm either a student or an employee")
    }else{
        println("I'm neither a student nor an employee")
    }

    //comparison in Kotlin
    val a = 20
    val b = 10
    // ==, !=, >, <, >=, <=
    if (a > b) {
        println("a is greater than b")
    }else if (a < b) {
        println("a is less than b")
    }else if (a == b) {
        println("a is equal to b")
    }else if (a != b) {
        println("a is not equal to b")
    }else if (a >= b) {
        println("a is greater than or equal to b")
    }else if (a <= b) {
        println("a is less than or equal to b")
    } else {
        println("Invalid")
    }

    var isTall: Boolean = true
    var v = if (isTall) "I'm tall" else "I'm short"
    println(v)


    var x = if (a > b) "a is greater than b"
    else if (a < b) "a is less than b"
    else if (a == b) "a is equal to b"
    else if (a != b) "a is not equal to b"
    else if (a >= b) "a is greater than or equal to b"
    else if (a <= b) "a is less than or equal to b"
    else "Invalid"
    println(x)

    //when in Kotlin
    var y = when{
        a > b -> "a is greater than b"
        a < b -> "a is less than b"
        a == b -> "a is equal to b"
        a != b -> "a is not equal to b"
        a >= b -> "a is greater than or equal to b"
        a <= b -> "a is less than or equal to b"
        else -> "Invalid"
    }
    println(y)

    val age = 20

    when(age){

        in 0..17 -> println("You're a minor") // 0..17 is a range

        in 18..59 -> println("You're an adult") // 18..59 is a range

        in 60..100 -> println("You're a senior") // 60..100 is a range

        else -> println("Invalid age")
    }


}