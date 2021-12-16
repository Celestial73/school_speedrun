package com.example.school_speedrun;

import java.util.List;

public class Question {

    //Question types:
    // 1 - one correct answer
    // 2 - multiple correct answers
    // 3 - input question
    private byte questionType;

    private List <String> variants;
    private List <String> correctAnswers;
    private String correctAnswer;
    private String question;

    //multiple constructors for different types of questions

    public  Question(String quest, List<String> variants, String correctAns){
        this.questionType = 1;
        this.correctAnswer = correctAnswer;
        this.variants = variants;
        this.question = quest;
    }
    public  Question(String quest, List<String> variants, List<String> correctAns){
        this.questionType = 2;
        this.variants = variants;
        this.question = quest;
    }
    public  Question(String quest, String correctAns){
        this.questionType = 3;
        this.correctAnswer = correctAns;
        this.question = quest;
    }

    public byte getQuestionType() {
        return questionType;
    }

    public void setQuestionType(byte questionType) {
        this.questionType = questionType;
    }

    public List<String> getVariants() {
        return variants;
    }

    public void setVariants(List<String> variants) {
        this.variants = variants;
    }

    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(List<String> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
