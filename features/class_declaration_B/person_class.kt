class Person(val name: String){
    fun present(){
        return "Yes";
    }
    fun greet(other: String){
        return  other;
    }
}

fun main(args: Array<String>) {
    Person A = Person("A");
    Person B = Person("B");
}