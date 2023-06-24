import javax.swing.JOptionPane;

public class FruitBoxApp{
	public static void main(String[] args){
		int Fruits;
		int BoxSize;
		int Box_num;
		int Left;
		FruitBox fruit;
		fruit=new FruitBox();
		//输入
		Fruits=Integer.parseInt(JOptionPane.showInputDialog(null,"输入水果的数量："));
		BoxSize=6;

		fruit.inputFruit(Fruits);
		fruit.inputFruit(BoxSize);


		//输出
		Box_num=fruit.outputBox_num();
		Left=fruit.outputLeft();

		JOptionPane.showMessageDialog(null,"需要水果篮"+Box_num);
		JOptionPane.showMessageDialog(null,"剩下水果"+Left);
	}
}