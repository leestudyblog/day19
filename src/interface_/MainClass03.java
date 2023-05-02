package interface_;

abstract class A03{
	public abstract void a03() ;//추상화 메소드
	
	public void test() {
		System.out.println("test");
	}
}
class B03 extends A03{
	public void b03() {
		System.out.println("new system");
	}

	@Override
	public void a03() {
		System.out.println("new");		
	}
}


public class MainClass03 {
	public static void main(String[] args) {
		B03 b = new B03();
		b.a03(); b.b03(); b.test();
			
	}

}
