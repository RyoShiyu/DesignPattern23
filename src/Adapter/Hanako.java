package Adapter;

public class Hanako implements Chairperson {

	private Taro taro;
	public Hanako(){
		taro = new Taro();
	}

	public void organizeClass() {
		// TODO 自動生成されたメソッド・スタブ
		taro.enjoyWithAllClassmate();
	}
}
