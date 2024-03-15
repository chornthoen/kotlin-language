import kotlin.math.PI
import kotlin.math.max
import kotlin.math.min
fun main(){

    //Arithmetic Operators
    val a = 20
    val b = 10

    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")

    //Math in Kotlin
    println("Math PI = $PI")
    println("Max of a and b is ${max(a, b)}")
    println("Min of a and b is ${min(a, b)}")

    //Assignment Operators (--, ++, +=, -=, *=, /=, %=)

    var x = 10
    x++ // or x += 1, x = x + 1
    println("x ++ = $x")

    x-- // or x -= 1, x = x - 1
    println("x -- = $x")

    x += 5 // x = x + 5
    println("x += 5 = $x")

    x -= 5 // x = x - 5
    println("x -= 5 = $x")

    x *= 5 // x = x * 5

    println("x *= 5 = $x")

    x /= 5 // x = x / 5

    println("x /= 5 = $x")
}