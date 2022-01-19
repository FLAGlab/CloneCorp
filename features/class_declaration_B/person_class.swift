class Person {
    var name : String
    
	init(name: String) {
       self.name = name
    }
    
	func greet(other: String) -> String { return other }
	
	func present() -> String {
        return "Yes"
    }
	
}

val B = Person("B");
val A = Person("A");



