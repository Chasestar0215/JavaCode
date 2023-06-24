/* @author eugene */
package objects;

public class User {

	private String name;
	private int id;
	
	public User(String newName, int newID) {
		name = newName;
		id = newID;
	}
	
	public String getName(){
		return name;
	}
	
	public int getID(){
		return id;
	}

}