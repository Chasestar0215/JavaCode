/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author yalemisew
 */
public class LargeNumberNano {
    
    public LargeNumberNano(){
    }

    public int compare(int a, int b) {
        int larger = a;
        
        if (b > a) {
            larger = b;
        }
        
        return larger;
    }
}
