package ObjectsAndClasses.E05Students;

public class Students {
    //poleta- harakeristiki
    private String firstName;
    private String lastName;
    private double grade;

    //konstructor
    public Students(String firstName, String lastName, double grade){
        //на новосъздаденият обект срещу полето firstName искам да ми дойде новата стойност на firstName
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString(){
        return  this.firstName + " " + this.lastName + ": " + this.grade;
    }
}
