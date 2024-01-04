class Person(private val name: String){
    fun present() : String = "Yes"
    fun greet(other: String) : String {
        return "Both $name and $other"
    }
}

fun main(args: Array<String>) {
    val A = Person("A")
    val B = Person("B")
}
