/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccine_app;

/**
 *
 * @author x21119210-Zhongjie Xie
 */
public class PQElement {
      private int age;
      private String statment;
      private String name;
      private int key;
    
      public PQElement(int a, String s, String n, int k){
		age = a;
                statment = s;
                name = n;
                key = k;
	}

      public int getAge() {
		return age;
	}

      public void setKAge(int val) {
		age = val;
	}
	
	public String getStatment() {
            return statment;
      }

	public void setStatment(String s) {
		statment = s;
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
        else if(age >= 65 && age < 70)
            key = 5;
        else if(age >=18 && age< 65 && statment.equals("yes"))
            key = 4;
        else if(age >= 36 && age <65)
            key = 3;
        else if(age >= 16 && age <36)
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

