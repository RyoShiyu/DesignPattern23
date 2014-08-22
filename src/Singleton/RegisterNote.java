package Singleton;

public class RegisterNote {

	private static RegisterNote registerNote = new RegisterNote();
	private RegisterNote(){}

	public void methodPrint(){

		System.out.println("唯一のインスタンス");
	}

	public static RegisterNote getInstance(){

		return registerNote;
	}
}
