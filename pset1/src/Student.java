/**
 * Created by jenny on 4/29/15.
 */
public class Student extends Person{
    private String first;
    private String last;
    private int StudentID;
    private int credits;
    private double GPA;
    private String studentType;

    public Student(String mfi, int age, int date, String first, String last, int id, int credits, double GPA, String type) {
        super(mfi, age, date, "Student");
        this.first = first;
        this.last = last;
        this.StudentID = id;
        this.credits = credits;
        this.GPA = GPA;
        this.studentType = type;
    }

    public Student(String mfi, int age, int date, String first, String last, int id, String type) {
        super(mfi, age, date, "Student");
        this.first = first;
        this.last = last;
        this.StudentID = id;
        this.credits = 0;
        this.GPA = 0.0;
        this.studentType = type;
    }

    public Student(Student a, Student b) {
        super("I", 0, 310, "Student");
        int maxCr = (a.getCredits() > b.getCredits())? a.getCredits() : b.getCredits();
        double avgGPA = (a.getGPA()+b.getGPA())/2;
        this.first = a.getName();
        this.last = b.getName();
        this.StudentID= (int)(Math.random() * 500);
        this.credits = maxCr;
        this.GPA = avgGPA;
        this.studentType = "Fulltime";
    }

    public double getGPA(){ return this.GPA; }

    public int getStudentID(){ return this.StudentID; }

    public int getCredits(){ return this.credits; }

    public String getType(){ return this.studentType; }

    public String changeType(String newType){
        this.studentType = newType;
        return this.studentType;
    }

    public String getName(){
        String name = this.first + " " + this.last;
        return name;
    }

    public String toString(){
        String nameid = this.getName() + " " + this.StudentID;
        return nameid;
    }

    public String getClassStanding(){
        if(this.credits < 30) {
            return "Freshman";
        } else if(this.credits >30 && this.credits < 60) {
            return "Sophomore";
        } else if(this.credits > 60 && this.credits < 90) {
            return "Junior";
        } else if(this.credits > 90){
            return "Senior";
        } else {
            return "Error: student has negative credits";
        }
    }

    public double submitGrade(double grade, int newCredits){
        this.GPA = ((grade * newCredits)+(this.GPA * this.credits)) / (this.credits + newCredits);
        this.credits += newCredits;
        return this.GPA;
    }

    public double computeTuition(){
        if(this.studentType == "Fulltime") {
            double numSemesters = (this.credits / 15);
            if (numSemesters >= 8) {
                double tuition = 160000;
                return tuition;
            } else {
                double tuition = numSemesters * 20000.00;
                return tuition;
            }
        }
        else{
            double tuition = this.credits * 300;
            return tuition;
        }
    }

    public Student createLegacy(Student b){
        Student baby = new Student(this, b);
        return baby;
    }

}
