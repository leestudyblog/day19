package interface_;
//조별예제
class A06지상군{
	public void 지상군공격() {
		System.out.println("지상군이 공격");
	}
	public void 지상군방어() {
		System.out.println("지상군이 방어");
	}
}
class b06공군{
	public void 미사일장착() {}
	public void 연료() {}
	public void 시동() {}

	public void 비행기공격() {
		System.out.println("비행기 공격");
	}
	public void 비행기방어() {
		System.out.println("비행기 방어");
	}
}


public class MainClass06 {
	public static void main(String[] args) {
		A06지상군 a = new A06지상군();
		b06공군 b= new b06공군();
		a.지상군공격(); a.지상군방어();
		b.비행기공격(); b.비행기방어();
		
		
		
	}

}
