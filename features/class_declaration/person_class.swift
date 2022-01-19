class Person {
    var name : String
    init(name: String) {
       self.name = name
    }
    
	func present() -> String {
        return "Yes"
    }
	
	func greet(other: String) -> String { 
		return other 
	}
}


val A = Person("A");
val B = Person("B");


