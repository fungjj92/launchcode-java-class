/****
 Quiz Pset 2b

    5/5/15

    JFung
    ReBootU
******/
import java.util.Scanner;


public class Quiz{
    private Question[] list;

    public Quiz(Question[] list) {
        this.list = list;
    }

    public boolean giveExam(Question[] qArr){
        for (int i = 0; i < qArr.length; i++) {
            //Print question, initialize scanner
            qArr[i].printQuestion();
            Scanner sc = new Scanner(System.in);
            qArr[i].printOptions();
            String input = sc.nextLine();
            boolean tf = qArr[i].isCorrect(input);
            System.out.println(tf);
        }
        return false;
    }

    public static void main(String[] args) {

        String[] fight = {"Pacquiao", "Ali", "Bullock", "Mayweather"};
        String answers = "Pacquiao, Mayweather";
        Question mc1 = new MultiChoice("Who fought in the May 2015 MMA 'FIGHT'?", answers, fight);

        String[] MOCapitals = {"St. Louis", "Jefferson City", "Columbia", "Springfield"};
        String answer = "Jefferson City";
        Question mc = new MultiChoice("What is the capital of Missouri?", answer, MOCapitals);

        Question n = new Number("How many licks to the center of a tootsie pop?", "3");

        Question b = new Blank("What is the current US President's last name?", "Obama");

        Question[] qArr = {mc1, mc, n, b};

        Quiz thisQuiz = new Quiz(qArr);

        thisQuiz.giveExam(qArr);

    }
}

