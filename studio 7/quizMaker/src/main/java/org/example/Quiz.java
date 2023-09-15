package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public Quiz() {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("2");
        arr1.add("4");
        arr1.add("6");
        arr1.add("8");
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("7");
        arr2.add("5");
        arr2.add("16");
        arr2.add("51");
        ArrayList<String> arr3 = new ArrayList<>();
        arr3.add("red");
        arr3.add("blue");
        arr3.add("purple");
        arr3.add("orange");

        MultipleChoice mc1 = new MultipleChoice("What is 2 x 2?", "1", arr1);
        Checkbox cb1 = new Checkbox("What numbers are prime numbers?", "0,1", arr2);
        MultipleChoice mc2 = new MultipleChoice("What color is a ladybug?", "0", arr3);
        TrueFalse tf1 = new TrueFalse("The ocean is blue? (T/F)", "T");
        questions.add(mc1);
        questions.add(cb1);
        questions.add(mc2);
        questions.add(tf1);
    }

    public void addQuestions(){
        System.out.println("What type of question are you adding? (mc, tf, cb)");
        String questionType = input.nextLine();
        if(questionType.equals("mc")){
            System.out.println("What is your question?");
            String question = input.nextLine();
            System.out.println("What are the possible answers?");
            ArrayList<String> ans = new ArrayList<>();
            String a;
            for(int i = 0; i < 4; i++){
                a = input.nextLine();
                ans.add(a);
            }
            System.out.println("Which answers is correct? (1-4)");
            String correctAns = input.nextLine();
            MultipleChoice mc = new MultipleChoice(question, correctAns, ans);
            questions.add(mc);
        }
        else if (questionType.equals("tf")){
            System.out.println("What is your question?");
            String question = input.nextLine();
            System.out.println("What is the answer? (T/F)");
            String correctAns = input.nextLine();
            TrueFalse tf = new TrueFalse(question, correctAns);
            questions.add(tf);
        }
        else{
            System.out.println("What is your question?");
            String question = input.nextLine();
            System.out.println("What are the possible answers?");
            ArrayList<String> ans = new ArrayList<>();
            String a;
            for(int i = 0; i < 4; i++){
                a = input.nextLine();
                ans.add(a);
            }
            System.out.println("Which answers is correct? (1-4, use colons (:) to separate answers)");
            String correctAns = input.nextLine();
            Checkbox cb = new Checkbox(question, correctAns, ans);
            questions.add(cb);
        }
    }

    public void runQuiz() {
        System.out.println("Starting Quiz: ");
        for(Question q : questions){
            System.out.println(q.getQuestion());
        }
    }

    public void gradeQuiz() {

    }
}
