package overriding;
//finalClass
final class A04{ //상속 받을 수 없게 만듦 + 오버라이딩 x
	public void test() {
		System.out.println("부모");
	}
}
class B04 {
	A04 a= new A04(); //상속 못받음 직접 객체 생성
	public void test() {
		a.test();
		System.out.println("자식");
	}
}


public  class MainClass04 {
	public static void main(String[] args) {
		B04 b = new B04();
		b.test();
		
		
		
	}

}
