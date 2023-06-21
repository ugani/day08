package method;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass08 {
	public static void main(String[] args) {
		TestClass08 t = new TestClass08();
		t.test1();
//		t.test2("aa");
		String s = t.test2(null);
		//리턴의 결과값을 받을 땐 String s에 저장해서 받아옴
		//그 값을 받지 않을땐 null 또는 0이 출력이됨
		
		System.out.println("test05 실행");
		int[] a = t.test5();
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		System.out.println("test06 실행");
		ArrayList<String> ar = new ArrayList<>();
		ar.add("안녕"); ar.add("하세");
		HashMap<String, String> m = t.test06(ar);
		System.out.println(m);
	}

}
