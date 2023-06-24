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
public class EssayQuestion extends BasicQuestion{
    private int MaxWordCount;
    public EssayQuestion(String QuestionText, String CorrectAnswer, String Mark, String Answer, int MaxWordCount){
        super(QuestionText,CorrectAnswer, Mark, Answer);
        this.MaxWordCount= MaxWordCount;
    }
    public int getMaxWordCount(){
        return this.MaxWordCount;
    }
}
