/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 逐星i
 */
public class Permanent_Role {            //常驻池
    private String[] role= {"迪卢克","七七","莫娜","琴","刻晴","狼的末路","风鹰剑","阿莫斯之弓","四风原典","和璞鸳","天空之翼","天空之刃","天空之卷","天空之傲"};
    public String GetPermanentRoleName(){
        int i=(int)(Math.random() * role.length);
        return role[i];
    }
}