package interface_;

public class B08공군 implements Unit08 {

	@Override
	public void attack() {
		System.out.println("공군 공격");
	}

	@Override
	public void defense() {
		System.out.println("공군 방어");
		
	}

}
