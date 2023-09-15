package org.example;

public abstract class Question {
    private String question;
    private String answer;

    public Question(String aQuestion, String anAnswer){
        question = aQuestion;
        answer = anAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public abstract boolean checkAnswer(String result);
}
