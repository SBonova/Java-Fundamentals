package ObjectsAndClasses.E07OrderByAge;

public class Peorson {
    //полета -> характеристики
    private String name;
    private int age;
    private String id;

    //контруктор, които
    public void Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        //"Stephan with ID: 524244 is 10 years old."
        return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
    }

}
