/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package priorityqueueexample;

/**
 *
 * @author eugene
 */

//The class defines the format of one item/element from the priroty queue
//Each element has the object with the information to be stored and the key/priority assigned to that object
public class PQElement {
      private int age;
      private String condition;
      private String name;
      private int key;
    
      public PQElement(int a, String c, String n, int k){
		age = a;
                condition = c;
                name = n;
                key = k;
	}

      public int getAge() {
		return age;
	}

      public void setKAge(int val) {
		age = val;
	}
	
	public String getCondition() {
            return condition;
      }

	public void setCondition(String s) {
		condition = s;
      }

        public String getName(){
            return name;
        }
        
        private void setName(String n){
            name = n;
        }
        
        public int getKey(){
            if(age >= 70)
            key = 6;
        else if(age >= 65 && age < 69)
            key = 5;
        else if(age >=18 && age< 65 && condition == "yes")
            key = 4;
        else if(age >= 36 && age <65)
            key = 3;
        else if(age >= 16 && age <35)
            key = 2;
        else 
            key = 1;
            return key;
        }
        
        public void setKey(int key){
            this.key = key;
        }
      public String toString() {
           	return name.toString();
      }

}
       //end of class PQElement
