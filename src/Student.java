/**
 * Student class
 * @author Xiaoming Su
 * @version 1.0
 */
public class Student {
    /**
     * this Student class can managed student name and GPA list.
     */
    private String name;
    private static double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa(){
        return gpa;
    }

    @Override
    public String toString(){
        return name + " has GPA " + gpa;
    }
}
