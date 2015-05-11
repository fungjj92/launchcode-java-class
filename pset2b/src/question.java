/****
 Quiz Pset 2b

 5/5/15

 JFung
 ReBootU
 ******/

public class Question {
    private String prompt;
    private String answer;

    public Question(String prompt, String answer){
        this.prompt = prompt;
        this.answer = answer;
    }

    public void printQuestion(){
        System.out.println(this.prompt);
    }

    public void printOptions(){
        System.out.println(this.answer);
    }

    public boolean isCorrect(String selection){
        return selection.equals(this.answer);
    }
}