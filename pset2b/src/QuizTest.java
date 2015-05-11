import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

import java.io.PrintStream;

/**
 * JUnit tests for Questions and Quiz
 * @author JFung
 *
 */

public class QuizTest extends TestCase {
    @Test
    public void testQuestionBlank() {
        Question q = new Question("What is the capital of Missouri?", "Jefferson City");
        Blank b = new Blank("What is the capital of Missouri?", "Jefferson City");
        q.printQuestion();
        b.printQuestion();
        boolean tf = b.isCorrect("Jefferson City");
        System.out.println(tf);
    }
    @Test
    public void testNumber(){
        Number n = new Number("How many licks to the center of a tootsie pop?", "3");
        n.printQuestion();
        boolean tf = n.isCorrect("2");
        System.out.println(tf); //expect false
        tf = n.isCorrect("3");
        System.out.println(tf); //expect true
    }

    @Test
    public void testMultiChoice() {
        String[] MOCapitals = {"St. Louis", "Jefferson City", "Columbia", "Springfield"};
        String answer = "Jefferson City";
        MultiChoice mc = new MultiChoice("What is the capital of Missouri?", answer, MOCapitals);
        mc.printOptions();
        System.out.println(mc.isCorrect(answer)); //expect true

        String[] fight = {"Pacquiao", "Ali", "Bullock", "Mayweather"};
        String answers = "Pacquiao, Mayweather";
        MultiChoice mc1 = new MultiChoice("Who fought in the May 2015 MMA 'FIGHT'?", answers, fight);
        mc1.printOptions();
        String input = "Pacquiao, Mayweather";
        boolean tf = mc1.isCorrect(input);//true
        System.out.println(tf);

    }
}