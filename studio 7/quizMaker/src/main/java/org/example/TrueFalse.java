package org.example;

public class TrueFalse extends Question{

    private final String qType = "tf";
    public TrueFalse(String question, String answer){
        super(question, answer);
    }

    public String getqType() {
        return qType;
    }

    @Override
    public boolean checkAnswer(String result) {
        return result.equals(getAnswer());
    }
}
