class Person {
    // Access specifier
    public:
 
    // Data Members
    string name;
 
    string greet(string other) { return other; }
	
    string present() {
       return "Yes";
    }
};
 
int main() { 
    // Declare an object of class geeks
    Person b;
	Person a;
	 
    // accessing data member
    b.name = "B";
	a.name = "A";
 		
    return 0;
}