/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.christmaswishlist;

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
    private final JButton btnAddGift = new JButton();
    private final JButton btnMost_Expensive = new JButton();
    private final JButton bntSearchGift = new JButton();
    private final JButton btnDisplay = new JButton();
    private final JButton btnSave = new JButton();
    private final JButton btnLoad = new JButton();
    
    private ArrayList<Gift_Book> bookArray = new ArrayList<>();
    private ArrayList<Gift_DVD> DVDArray = new ArrayList<>();
    private ArrayList<Gift_EventTicket> EventTicketArray = new ArrayList<>();
    
    private String GiftName;
    
    public UI(){
        frame.setLayout(null);
	frame.setTitle("Christmas Wish List App");
	frame.setSize(400, 700);
	frame.setVisible(true);
	frame.setResizable(false);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	btnAddGift.setText("Add Gift");
	btnAddGift.setSize(200, 50);
	btnAddGift.setLocation(90, 100);
		
	//Add gift
	btnAddGift.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
                    GiftName = JOptionPane.showInputDialog("Enter gift name: ");
                    if(GiftName.equals("book")){
                        Gift_Book newBook = new Gift_Book(1, "A biography of this famous persons life…", 17.50, "www.booksforsale.com", "Mr. Famous Person", "My Biography", "978-3-16-148410-0");
                        bookArray.add(newBook);
                    }
                    if(GiftName.equals("DVD")){
                        Gift_DVD newDVD = new Gift_DVD(1, "Best Movie Ever!", 17.50, "www.movies.com", "Epic Movie", "Speilberg", "PG");
                        DVDArray.add(newDVD);
                    }
                    if(GiftName.equals("ticket")){
                        Gift_EventTicket newEventTicket = new Gift_EventTicket(1, "Concert tickets", 75.50, "www.tickets.com", "Electric Picnic", "Stradbally");
                        EventTicketArray.add(newEventTicket);
                    }
		}
	});
        
        btnMost_Expensive.setText("Display most expensive");
	btnMost_Expensive.setSize(200, 50);
	btnMost_Expensive.setLocation(90, 200);
				
	//Display the most expensive gift
	btnMost_Expensive.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
                    double a=0, b=0, c=0, max;
                    for(int i = 0; i < bookArray.size(); i++){
                        a = bookArray.get(i).getPrice();
                    }
                    for(int i = 0; i < DVDArray.size(); i++){
                        b = DVDArray.get(i).getPrice();
                    }
                    for(int i = 0; i < EventTicketArray.size(); i++){
                        c = EventTicketArray.get(i).getPrice();
                    }
                    if(a>b)
                        max = a;
                    
                    else
                        max = b;
                    
                    if(c>max)
                        max = c;
                    if(max==a){
                        JOptionPane.showMessageDialog(null, "A biography of this famous persons life…\nPrice: 17.50\nURL: www.booksforsale.com\nAuthor: Mr. Famous Person\nTitle: My Biography\nTel: 978-3-16-148410-0");
                    }
                    else if(max==b){
                        JOptionPane.showMessageDialog(null, "Best Movie Ever!\nPrice: 17.50\nURL: www.movies.com\nMovies name: Epic Movie\nDirector: Speilberg\nCertificate： PG");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Concert tickets\nPrice: 75.50\nURL: www.tickets.com\nEvent name: Electric Picnic\nVenue: Stradbally");
                    }
		}
	});
        
        //Search gift
        bntSearchGift.setText("Search Gift");
        bntSearchGift.setSize(200, 50);
        bntSearchGift.setLocation(90, 300);
        
        bntSearchGift.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent arg0){
                    GiftName = JOptionPane.showInputDialog("Please enter the gift name that you want to search:");
                    if(GiftName.equals("book")){
                        JOptionPane.showMessageDialog(null, "A biography of this famous persons life…\nPrice: 17.50\nURL: www.booksforsale.com\nAuthor: Mr. Famous Person\nTitle: My Biography\nTel: 978-3-16-148410-0");
                    }
                    if(GiftName.equals("DVD")){
                        JOptionPane.showMessageDialog(null, "Best Movie Ever!\nPrice: 17.50\nURL: www.movies.com\nMovies name: Epic Movie\nDirector: Speilberg\nCertificate： PG");
                    }
                    if(GiftName.equals("ticket")){
                        JOptionPane.showMessageDialog(null, "Concert tickets\nPrice: 75.50\nURL: www.tickets.com\nEvent name: Electric Picnic\nVenue: Stradbally");
                    }
                }
        });
        
        
        
        btnDisplay.setText("Display Gift");
	btnDisplay.setSize(200, 50);
	btnDisplay.setLocation(90, 400);
				
	//Display gift
	btnDisplay.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
                    for(int i = 0; i < bookArray.size(); i++){
			JOptionPane.showMessageDialog(null, "Number: " + bookArray.get(i).getNumber()+"\nDescription: "+ bookArray.get(i).getDescription()+"\nPrice: "+ bookArray.get(i).getPrice()+"\nURL: "+bookArray.get(i).getURL()+"\nAuthor: "+bookArray.get(i).getAuthor()+"\nTitle: "+bookArray.get(i).getTitle()+"\nTel: "+bookArray.get(i).getIsbn());
                    }
                    for(int i = 0; i < DVDArray.size(); i++){
			JOptionPane.showMessageDialog(null, "Number: " + DVDArray.get(i).getNumber()+"\nDescription: "+ DVDArray.get(i).getDescription()+"\nPrice: "+ DVDArray.get(i).getPrice()+"\nURL: "+DVDArray.get(i).getURL()+"\nMovies name: "+DVDArray.get(i).getName()+"\nDirector: "+DVDArray.get(i).getDirector()+"\nCertificate: "+DVDArray.get(i).getCertificate());
                    }
                    for(int i = 0; i < EventTicketArray.size(); i++){
			JOptionPane.showMessageDialog(null, "Number: " + EventTicketArray.get(i).getNumber()+"\nDescription: "+EventTicketArray.get(i).getDescription()+"\nPrice: "+EventTicketArray.get(i).getPrice()+"\nURL: "+EventTicketArray.get(i).getURL()+"\nEvent name: "+EventTicketArray.get(i).getName()+"\nVenue: "+EventTicketArray.get(i).getVenue());
                    }
		}
	});
        
        //Save
        btnSave.setText("Save");
        btnSave.setSize(200, 50);
	btnSave.setLocation(90, 500);
        
        btnSave.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
                    File book;
                    FileOutputStream bookIStream;
                    ObjectOutputStream bookOStream;
        
                    try{
                        book = new File("output.dat");
                        bookIStream = new FileOutputStream(book);
                        bookOStream = new ObjectOutputStream(bookIStream);
            
                        bookOStream.writeObject(bookArray);
                        bookOStream.close();
                    }
                    catch(IOException e){
                        System.out.println(e);
                    }
                    File DVD;
                    FileOutputStream DVDIStream;
                    ObjectOutputStream DVDOStream;
        
                    try{
                        DVD = new File("output.dat");
                        DVDIStream = new FileOutputStream(DVD);
                        DVDOStream = new ObjectOutputStream(DVDIStream);
            
                        DVDOStream.writeObject(bookArray);
                        DVDOStream.close();
                    }
                    catch(IOException e){
                        System.out.println(e);
                    }
                    File ticket;
                    FileOutputStream ticketIStream;
                    ObjectOutputStream ticketOStream;
        
                    try{
                        ticket = new File("output.dat");
                        ticketIStream = new FileOutputStream(ticket);
                        ticketOStream = new ObjectOutputStream(ticketIStream);
            
                        ticketOStream.writeObject(bookArray);
                        ticketOStream.close();
                    }
                    catch(IOException e){
                        System.out.println(e);
                    }
                }
	});
        
        
        //Load
        btnLoad.setText("Load");
        btnLoad.setSize(200, 50);
	btnLoad.setLocation(90, 600);
        
        btnLoad.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
                    File book;
                    FileInputStream bookIStream;
                    ObjectInputStream bookOStream;
                    try{
                        book = new File("output.dat");
                        bookIStream = new FileInputStream(book); 
                        bookOStream = new ObjectInputStream(bookIStream);
            
                        bookArray = (ArrayList<Gift_Book>)bookOStream.readObject();
            
                        bookOStream.close();
                    }
                    catch(IOException |ClassNotFoundException e){
                        System.out.println(e);
                    }
                    File DVD;
                    FileInputStream DVDIStream;
                    ObjectInputStream DVDOStream;
                    try{
                        DVD = new File("output.dat");
                        DVDIStream = new FileInputStream(DVD); 
                        DVDOStream = new ObjectInputStream(DVDIStream);
            
                        DVDArray = (ArrayList<Gift_DVD>)DVDOStream.readObject();
            
                        DVDOStream.close();
                    }
                    catch(IOException |ClassNotFoundException e){
                        System.out.println(e);
                    }
                    File ticket;
                    FileInputStream ticketIStream;
                    ObjectInputStream ticketOStream;
                    try{
                        ticket = new File("output.dat");
                        ticketIStream = new FileInputStream(ticket); 
                        ticketOStream = new ObjectInputStream(ticketIStream);
            
                        EventTicketArray = (ArrayList<Gift_EventTicket>)ticketOStream.readObject();
            
                        ticketOStream.close();
                    }
                    catch(IOException |ClassNotFoundException e){
                        System.out.println(e);
                    }
		}
	});
        
        frame.add(btnAddGift);
        frame.add(btnMost_Expensive);
        frame.add(bntSearchGift);
	frame.add(btnDisplay);
        frame.add(btnSave);
        frame.add(btnLoad);
    }

}