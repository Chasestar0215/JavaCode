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
import javax.swing.JOptionPane;
public class Recap {
    public static void main(String[] args) {
	int Units;
	double Amount;
	double Sur_Charge;
	double Total_Amount;

	Electricity units;
	units= new Electricity();
	//get
	Units=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number :- "));
	//set
	units.setUnits(Units);
	//compute
	units.compute();
	//get
	Total_Amount=units.getTotal();
	JOptionPane.showMessageDialog(null,Total_Amount);
    }
}
