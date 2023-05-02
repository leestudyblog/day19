package overriding;

import java.util.ArrayList;

//object
class A03{}
class B03 extends A03{}
class C03{
	int age;
	String name;
	@Override
	public String toString() {
		return "["+age+","+name+"]";//오버라이딩으로 정보표시 -> 값표시
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		//B03 b = new B03();
		//A03 b = new B03();
		Object b = new B03(); 
		Object num = "aaa"; //자료형 상관없이 모든 값을 받음
		ArrayList<String > arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		C03 c = new C03();
		c.age =20; c.name = "lee";
		System.out.println(c);//클래스 주소출력
		System.out.println(c.toString());//추소출력
		System.out.println(arr);// 값 출력
		System.out.println(arr.toString());//값 출력
		
	}

}
