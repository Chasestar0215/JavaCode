/* MeasureApp.java
   Driver programme for metre to cm conversion*/

   import java.util.Scanner;
   public class MeasureApp {
	   public static void main(String args[]){

	   // declare variables
	   int m, cm;

	   //declare objects
	   Scanner keyboard;
	   Measure myMeasure;

	   //create objects
	   keyboard= new Scanner(System.in);
	   myMeasure = new Measure();

	   //Input message
	   System.out.println("Please enter the number of metres :- ");
	   m = keyboard.nextInt();
	   myMeasure.setM(m);

	   //process
	   myMeasure.compute();


	   //output
	   cm = myMeasure.getCm();
	   System.out.println("The total number of centimetres is :- " +cm   + "  or this number of metres " +m);

   }

}