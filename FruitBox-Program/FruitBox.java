public class FruitBox{
	public int Fruits;
	public int BoxSize;
		public int Box_num;
	public int Left;
	//����
	public void inputFruit(int Fruits){
		this.Fruits=Fruits;
	}
	public void inputBoxSize(int BoxSize){
		this.BoxSize=BoxSize;
	}

	//���
	public int outputBox_num(){
		Box_num=Fruits/6;
		return Box_num;
	}
	public int outputLeft(){
		Left=Fruits%Box_num;
		return Left;
	}
}


