/* Measure.java
/* receive input in metres
/* calculate centimetres
/* returm our answer
*/


public class Measure{
	//data for processing
	private int m;
	private int cm;

	//constructor
	public Measure(){
		m = 0;
		cm = 0;
		 }

	//set method - one for every input
	public void setM(int m) {
		this.m = m;

	}
	//compute - process
	public void compute() {
		cm=m*100;
	}

	//get method - one for every output
	public int getCm() {
		return cm;

	}
}