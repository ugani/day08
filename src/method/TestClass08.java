package method;

import java.util.ArrayList;
import java.util.HashMap;

public class TestClass08 {
	public void test1() {
		//void : return값이 없는 경우
		//void를 쓸떄 리턴을 쓸순 있지만 리턴 옆의 값은 돌려줄수없다!!
		int num = 1;
		if(num == 1) {
			System.out.println("if 실행");
//			return;
			//
		}
		System.out.println("다음 문장들 실행");
	}
	public String test2(String s) {
		return null;
	}
	public int test3() {
		int num = 1;
		if (num == 1)
			return 100;
			//조건문이 맞아도 조건문 바로 아래 
			//return 100은 실행되지 않음
			
		
		return 0;
		//리턴 값은 마지막에 놔야 문법적으로 오류 발생안함
		//또는 else를 사용해서 리턴을 사용함
	}
	
//	public String test4() {
//		int num = 1;
//		if(num == 1) {
//			return null;
//		}else {
//			return 100;
			//반환타입이 스트링이므로 정수는 리턴으로 반환 안됨
//		}
//	}
	
	public int[] test5() {
		//리턴은 내가 돌려주고자 하는 값과 똑같이 해줘야한다.
		int n1=100, n2=200;
//		return n1,n2;
		//리턴으로는 여러개의 값을 돌려줄수없다
		int[] arr = {n1, n2};
		return arr;	
	}
	public HashMap<String, String> test06(ArrayList<String> arr) {
		
		System.out.println("0 :"+arr.get(0));
		System.out.println("1 :"+arr.get(1));
		HashMap<String, String> map = new HashMap<>();
		map.put("키1", "값111");
		String re = map.put("키2", "값222");
		System.out.println("re :"+re);
		return map;
		
	}
}
