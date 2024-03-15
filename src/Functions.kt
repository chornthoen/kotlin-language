fun main() {
    sayHello()
    myName("John Doe", 20, "Student") //function call with arguments
    myName(age = 25, name = "Jane Doe", type = "Teacher") //function call with named arguments
    myDefaultArgument("John Doe", 20) //function call with default arguments

    myFunction(
        values = "12345",
        text = {
            println("This is my function")

        }

    )
    myFunction {
        println("This is my function")
    }
    val total = add(10, 20)
    println("A + B : $total")

    val (sum, sub) = addSub(10, 20)
    println("A + B : $sum")
    println("A - B : $sub")

    val (name, age) = myPair()
    println("Name: $name")
    println("Age: $age")

    val (v1, v2, v3) = myTriple()
    println("Name: $v1")
    println("Age: $v2")
    println("Rules: $v3")

}

//function no parameters and no return type
fun sayHello() {
    println("Hello Kotlin!")

}

//function: parameters and arguments no return type
fun myName(name: String, age: Int, type: Any) {
    println("My name is $name")
    println("I'm $age years old")
    println("I'm $type")
}

//default arguments
fun myDefaultArgument(name: String, age: Int, type: Any = "Student") {
    println("My name is $name")
    println("I'm $age years old")
    println("I'm $type")
}

//function as arguments
fun myFunction(values: String = "", text: () -> Unit = {}) {
    println("This is my function as an argument")
    println("Values: $values")
    text()
}

//function with return type
fun add(a: Int, b: Int): Int {
    val sum = a + b
    return sum
}

//function return multiple values
fun addSub(a: Int, b: Int): Pair<Int, Int> {
    val sum = a + b
    val sub = a - b
    return Pair(sum, sub)
}

fun myPair(): Pair<String, Int> {
    return Pair("John", 29)
}

fun myTriple(): Triple<String, Int, String> { //return type is Triple is three values
    return Triple("John", 28, "Student")
}
