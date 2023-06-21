package method;
/*
method
-독립적인 기능을 가지는 작은 프로그램
-또 다른 언어에서는 function 이라고도 표현함
-method는 class안에서 만드는 기능을 말한다.
-function은 class가 없는 공간에서 만드는 기능을 말한다.
-() 소괄호를 가지는것들은 메소드라고함 ex) 프린트,넥스트 등...
*/

public class MainTest02 {
	public static void main(String[] args) {
		//메소드는 보통 메인에 모든 기능을 작성해주고 그 이후에 사용한다.
		TestClass02 t = new TestClass02();
		System.out.println("main 시작");
		//F11로 실행을 해보면 main 시작 프린트 먼저 실행되고
		t.test();
		//F6으로 한줄씩 실행을 해보면 위 프린트가 끝난 후
		//t.test 메소드가 가지고 있는 클래스로 가서 프린트를 가져와서 출력하고
		System.out.println("main 종료");
		//위 메소드가 끝나면 다시 현재 위치로 돌아와서 main 종료를 실행함
	}

}
