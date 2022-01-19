main(){
    Person A = Person("A");
    Person B = Person("B")
}

class Person{
    Car(String name) {
      this.name = name;
    }

    String present(){
        return "Yes";
    }

    void great(String other){
        return other;
    }
}