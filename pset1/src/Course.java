import java.util.Arrays;

/**
 * Created by jenny on 4/29/15.
 */
public class Course {
    private String name;
    private String courseNum;
    private double credits;
    private int numSeats;
    private Student[] roster;

    public Course(String name, String courseNum, double credits, int numSeats) {
        this.name = name;
        this.courseNum = courseNum;
        this.credits = credits;
        this.numSeats = numSeats;
        this.roster = new Student[this.numSeats];
    }

    public String getCName(){ return this.name; }

    public int getnumSeats(){ return this.numSeats; }

    public Student[] getRoster(){
        int enrolled = 0;
        for(int i = 0; i < this.roster.length; i++) {
            if (this.roster[i] != null) {
                enrolled ++;
            }
        }
        Student[] currRoster = new Student[enrolled];
        for(int j = 0; j < enrolled; j++) {
            currRoster[j] = this.roster[j];
        }
        return currRoster;
    }

    public String toCString(){
        String info = this.courseNum + " " + this.credits;
        return info;
    }

    public boolean addStudent(Student a){
        for(int i = 0; i < this.roster.length; i++) {
            if (a ==  this.roster[i]) {
                return false;
            }
            else if (this.roster[i] == null) {
                this.roster[i] = a;
                this.numSeats -= 1;
                return true;
            }
        }
        return false;
    }

    public void printRoster(){
        System.out.print(Arrays.toString(this.roster));
    }

    public double averageGPA(){
        double totalGPA = 0;
        double enrolled = 0;
        for(int i = 0; i < this.roster.length; i++) {
            if (this.roster[i] != null) {
                totalGPA += this.roster[i].getGPA();
                enrolled++;
            }
        }
        double avgGPA = totalGPA/enrolled;
        return avgGPA;
    }


}
