package loops

fun main() {

    //Loops in Kotlin

    //for loop
    for (i in 1..5) println(i)

    for (i in 5 downTo 1) println(i)

    for (i in 1..5 step 2) println(i)

    for (i in 5 downTo 1 step 2) println(i)

    //while loop
    var i = 1
    while (i <= 5) {
        println(i)
        i++
    }

    //do while loop
    var j = 1
    do {
        println(j)
        j++
    } while (j <= 5)

    //break and continue
    for (i in 1..5) {
        if (i == 3) {
            continue
        }
        println(i)
    }

    for (i in 1..5) {
        if (i == 3) {
            break
        }
        println(i)
    }

    println("This line will not be printed")

    //forEach
    var names = arrayOf("John", "Doe", "Jane")
    names.forEach {
        println(it)
    }

    names.forEach { name ->
        println(name)
    }

    names.forEachIndexed { index, name ->
        println("$index $name")
    }

    //forEach with break and continue
    names.forEach {
        if (it == "Doe") {
            return@forEach
        }
        println(it)
    }

    names.forEach { name ->
        if (name == "Doe") {
            return@forEach
        }
        println(name)
    }
}