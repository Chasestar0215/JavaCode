/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 逐星i
 */
import java.util.Scanner;

public class LuckDraw_App {
    public static void main(String[] args){
        String Type;
        String Name;
        Scanner in= new Scanner(System.in);
        System.out.println("请输入您想抽取的卡池类型（1.常驻池；2.角色池；3.武器池）");
        Type= in.nextLine();
        Permanent_Role A= new Permanent_Role();
        TimeLimit_Role B= new TimeLimit_Role();
        Arms C= new Arms();
        if(Type.equals("1")){
            Name= A.GetPermanentRoleName();
        }
        else if(Type.equals("2")){
            Name= B.GetTimeLimitRoleName();
        }
        else {
            Name= C.GetArmsName();
        }
        System.out.println("恭喜您抽中了 "+Name+" !");
    }
}
