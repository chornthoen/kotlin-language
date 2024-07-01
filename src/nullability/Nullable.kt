package nullability

fun main() {


    var text: String? = "Hello"
//    text = null // this is ok

    var text2: String = "Hello"
    // text2 = null // this is not ok

    println("Text: ${text?.uppercase()}")

    println("Text2: $text2")
}
