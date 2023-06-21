package method;

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.name = "홍길동";
		t.age = "20";
		t.add = "산골짜기";
		
		t.namePrint();
		t.addPrint();
		t.agePrint();
	}
}
