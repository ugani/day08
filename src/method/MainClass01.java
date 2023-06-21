package method;
/*
 	private 
 	-클래스 내부에서만 접근허용, 외부 접근 불가!
 	protected
 	-일반적인 경우에는 private와 동일하게 클래스 내부에서만 접근 가능
 	- 상속받은 경우 자식클래스에서도 접근 가능
 	public
 	-클래스 외부, 내부에서 접근 가능함
 	default
 	-키워드가 없는 경우가 default라고 표현
 	-동일한 패키지 안에서 접근 가능
 */

public class MainClass01 {

	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		t.name = "홍길동";
		t.age = 20;
		
	}

}
