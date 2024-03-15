fun main(){

    //ListOf() is used to create a list
    var names = listOf("John","Doe","Jane")

    println(names)

    var list: List<String> = listOf("John","Doe","Jane")


    println(list.size)
    println(list)
    for (name in list) println(name)


    //mutableListOf() is used to create a mutable list
    var fruits = mutableListOf("Apple","Banana","Orange")
    var fruitsAnys: MutableList<Any> = mutableListOf("Apple","Banana","Orange" , 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    fruits.add("Mango")
    fruits.add(1,"Pineapple")
    fruits.remove("Banana")
    fruits.removeAt(0)
    println(fruits.first())
    println(fruits.last())

    println(fruits)
    println(fruitsAnys)
}