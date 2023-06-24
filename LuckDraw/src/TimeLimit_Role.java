/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 逐星i
 */
public class TimeLimit_Role {            //限定角色池
    private String[] role= {"温迪","可莉","达达利亚","钟离","枫原万叶","雷电将军","魈","甘雨","心海","宵宫","胡桃","神里凌华","优菈","阿贝多"};
    public String GetTimeLimitRoleName(){
        int i=(int)(Math.random() * role.length);
        return role[i];
    } 
}
