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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UI {
    
    private final JFrame frame = new JFrame();          //申请图形界面
    private final JButton btnBasicQuestion = new JButton();             //按钮一
    private final JButton btnMultipleChoiceQuestion = new JButton();        //二
    private final JButton btnEssayQuestion = new JButton();             //三
    
    private ArrayList<BasicQuestion> basicArray = new ArrayList<>();
    private ArrayList<EssayQuestion> essayArray = new ArrayList<>();
    private ArrayList<MultipleChoiceQuestion> choiceArray = new ArrayList<>();
    
    private String QuestionText;
    private String CorrectAnswer;
    private String Mark;
    private String Answer;
    private int MaxWordCount;
    private String Option;
    
    public UI(){                                                        //UI函数
        frame.setLayout(null);
	frame.setTitle("Question App");                                 //图形界面头文本
	frame.setSize(400, 600);                                        //大小
	frame.setVisible(true);
	frame.setResizable(false);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           //图形界面关闭方式
        
        btnBasicQuestion.setText("Basic Question");         //按钮文本
	btnBasicQuestion.setSize(200, 50);                  //按钮大小
	btnBasicQuestion.setLocation(90, 100);              //按钮坐标
        
        btnBasicQuestion.addActionListener(new ActionListener(){                //按钮一内的功能
            public void actionPerformed(ActionEvent arg0) {
                QuestionText = "Are you human?";
                JOptionPane.showMessageDialog(null,"The question is: "+QuestionText);
                Answer = JOptionPane.showInputDialog("Enter your answer: ");
                CorrectAnswer = "Yes";
                JOptionPane.showMessageDialog(null,"The correct answer is: "+CorrectAnswer);
                if(Answer.equals("Yes")){
                    Mark = "Right";
                    JOptionPane.showMessageDialog(null,"Your answer is "+Mark);
                }
                else{
                    Mark = "Wrong";
                    JOptionPane.showMessageDialog(null,"You answer is "+Mark,null, JOptionPane.ERROR_MESSAGE);
                }
            BasicQuestion A = new BasicQuestion(QuestionText, CorrectAnswer, Mark, Answer);
            basicArray.add(A);
            }    
        });
        
        btnMultipleChoiceQuestion.setText("Multiple Choice Question");
	btnMultipleChoiceQuestion.setSize(200, 50);
	btnMultipleChoiceQuestion.setLocation(90, 200);
        
        btnMultipleChoiceQuestion.addActionListener(new ActionListener(){               //按钮二内功能
            public void actionPerformed(ActionEvent arg0) {
                QuestionText = "1+1= ?";
                JOptionPane.showMessageDialog(null,"The question is: "+QuestionText);
                Option = "A: One        B: Two       C: Three";
                JOptionPane.showInputDialog(null,Option);
                Answer = JOptionPane.showInputDialog("Enter your answer: ");
                CorrectAnswer = "A";
                JOptionPane.showMessageDialog(null,"The correct answer is: "+CorrectAnswer);
                if(Answer.equals("A")){
                    Mark = "Right";
                    JOptionPane.showMessageDialog(null,"Your answer is "+Mark);
                }
                else{
                    Mark = "Wrong";
                    JOptionPane.showMessageDialog(null,"You answer is "+Mark,null, JOptionPane.ERROR_MESSAGE);
                }
            
            MultipleChoiceQuestion B = new MultipleChoiceQuestion(QuestionText, CorrectAnswer, Mark, Answer, Option);
            choiceArray.add(B);
            }
            
        });
        
        btnEssayQuestion.setText("Essay Question");
	btnEssayQuestion.setSize(200, 50);
	btnEssayQuestion.setLocation(90, 300);
        
        btnEssayQuestion.addActionListener(new ActionListener(){                //按键三内功能
            public void actionPerformed(ActionEvent arg0) {
                MaxWordCount = 202;
                JOptionPane.showMessageDialog(null,"The max word count are: "+MaxWordCount);
                QuestionText = "Who is this essay's main role?";
                JOptionPane.showMessageDialog(null,"The question is: "+QuestionText);
                Answer = JOptionPane.showInputDialog("Enter your answer: ");
                CorrectAnswer = "Jack";
                JOptionPane.showMessageDialog(null,"The correct answer is: "+CorrectAnswer);
                if(Answer.equals("Jack")){
                    Mark = "Right";
                    JOptionPane.showMessageDialog(null,"Your answer is "+Mark);
                }
                else{
                    Mark = "Wrong";
                    JOptionPane.showMessageDialog(null,"You answer is "+Mark,null, JOptionPane.ERROR_MESSAGE);
                }
            
            EssayQuestion C = new EssayQuestion(QuestionText, CorrectAnswer, Mark, Answer, MaxWordCount);
            essayArray.add(C);
            }
            
	});
        frame.add(btnBasicQuestion);
        frame.add(btnMultipleChoiceQuestion);
        frame.add(btnEssayQuestion);                        //三个按钮的图形界面
    }
}
