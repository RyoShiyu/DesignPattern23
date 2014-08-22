package FactoryMethod;

public class Main {

	private static Cuttable hanzai;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ImageCutPrint imgcp = new ImageCutPrint();
		imgcp.draw(hanzai);
		imgcp.cut(hanzai);
		imgcp.print(hanzai);
	}

}
