/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.recap;

/**
 *
 * @author 逐星i
 */
public class Electricity {
    public int Units;
    public double Amount;
    public double Sur_Charge;
    public double Total_Amount;
    //set
    public void setUnits(int Units){
	this.Units= Units;
    }
    //compute
    public void compute(){
	 if (Units < 50)
	 {
	   Amount = Units * 2.60;
	   Sur_Charge = 25;
	 }
	 else if (Units <= 100)
	 {
	  // For the First Fifty Units Charge = 130 (50 * 2.60)
	  // Next, we are removing those 50 units from total units
	  Amount = 130 + ((Units - 50 ) * 3.25);
	  Sur_Charge = 35;
	 }
	 else if (Units <= 200)
	 {
	  // First Fifty Units charge = 130, and 50 - 100 is 162.50 (50 * 3.25)
	  // Next, we are removing those 100 units from total units
	  Amount = 130 + 162.50 + ((Units - 100 ) * 5.26);
	  Sur_Charge = 45;
	 }
	 else
	 {
	  /* First Fifty Units = 130, 50 - 100 is 162.50,
	  and 100 - 200 is 526 (100 * 5.65)
	  Next, we are removing those 200 units from total units */
	  Amount = 130 + 162.50 + 526 + ((Units - 200 ) * 7.75);
	  Sur_Charge = 55;
	  }
	}
	//get
    public double getTotal(){
        Total_Amount = Amount + Sur_Charge;
        return Total_Amount;
    }
}
