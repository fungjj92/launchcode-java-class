/****
 Quiz Pset 2b

 5/5/15

 JFung
 ReBootU
 ******/

public class MultiChoice extends Question{
    private String[] options;

    //one or multi answer
    public MultiChoice(String prompt, String answers, String[] options){
        super(prompt, answers);
        this.options = options;
    }

    public void printOptions(){
        for(int i = 0; i < this.options.length; i++) {
            System.out.println(this.options[i]);
        }
    }

}