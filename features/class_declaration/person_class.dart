main(){
    Person A = Person("A");
    Person B = Person("B");
}

class Person {
    var name;

    Person(String name) {
      this.name = name;
    }

    String present(){
        return "Yes";
    }

    String great(String other){
        return "Both ${name} and ${other}";
    }
}