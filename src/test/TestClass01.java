package test;

import com.care.test.MemberClass;

public class TestClass01 {

	public static void main(String[] args) {
		//같은 공간(프로젝트)에 해당하는 
		//파일(사용할 클래스)이 없으면 사용 할 수 없음
		//export로 jar파일로 내보낸걸 이곳으로 불러와서 사용은 가능
		
		MemberClass mem = new MemberClass();
		mem.name = "김방구";
		System.out.println("이름 :" +mem.name);

	}

}
