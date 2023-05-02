package interface_;

import java.util.Scanner;

/*interface Unit08{
	public void attack();
	public void defense();
}
*/

public class MainClass08 {
	public static void main(String[] args) {
		
		Unit08 unit = new Unit08();
		
		//A08지상군 a = new A08지상군();
		//B08공군 b =new B08공군();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("지상군이 쳐들어옴");
		System.out.println("1. 지상군 2. 공군");
		int num = sc.nextInt();
		if(num ==1) {
			unit =new A08지상군();
			System.out.println("지상군 선택");
		}else {
			unit =new A08공군();
			System.out.println("공군선택");
		}
		
		System.out.println("1. 공격 2. 방어");
		int cho = sc.nextInt();
		/*
		if (num==1 && cho ==1) {
			a.attack();
		}else if(num ==1 && cho ==2){
			a.defense();
		}
		if (num==2 && cho ==1) {
			b.attack();
		}else if(num ==2 && cho ==2){
			b.defense();
		}*/
		
		if(cho ==1) {
			unit.attack();
		}
		else {
			unit.defense();
		}
		
	}

}
