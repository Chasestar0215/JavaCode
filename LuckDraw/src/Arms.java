/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 逐星i
 */
public class Arms {         //武器池
    private String[] arms={"冬极白星","尘世之锁","护膜之杖","终末嗟叹之诗","苍古自由之势","磐岩结绿","雾切之回光","薙草之稻光","无工之剑","贯虹之槊","斫峰之刃","飞雷之弦振","松籁响起之时","不灭月华"};
    public String GetArmsName(){
        int i=(int)(Math.random() * arms.length);
        return arms[i];
    }
}
