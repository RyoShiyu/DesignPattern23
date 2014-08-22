package FactoryMethod;

public class ImageCutPrint extends CutPrint {

	@Override
	protected void draw(Cuttable hanzai) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("どうでもいいでとにかく描く");
	}

	@Override
	protected void cut(Cuttable hanzai) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("彫る彫る");
	}

	@Override
	protected void print(Cuttable hanzai) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("プリント出来れば、どうでもいい");
	}

	protected Cuttable createCuttable(){
		return new Potato();
	}
}
