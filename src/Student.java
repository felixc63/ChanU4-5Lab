public class Student {
    private String firstName;
    private String lastName;
    private int gradYear;
    private double gpa;
    private boolean inClub;

    public Student(String first, String last, int gradYear, double gpa, boolean inClub) {
        firstName = first;
        lastName = last;
        this.gradYear = gradYear;
        this.gpa = gpa;
        this.inClub = inClub;
    }

    // Add getter and setter methods for ALL instance variables here!
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getGradYear(){
        return gradYear;
    }

    public double getGpa(){
        return gpa;
    }

    public boolean isInClub(){
        return inClub;
    }

    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }

    public void setLastName(String newLastName){
        lastName = newLastName;
    }

    public void setGradYear(int newGradYear){
        gradYear = newGradYear;
    }

    public void setGpa(double newGpa){
        gpa = newGpa;
    }

    public void setInClub(boolean newValue){
        inClub = newValue;
    }
    public String studentInfo() {
        return "first name: " + firstName + ", last name: " + lastName +
                ", grad year: " + gradYear + ", gpa: " + gpa +
                ", is in club: " + inClub;
    }
}
