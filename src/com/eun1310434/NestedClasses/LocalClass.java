/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.NestedClasses;
class LocalClass_Outer {
	public void display() {
		System.out.println("["+this.getClass().getName() + "]  Display"); 
		
		class LocalClass_Inner {
			private int x;
			private int y;
			private int total;
			
			public LocalClass_Inner(int _x, int _y){
				this.x = _x;
				this.y = _y;
			}

			public void calc() {
				total = x + y;
			}
			
			public void display() {
				System.out.println(
						"["+this.getClass().getName() + "]  "
						+ x + " + " + y + " = " + total
						); 
			}
		}
		
		LocalClass_Inner in = new LocalClass_Inner(100, 200);
		in.calc();
		in.display();
	}
	
	
	
}

public class LocalClass {
	public static void main(String[] ar) {
		LocalClass_Outer out = new LocalClass_Outer();
		//LocalClass_Outer.LocalClass_Inner oi = out.new LocalClass_Inner();
		// ERROR - 메서드 내부에 선언이 되어서 접근이 불가
		
		out.display();
	}
}



