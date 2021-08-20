package ObjectsAndClasses.Exercise;

public class Person {

    String name;
    int age;

    //конструктор който прави обект от този клас
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
//
    public String getName() {
        return name;
    }
//validira
    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(String name, int age) {
        return age;
    }
}
