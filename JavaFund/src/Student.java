public class Student {

   private String firstName;
   private String lastName;
   private int age;
   private String homeTown;

   //konstruktor-> ALT + INSERT

    public Student(String firstName, String lastName, int age, String homeTown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public String getHomeTown() {
        return homeTown;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " is" + this. age + "years old.";
    }
}
