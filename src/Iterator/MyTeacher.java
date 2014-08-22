package Iterator;

public class MyTeacher extends Teacher {
	private StudentList list = new StudentList(5);

	public void createStudentList() {
		// TODO 自動生成されたメソッド・スタブ
		list.add(new Student("赤井亮太", 1));
		list.add(new Student("赤羽里美", 2));
		list.add(new Student("岡田美央", 2));
		list.add(new Student("西森俊介", 1));
		list.add(new Student("中ノ森玲菜", 2));

	}

	public void callStudents() {
		// TODO 自動生成されたメソッド・スタブ
		int size = list.getLastNum();
		for(int n = 0 ;n<size ;n++){
			System.out.println(list.getStudentAt(n).getName());
		}
	}
}
