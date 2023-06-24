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
public class Wedding implements GreetingCard{
    private String Name;
    private String Salutation;
    private String Verse;
    private String Ending;
    public void Card(){
        System.out.println("Wedding Greeting Card\n");
    }
    public Wedding(String Salutation, String Name, String Verse, String Ending){
        this.Name= Name;
        this.Salutation= Salutation;
        this.Verse= Verse;
        this.Ending= Ending;
    }
    public String toString(){
        return ""+Salutation+" "+Name+"\n  "+Verse+"\n                             "+Ending+" "+Name+"\n";
    }
}
