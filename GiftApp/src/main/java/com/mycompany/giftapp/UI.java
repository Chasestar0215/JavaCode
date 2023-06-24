/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.giftapp;

/**
 *
 * @author x21119210-Zhongjie Xie
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UI {
    private final JFrame frame = new JFrame();
    private final JButton btnAddUser = new JButton();
    private final JButton btnDeleteUser = new JButton();
    private final JButton bntSearchUser = new JButton();
    private final JButton btnDisplay = new JButton();
    private final JButton btnSave = new JButton();
    private final JButton btnLoad = new JButton();
	
    private ArrayList<Gift_User> userArray = new ArrayList<>();
    private String Name;
    private String Gift;
    private String URL;
    
    public UI(){
        frame.setLayout(null);
	frame.setTitle("Gift App");
	frame.setSize(400, 700);
	frame.setVisible(true);
	frame.setResizable(false);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	btnAddUser.setText("Add Gift");
	btnAddUser.setSize(200, 50);
	btnAddUser.setLocation(90, 100);
		
	//btnAddUser Click Event:
	btnAddUser.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
                    Name = JOptionPane.showInputDialog("Enter Name: ");
                    Gift = JOptionPane.showInputDialog("Enter Gift: ");
                    URL = JOptionPane.showInputDialog("Enter URL: ");
                    
				
                    //Add User To Array:
                    Gift_User newUser = new Gift_User(Name, Gift, URL);
                    userArray.add(newUser);
		}
	});
        
        btnDeleteUser.setText("Delete Gift");
	btnDeleteUser.setSize(200, 50);
	btnDeleteUser.setLocation(90, 200);
				
	//btnDelete Click Event:
	btnDeleteUser.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
                    Name = JOptionPane.showInputDialog("I want to delete (Enter name):");
                    
                    //Delete user to Array
                    for(int i = 0; i < userArray.size(); i++){
                        if(userArray.get(i).getName().equals(Name)){
                            userArray.remove(i);
                        }
                    }
		}
	});
        
        //btnSearch Click Event:
        bntSearchUser.setText("Search Gift");
        bntSearchUser.setSize(200, 50);
        bntSearchUser.setLocation(90, 300);
        
        bntSearchUser.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent arg0){
                    Name = JOptionPane.showInputDialog("Please enter the name that you want to search:");
                    
                    //Search user to Array
                    for(int i = 0; i < userArray.size(); i++){
                        if(userArray.get(i).getName().equals(Name)){
                            JOptionPane.showMessageDialog(null, "Name: " + userArray.get(i).getName());
                            JOptionPane.showMessageDialog(null, "Gift: " + userArray.get(i).getGift());
                            JOptionPane.showMessageDialog(null, "URL: " + userArray.get(i).getURL());
                        }
                    }
                }
        });
        
        
        
        btnDisplay.setText("Display Gift");
	btnDisplay.setSize(200, 50);
	btnDisplay.setLocation(90, 400);
				
	//btnDisplay Click Event:
	btnDisplay.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
                    for(int i = 0; i < userArray.size(); i++){
			JOptionPane.showMessageDialog(null, "Name: " + userArray.get(i).getName());
			JOptionPane.showMessageDialog(null, "Gift: " + userArray.get(i).getGift());
                        JOptionPane.showMessageDialog(null, "URL: " + userArray.get(i).getURL());
                    }
		}
	});
        
        
        btnSave.setText("Save");
        btnSave.setSize(200, 50);
	btnSave.setLocation(90, 500);
        
        btnSave.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
                    File f;
                    FileOutputStream fStream;
                    ObjectOutputStream oStream;
        
                    try{
                        f = new File("output.dat");
                        fStream = new FileOutputStream(f);
                        oStream = new ObjectOutputStream(fStream);
            
                        oStream.writeObject(userArray);
                        oStream.close();
                    }
                    catch(IOException e){
                        System.out.println(e);
                    }
                }
	});
        
        btnLoad.setText("Load");
        btnLoad.setSize(200, 50);
	btnLoad.setLocation(90, 600);
        
        btnLoad.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
                    File f;
                    FileInputStream fStream;
                    ObjectInputStream oStream;
                    try{
                        f = new File("output.dat");
                        fStream = new FileInputStream(f); 
                        oStream = new ObjectInputStream(fStream);
            
                        userArray = (ArrayList<Gift_User>)oStream.readObject();
            
                        oStream.close();
                    }
                    catch(IOException |ClassNotFoundException e){
                        System.out.println(e);
                    }
		}
	});
        
        frame.add(btnAddUser);
        frame.add(btnDeleteUser);
        frame.add(bntSearchUser);
	frame.add(btnDisplay);
        frame.add(btnSave);
        frame.add(btnLoad);
    }

}

