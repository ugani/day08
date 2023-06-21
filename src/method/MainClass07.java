package method;

import java.util.Scanner;

/*
  메소드 연습 할때 각각 기능을 한개씩
  입력, 출력, 연산하는 기능을 만드는 연습해보기
	TestClass : 입력, 출력, 연산
	MainClass : 기본 호출 및 연동
 */
public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		int n = t.inputDate();
//		System.out.println("실행 결과 :"+n);
		int s = t.opDate(n);
//		System.out.println( s);
		t.printDate(n, s);

	}

}
