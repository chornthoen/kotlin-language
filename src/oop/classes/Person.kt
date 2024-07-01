package oop.classes

class Person(
    var name: String, //property (data member)
    var age: Int //property (data member)
) {

    //method to display the values
    fun display() {
        println("My name is $name. I'm $age years old")
    }

    fun inFoPerson(person: Person) {
        println("My name is ${person.name}. I'm ${person.age} years old")
    }

    fun changeName(newName: String) {
        name = newName
    }

    fun changeAge(newAge: Int) {
        age = newAge
    }

    override fun toString(): String {
        return "oop.models.Person(name='$name', age=$age)"
    }

}