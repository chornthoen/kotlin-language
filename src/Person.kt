class Person(
    var name: String, //property (data member)
    var age: Int //property (data member)
) {

    //method to display the values


    fun display() {
        println("Name: $name")
        println("Age: $age")
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }


}