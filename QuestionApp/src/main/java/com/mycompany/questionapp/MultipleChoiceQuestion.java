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
public class MultipleChoiceQuestion extends BasicQuestion{
    private String Option;
    public MultipleChoiceQuestion(String QuestionText,String CorrectAnswer, String Mark, String Answer, String Option){
        super(QuestionText, CorrectAnswer, Mark, Answer);
        this.Option= Option;
    }
    public String getOption(){
        return this.Option;
    }
}
    
