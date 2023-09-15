package org.example;

import java.util.ArrayList;

public class MultipleChoice extends Question{
    private ArrayList<String> choices = new ArrayList<>();
    private final String qType = "mc";
    public MultipleChoice(String question, String answer, ArrayList<String> options){
        super(question, answer);
        choices = options;
    }

    public String getqType() {
        return qType;
    }

    @Override
    public boolean checkAnswer(String result) {
        return result.equals(getAnswer());
    }
}
