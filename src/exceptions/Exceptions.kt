package exceptions

fun main() {
    val a = 10
    val b = 0

    try {
        val result = a / b
        println("Result: $result")
    } catch (e: ArithmeticException) {
        println("Exception: ${e.message}")
    } finally {
        println("Finally block")
    }
}