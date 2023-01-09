package ch06;

//클래스 선언 : ch06.Car1
class Car1{
	//Field : 객체의 속성
	//Method : 객체의 기능
	String carName;
	String carColor;
	int velocity;
	
	int speedUp() {
		velocity++;
		return velocity;
	}
	void speedDown() {
		velocity--;
		if(velocity<0)stop();
	}
	void stop() {
		velocity = 0;
	}
}

//.java로 선언된 클래스만 public 사용가능
public class CarEx1 {

	public static void main(String[] args) {
		int arr[] = new int[3];
		System.out.println(arr.length);
		String str = "오늘의 메뉴는 수구레";
		System.out.println(str.length());
		
		//객체 생성
		String s;
		Car1 c1 = new Car1();
		c1.carName = "소나타";
		c1.carColor = "은색";
		System.out.println(c1.speedUp());
		c1.speedDown();
		c1.speedDown();
		System.out.println(c1.velocity);
	}

}
