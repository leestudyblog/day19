package interface_;

/*
 up casting()
 - 부모형태로 변환
 - 코드를 간결하게 줄일 수 있다
 down casting()
 - 자식형태로 변환
 type casting 
  - 자료형변환
  
 */

class Parents{
	public void familyName() {
		System.out.println("lee");
	}
	public void name () {
		familyName();
		System.out.println("sunsim");
	}
}
class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println("dou");
	}
}
class Son extends Parents{
	public void name() {
		familyName();
		System.out.println("son");
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		Parents p= new Parents();
		p.name();
		/*Daughter d=new Daughter();
		d.name();
		Son s = new Son();
		s.name();*/
		//업 캐스팅
		p = new Daughter(); //부모 형태로 자식을 받음
		p.name();
		p = new Son();
		p.name();
	}

}
