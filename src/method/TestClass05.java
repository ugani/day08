package method;

import java.util.Scanner;

public class TestClass05 {
	public void sumFunc(int num) {
		//sumFunc() 괄호 안에 int num을 넣어서
		//메인클래스에서 테스트클래스에 있는 t.sumFunc() 메소드를 호출 할때
		//t.sumFunc() 괄호안에 값을 넣으면 테스트클래스에서 int num으로 그 값을 받아서 
		//괄호 안에 num을 넣으면 스캔으로 입력한 값을 불러와서 int num에 값을 받아와서 합을 구하고
		//괄호 안에 정수를 넣으면 스캔으로 값을 입력해도 괄호 안에 넣은 정수까지의 합을 구함 
		
		//메소드 기능을 나눠서 sumFunc에선 합을 구하는 기능만 넣음
		int sum=0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println("1~"+num+"까지의 합 :"+sum);
	}
}
