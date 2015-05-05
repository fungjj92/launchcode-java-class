/**
 * Created by jenny on 5/4/15.
 */
public class Person {
    private String sex;
    private int age;
    private int birthdate;
    private String occupation;

    public Person(String mfi, int num, int date, String job) {
        this.sex = mfi;
        this.age = num;
        this.birthdate = date;
        this.occupation = job;
    }

    //All getters
    public String getSex() {
        return this.sex;
    }

    public int getAge() {
        return this.age;
    }

    public int getBday() {
        return this.birthdate;
    }

    public String getOccupation() {
        return this.occupation;
    }

    //Potential setters
    public String changeSex(String newSex) {
        this.sex = newSex;
        return this.sex;
    }

    public String changeOccupation(String newJob) {
        this.occupation = newJob;
        return this.occupation;
    }

}
