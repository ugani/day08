package method;

public class TestClass06 {
	public int sumFunc(int num) {
	int sum=0;
	for(int i=1; i<=num; i++) {
		sum += i;
	}
	//딱 연산만 처리하게함
	
	/*
	 * return
	 * -return 다음에 값이 있으면 해당 값을 돌려주는 역할
	 * -또 값을 돌려주고 메소드를 종료하는 역할
	 * -return 다음에 값이 없으면 메소드를 종료하는 역할
	 */
	
	return sum;
	//리턴을 사용해서 리턴 옆의 값을 메소드를 호출한 곳으로 해당 값을 돌려줌
	//되돌려주고자 하는 값이 정수면 반환타입을 int
	//되돌려주고자 하는 값과 반환타입을 맞춰줘야 문법적으로 에러 발생 없음
	}
}
