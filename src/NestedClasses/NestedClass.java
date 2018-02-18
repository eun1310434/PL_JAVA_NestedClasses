package NestedClasses;
class NestedClass_Outer {
	int x = 100;

	public void display() {

		System.out.println("["+this.getClass().getName() + "]  x = " + x);
		//System.out.println("["+this.getClass().getName() + "]  y = " + y); 
		// ERROR - NestedClass_Inner 접근 불가능
		
		NestedClass_Inner inner = new NestedClass_Inner();
		System.out.println("["+this.getClass().getName() + "]  y = " + inner.y); 
		//- 외부 클래스(NestedClass_Outer)에서는 내부 클래스(NestedClass_Inner)의 메소드 사용
		//  : 선언 이후 사용 가능
	}
	
	class NestedClass_Inner {
		int y = 200;
		public void display() {
			System.out.println("["+this.getClass().getName() + "]  x = " + x); 
			//- 내부 클래스(NestedClass_Inner)에서 외부 클래스(NestedClass_Outer)의 메소드 사용
			//  : 별도의 선언 없이 사용이 가능
			
			System.out.println("["+this.getClass().getName() + "]  y = " + y); 
		}
	}

}

public class NestedClass {
	public static void main(String[] ar) {
		NestedClass_Outer ot = new NestedClass_Outer();
		NestedClass_Outer.NestedClass_Inner oi = ot.new NestedClass_Inner();

		ot.display();
		oi.display();
	}
}


