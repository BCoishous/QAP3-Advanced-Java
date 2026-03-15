public class Teacher extends Person {

    private String mySubject;
    private double mySalary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        mySubject = subject;
        mySalary  = salary;
    }

    // Getters
    public String getSubject() { return mySubject; }
    public double getSalary()  { return mySalary; }

    // Setters
    public void setSubject(String subject) { mySubject = subject; }
    public void setSalary(double salary)   { mySalary  = salary; }

    @Override
    public String toString() {
        return super.toString() + ", subject: " + mySubject + ", salary: $" + mySalary;
    }
}