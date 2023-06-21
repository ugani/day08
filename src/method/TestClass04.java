package method;

import java.util.Scanner;

public class TestClass04 {
	/*
	 * 메소드 이름을 지정하는 경우 첫 문자는 소문자
	 * 합성어의 첫 문자는 대문자로 지으며
	 * 해당 하는 기능에 부합한 이름을 지정한다.
	 */
	public void sumFunc() {
		//메소드 이름 첫글자는 소문자, 합성어의 첫문자는 대문자
		
		Scanner input = new Scanner(System.in);
		int num =0, sum=0;
		System.out.print("수 입력: ");
		num = input.nextInt();
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println("1~"+num+"까지의 합 :"+sum);
		//위와 같이 sumPunc처럼 한개의 메소드에 여러 기능이 있으면 강한 결합이라고 함
		//한개의 메소드에 한개의 기능만 있으면 약한 결합
		//(한개씩 사용하는게 제일 좋음, 기능별로 불러와서 사용 가능)
	}
}
