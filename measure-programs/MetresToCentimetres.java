import javax.swing.JOptionPane;
public class MetresToCentimetres{
	public static void main(String[] args){
		/*Fill in the gaps in code by replacing the **** sections*/
		//   m to cm      m=100 cm calculation  answer = m*100
	//Input Variables
	    int m;
	    int cm;
	//output
	    int answer;

	//
	   m=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of metres: "));
	   answer = m*100;
	   JOptionPane.showMessageDialog(null, "The answer is "+answer);

	}
}