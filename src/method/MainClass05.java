package method;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		//메인에서는 값을 입력받는 기능
		Scanner input = new Scanner(System.in);
		int num =0, sum=0;
		System.out.print("수 입력: ");
		num = input.nextInt();
		
		TestClass05 t = new TestClass05();
		t.sumFunc( 100 );
		//값을 100을 넣으면 어떤 값을 입력해도 1~100까지 합을 출력함
		// num을 넣으면 입력한 값을 테스트클래스에 int num에 보내서 
		// 입력한 값까지의 합을 출력해줌
		
	}

}
