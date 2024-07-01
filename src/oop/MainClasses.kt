package oop

import oop.classes.Person

fun main() {
    val p = Person(name = "John Doe", age = 20)
    val p2 = Person("Jane Doe", 25)
    val p3 = Person("David Smith", 30)

    p.inFoPerson(person = p)
    p.inFoPerson(person = p2)
    p.inFoPerson(person = p3)

    p.changeName(newName = "Chorn Thoen")
    p.changeAge(newAge = 21)
    p.inFoPerson(person = p)

}
