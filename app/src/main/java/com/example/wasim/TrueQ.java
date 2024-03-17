package com.example.wasim;

public class TrueQ {
    private  int id;
    private  String Questions;
    private  String  Answer;

    private boolean hisAnswer;
    public TrueQ(String questions, String answer,int id) {
        Questions = questions;
        Answer = answer;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestions() {
        return Questions;
    }

    public void setQuestions(String questions) {
        Questions = questions;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public boolean isHisAnswer() {
        return hisAnswer;
    }

    public void setHisAnswer(boolean hisAnswer) {
        this.hisAnswer = hisAnswer;
    }

    @Override
    public String toString() {
        int resut;
        if(this.isHisAnswer())
            resut=1;
        else
            resut=0;
        return "Q"+this.getId() +" Score \t\t\t"+ resut+"/1";
    }
}
