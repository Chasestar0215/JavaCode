import javax.swing.JOptionPane;

public class FruitBoxApp{
	public static void main(String[] args){
		int Fruits;
		int BoxSize;
		int Box_num;
		int Left;
		FruitBox fruit;
		fruit=new FruitBox();
		//����
		Fruits=Integer.parseInt(JOptionPane.showInputDialog(null,"����ˮ����������"));
		BoxSize=6;

		fruit.inputFruit(Fruits);
		fruit.inputFruit(BoxSize);


		//���
		Box_num=fruit.outputBox_num();
		Left=fruit.outputLeft();

		JOptionPane.showMessageDialog(null,"��Ҫˮ����"+Box_num);
		JOptionPane.showMessageDialog(null,"ʣ��ˮ��"+Left);
	}
}