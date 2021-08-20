package ObjectsAndClasses.E03Peorson;

public class Person {
    //полета-характеристики
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    //конструктор
    public Person(String s, String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}
