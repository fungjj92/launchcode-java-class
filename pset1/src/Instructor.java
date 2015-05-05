/**
 * Created by jenny on 5/4/15.
 */
public class Instructor extends Person{
    private String institution;
    private String department;


    public Instructor(String mfi, int age, int date, String instit, String dept) {
        super(mfi, age, date, "Instructor");
        this.institution = instit;
        this.department = dept;
    }
}
