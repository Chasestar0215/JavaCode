/* @author eugene */
package objects;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	private final JFrame frame = new JFrame();
	private final JButton btnAddUser = new JButton();
	private final JButton btnDisplay = new JButton();
	
	//User Variables:
	private ArrayList<User> userArray = new ArrayList<>();
	private String name;
	private String strId;
	private int id;
	
	public Main() {
		
		//Frame Attributes:
		frame.setLayout(null);
		frame.setTitle("User Data");
		frame.setSize(400, 600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//btnAddUser Attributes:
		btnAddUser.setText("Add User");
		btnAddUser.setSize(200, 50);
		btnAddUser.setLocation(90, 100);
		
		//btnAddUser Click Event:
		btnAddUser.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				name = JOptionPane.showInputDialog("Enter Name: ");
				strId = JOptionPane.showInputDialog("Enter ID: ");
				id = Integer.parseInt(strId);
				
				//Add User To Array:
				User newUser = new User(name, id);
				userArray.add(newUser);
			}
		});
		
		//btnDisplay Attributes:
		btnDisplay.setText("Display");
		btnDisplay.setSize(200, 50);
		btnDisplay.setLocation(90, 200);
				
		//btnDisplay Click Event:
		btnDisplay.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				for(int i = 0; i < userArray.size(); i++){
					JOptionPane.showMessageDialog(null, "Name: " + userArray.get(i).getName());
					JOptionPane.showMessageDialog(null, "ID: " + userArray.get(i).getID());
				}
			}
		});
		
		//Add Frame Objects:
		frame.add(btnAddUser);
		frame.add(btnDisplay);
	}
	
	public static void main(String[] args){
		new Main();
	}

}


