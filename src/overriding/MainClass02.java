package overriding;

import java.util.ArrayList;

class A02 extends ArrayList<String>{//arraylist  상속
	String [] arr = new String[3];
	public void test() {}

	@Override
	public boolean add(String e) { //alt +shift +s +overrride 부모가 가진 형식으로 생성
		System.out.println("내용을 추가해 줍니다.");
		arr[0] =e;
		//return super.add(e);//부모 add실행
		return true;
	}

	@Override
	public String get(int index) {
		System.out.println("내가 만든 get 실행");
		return arr[index];
	}
	
}//a02

public class MainClass02 {
	public static void main(String[] args) {
		A02 a= new A02();
		a.add("안녕하세요");
		System.out.println(a.get(0));
	}

}
