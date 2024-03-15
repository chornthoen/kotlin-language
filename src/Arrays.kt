
fun main(){

    //Arrays in Kotlin

    //arrayOf() is used to create an array
    var names = arrayOf("John","Doe","Jane")

    println(names[0])
    println(names[1])
    println(names[2])

    for (name in names){
        println(name)
    }
    if ("John" in names){
        println("John is in the array")
    }else{
        println("John is not in the array")
    }

    println(names.contentToString())

    //arrayOfNulls() is used to create an array of nulls
    var nulls = arrayOfNulls<String>(3)
    nulls[0] = "John"
    println(nulls.contentToString())

    //arrayListOf() is used to create an array list
    var fruits = arrayListOf("Apple","Banana","Orange")
    println(fruits[0])
    println(fruits[1])
    println(fruits[2])

    for (fruit in fruits){
        println(fruit)
    }

    if ("Apple" in fruits){
        println("Apple is in the array")

    }else{
        println("Apple is not in the array")
    }

    println(fruits)

    

}