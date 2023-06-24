/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gift;

/**
 *
 * @author x21119341-Xunyu Liu
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

public class Run {
    private final JFrame frame = new JFrame();
    private final JButton btnAddGift = new JButton();
    private final JButton btnTotal = new JButton();
    private final JButton bntSearchGift = new JButton();
    private final JButton btnDisplay = new JButton();
    private final JButton btnSave = new JButton();
    private final JButton btnLoad = new JButton();
    
    private ArrayList<Voucher> voucherArray = new ArrayList<>();
    private ArrayList<VideoGame> gameArray = new ArrayList<>();
    private ArrayList<Toy> toyArray = new ArrayList<>();
    
    private String GiftName;
    
    public Run(){
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
                    if(GiftName.equals("voucher")){
                        Voucher newVoucher = new Voucher(1, "Gift Voucher", 40.00, "www.powercity.com", "Power City", 2022);
                        voucherArray.add(newVoucher);
                    }
                    if(GiftName.equals("game")){
                        VideoGame newGame = new VideoGame(1, "Best Movie Ever!", 17.50, "www.movies.com", "Epic Movie", "Speilberg", "PG");
                        gameArray.add(newGame);
                    }
                    if(GiftName.equals("toy")){
                        Toy newToy = new Toy(1, "Concert tickets", 75.50, "www.tickets.com", "Electric Picnic", "Stradbally");
                        toyArray.add(newToy);
                    }
		}
	});
        
        btnTotal.setText("Total");
	btnTotal.setSize(200, 50);
	btnTotal.setLocation(90, 200);
				
	//Display total
	btnTotal.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
                    double a=0, b=0, c=0, all;
                    for(int i = 0; i < voucherArray.size(); i++){
                        a = voucherArray.get(i).getPrice();
                    }
                    for(int i = 0; i < gameArray.size(); i++){
                        b = gameArray.get(i).getPrice();
                    }
                    for(int i = 0; i < toyArray.size(); i++){
                        c = toyArray.get(i).getPrice();
                    }
                    all = a+b+c;
                    JOptionPane.showMessageDialog(null,"Total of cost are: "+all);
                }    
	});
        
        //Search gift
        bntSearchGift.setText("Search Gift");
        bntSearchGift.setSize(200, 50);
        bntSearchGift.setLocation(90, 300);
        
        bntSearchGift.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent arg0){
                    GiftName = JOptionPane.showInputDialog("I want to search:");
                    if(GiftName.equals("voucher")){
                        JOptionPane.showMessageDialog(null, "Gift Voucher\nPrice: 40.00\nURL: www.powercity.com\nStore: Power City\nYear of expiry: 2022");
                    }
                    if(GiftName.equals("game")){
                        JOptionPane.showMessageDialog(null, "Kids 2d platform games\nPrice: 37.50\nURL: www.videogames.com\nName: Super Mario\nConsole: Nintendo\nCertificate： G");
                    }
                    if(GiftName.equals("toy")){
                        JOptionPane.showMessageDialog(null, "Kids action toy\nPrice: 17.50\nURL: www.toysforsale.com\nName: Action Man\nType: Action Figure");
                    }
                }
        });
        
        
        
        btnDisplay.setText("Display Gift");
	btnDisplay.setSize(200, 50);
	btnDisplay.setLocation(90, 400);
				
	//Display gift
	btnDisplay.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
                    for(int i = 0; i < voucherArray.size(); i++){
			JOptionPane.showMessageDialog(null, "Number: " + voucherArray.get(i).getNumber()+"\nDescription: "+ voucherArray.get(i).getDescription()+"\nPrice: "+ voucherArray.get(i).getPrice()+"\nURL: "+voucherArray.get(i).getURL()+"\nStore: "+voucherArray.get(i).getStore()+"\nYear of expiry: "+voucherArray.get(i).getYear());
                    }
                    for(int i = 0; i < gameArray.size(); i++){
			JOptionPane.showMessageDialog(null, "Number: " + gameArray.get(i).getNumber()+"\nDescription: "+ gameArray.get(i).getDescription()+"\nPrice: "+gameArray.get(i).getPrice()+"\nURL: "+gameArray.get(i).getURL()+"\nName: "+gameArray.get(i).getName()+"\nConsole: "+gameArray.get(i).getConsole()+"\nCertificate: "+gameArray.get(i).getCertificate());
                    }
                    for(int i = 0; i < toyArray.size(); i++){
			JOptionPane.showMessageDialog(null, "Number: " + toyArray.get(i).getNumber()+"\nDescription: "+toyArray.get(i).getDescription()+"\nPrice: "+toyArray.get(i).getPrice()+"\nURL: "+toyArray.get(i).getURL()+"\nName: "+toyArray.get(i).getName()+"\nType: "+toyArray.get(i).getType());
                    }
		}
	});
        
        //Save
        btnSave.setText("Save");
        btnSave.setSize(200, 50);
	btnSave.setLocation(90, 500);
        
        btnSave.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
                    File voucher;
                    FileOutputStream voucherIStream;
                    ObjectOutputStream voucherOStream;
        
                    try{
                        voucher = new File("output.dat");
                        voucherIStream = new FileOutputStream(voucher);
                        voucherOStream = new ObjectOutputStream(voucherIStream);
            
                        voucherOStream.writeObject(voucherArray);
                        voucherOStream.close();
                    }
                    catch(IOException e){
                        System.out.println(e);
                    }
                    File game;
                    FileOutputStream gameIStream;
                    ObjectOutputStream gameOStream;
        
                    try{
                        game = new File("output.dat");
                        gameIStream = new FileOutputStream(game);
                        gameOStream = new ObjectOutputStream(gameIStream);
            
                        gameOStream.writeObject(gameArray);
                        gameOStream.close();
                    }
                    catch(IOException e){
                        System.out.println(e);
                    }
                    File toy;
                    FileOutputStream toyIStream;
                    ObjectOutputStream toyOStream;
        
                    try{
                        toy = new File("output.dat");
                        toyIStream = new FileOutputStream(toy);
                        toyOStream = new ObjectOutputStream(toyIStream);
            
                        toyOStream.writeObject(toyArray);
                        toyOStream.close();
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
                    File voucher;
                    FileInputStream voucherIStream;
                    ObjectInputStream voucherOStream;
                    try{
                        voucher = new File("output.dat");
                        voucherIStream = new FileInputStream(voucher); 
                        voucherOStream = new ObjectInputStream(voucherIStream);
            
                        voucherArray = (ArrayList<Voucher>)voucherOStream.readObject();
            
                        voucherOStream.close();
                    }
                    catch(IOException |ClassNotFoundException e){
                        System.out.println(e);
                    }
                    File game;
                    FileInputStream gameIStream;
                    ObjectInputStream gameOStream;
                    try{
                        game = new File("output.dat");
                        gameIStream = new FileInputStream(game); 
                        gameOStream = new ObjectInputStream(gameIStream);
            
                        gameArray = (ArrayList<VideoGame>)gameOStream.readObject();
            
                        gameOStream.close();
                    }
                    catch(IOException |ClassNotFoundException e){
                        System.out.println(e);
                    }
                    File toy;
                    FileInputStream toyIStream;
                    ObjectInputStream toyOStream;
                    try{
                        toy = new File("output.dat");
                        toyIStream = new FileInputStream(toy); 
                        toyOStream = new ObjectInputStream(toyIStream);
            
                        toyArray = (ArrayList<Toy>)toyOStream.readObject();
            
                        toyOStream.close();
                    }
                    catch(IOException |ClassNotFoundException e){
                        System.out.println(e);
                    }
		}
	});
        
        frame.add(btnAddGift);
        frame.add(btnTotal);
        frame.add(bntSearchGift);
	frame.add(btnDisplay);
        frame.add(btnSave);
        frame.add(btnLoad);
    }

}

