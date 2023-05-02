/*
 *overriding 
 - 상속받은 자식 클래스에서 부모 메소드 대신 자신의메소드를 실행한는 것
 - 자신에게 맞게 변경하는 것
 - 부모 메소드와 동일한 이름, 반환타입, 매개변수를 맞춰야한다
 - 부모의 접근 제한자보다 크거나 같아야한다
 - private < package < protected, public
  
 */

/*
package overriding;

class Ferrari{
	private int speed;
	public void Ferrari(int ye) {
		this.ye= ye;
		
	} 
	public int getYe() {return ye;}
	
	public void speed () {
	System.out.println(getYe + "년식 페라리 속도 300Km");
}
	
	}


class NewF extends Ferrari{
	public NewF(int  ye) {super ye;}
	public void autoSystem() {
		System.out.println("자동운전모드");
	}
	public void speed () {
		System.out.println(getYe + "년식 페라리 속도 500Km");
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		Ferrari f = new Ferrari();
		f.speed;
		NewF nf = NewF();
		nf.speed(); nf.autoSystem();
	}

}*/
