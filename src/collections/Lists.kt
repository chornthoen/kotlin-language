package collections

fun main() {

    //ListOf() is used to create a list
    val names = listOf("John", "Doe", "Jane")

    println(names)

    var newName = names + "Thoen"
    println(newName)

    //setOf() is used to create a set
    val namesSet = setOf("John", "Doe", "Jane")
    println(namesSet)

    //mutableSetOf() is used to create a mutable set
    var namesMutableSet = mutableSetOf("John", "Doe", "Jane")
    namesMutableSet.add("Thoen")
    namesMutableSet.add("Doe")
    println(namesMutableSet)

    //mapOf() is used to create a map
    val namesMap = mapOf(1 to "John", 2 to "Doe", 3 to "Jane")
    println(namesMap)
    //add new key value
    val newNamesMap = namesMap + (4 to "Thoen")
    println(newNamesMap)

    println(namesMap[1])


    val list: List<String> = listOf("John", "Doe", "Jane")


    println(list.size)
    println(list)
    for (name in list) println(name)


    //mutableListOf() is used to create a mutable list
    var fruits = mutableListOf("Apple", "Banana", "Orange")
    var fruitsAnys: MutableList<Any> = mutableListOf("Apple", "Banana", "Orange", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    fruits.add("Mango")
    fruits.add(1, "Pineapple")
    fruits.remove("Banana")
    fruits.removeAt(0)
    println(fruits.first())
    println(fruits.last())

    println(fruits)
    println(fruitsAnys)

    val l = listOf("A", "B")
    val l2 = listOf("D")
    print(l + "C" + l2)
    print(l)
}