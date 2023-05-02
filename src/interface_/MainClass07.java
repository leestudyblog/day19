package interface_;

interface Unit07{ //조별과제 예제 - 이름통일 & 원하는 기능 
	public void attack();
	public void defense();
}
class A07 implements Unit07{
	public void 총알장전() {}
	public void 기름칠() {}
	public void attack() {
		
		System.out.println("지상군 공격");
	}
	public void defense() {
		System.out.println("지상군 방어");

	}
}

public class MainClass07 {
	

	public static void main(String[] args) {
		Unit07 a = new A07(); //부모형태로 업캐스팅
		a.attack(); //원하는 코드만 관람
		
	}

}
