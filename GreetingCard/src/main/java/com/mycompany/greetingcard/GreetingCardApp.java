/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.greetingcard;

/**
 *
 * @author x21119210-Zhongjie Xie
 */
public class GreetingCardApp {
    public static void main(String[] args){
        Christmas A= new Christmas("Dear","Jack","Have a beautiful Christmas and a happy New Year!\n  With all good wishes for a brilliant and happy Christmas season!\n  Hope things are going all right with you!","Your sincerely:");
        Wedding B= new Wedding("Dear","Tom","We never knew two people better suited to each other!\n  For a special couple: Congratulations on your wedding!\n  Allow me to join the chorus of congratulations upon your recent marriage!","Your sincerely:");
        Birthday C= new Birthday("Dear","John","May each hour be happy one on this special day!\n  May the day ahead be more than happy!\n  As all your dreams and plans work out just right for you!","Your sincerely:");
        A.Card();
        System.out.println(A);
        B.Card();
        System.out.println(B);
        C.Card();
        System.out.println(C);
    }
}
