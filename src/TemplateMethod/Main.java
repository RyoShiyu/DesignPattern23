package TemplateMethod;

public class Main {

	private static Cuttable hanzai;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TanakasWoodCutPrint tanakas = new TanakasWoodCutPrint();
		tanakas.draw(hanzai);
		tanakas.cut(hanzai);
		tanakas.print(hanzai);
	}

}
