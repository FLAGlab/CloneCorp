public class Person {

	public static void main(String[] args) {
		Person a = new Person("A");
		Person b = new Person("B");
	}
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
    public String present() {
        return "Yes";
    }
	
	public String greet(String other) {  return other;  }
}