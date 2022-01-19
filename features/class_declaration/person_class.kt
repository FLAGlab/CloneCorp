fun main(args: Array<String>) {
    Person A = Person("A");
    Person B = Person("B");
}

class Person(val name: String){
    fun present() = "Yes";
    fun greet(other: String) = other;
}