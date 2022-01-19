class Person {
    // Access specifier
    public:
 
    // Data Members
    string name;
 
    // Member Functions()
    string present() {
       return "Yes";
    }
	
	string greet(string other) {
		return other;
	}
};
 
int main() { 
    // Declare an object of class geeks
    Person a;
	Person b;
 
    // accessing data member
    a.name = "A";
 	b.name = "B";
	
    return 0;
}