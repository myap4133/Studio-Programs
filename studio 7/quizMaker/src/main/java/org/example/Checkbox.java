package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Checkbox extends Question{
    private ArrayList<String> choices = new ArrayList<>();
    private String[] answers = getAnswer().split(":");
    private final String qType = "cb";
    public Checkbox(String question, String answer, ArrayList<String> options){
        super(question, answer);
        choices = options;
    }

    public String getqType() {
        return qType;
    }

    public String[] identifyAnswers(String result){
        return result.split(":");
    }

    @Override
    public boolean checkAnswer(String result) {
        return Arrays.equals(identifyAnswers(result), answers);
    }
}
