package method;

import java.util.Scanner;

public class TestClass07 {
	//메소드를 호출할 기본 코드
	public int inputDate() {
		Scanner input = new Scanner(System.in);
		int num=0, sum=0;
		System.out.print("수 입력 :");
		num = input.nextInt();
		return num;
	}
	
	public void printDate(int num, int sum) {
		System.out.println("1~"+num+"까지의 합: "+sum);
	}
	
	public int opDate(int num) {
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		return sum;
		

	}
	

}
