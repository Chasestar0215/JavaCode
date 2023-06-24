/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.questionapp;

/**
 *
 * @author x21119210-Zhongjie Xie
 */
public class BasicQuestion {
    public String QuestionText;
    public String CorrectAnswer;
    public String Mark;
    public String Answer;
    public BasicQuestion(String QuestionText, String CorrectAnswer, String Mark, String Answer){
        this.QuestionText= QuestionText;
        this.CorrectAnswer= CorrectAnswer;
        this.Mark= Mark;
        this.Answer= Answer;
    }
    public String getQuestionText(){
        return this.QuestionText;
    }
    public String getCorrectAnswer(){
        return this.CorrectAnswer;
    }
    public String getMark(){
        return this.Mark;
    }
    public String getAnswer(){
        return this.Answer;
    }
}
