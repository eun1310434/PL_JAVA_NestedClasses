/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/
package com.eun1310434.NestedClasses;
class NestedClass_Outer {
	int x = 100;

	public void display() {

		System.out.println("["+this.getClass().getName() + "]  x = " + x);
		//System.out.println("["+this.getClass().getName() + "]  y = " + y); 
		// ERROR - NestedClass_Inner ���� �Ұ���
		
		NestedClass_Inner inner = new NestedClass_Inner();
		System.out.println("["+this.getClass().getName() + "]  y = " + inner.y); 
		//- �ܺ� Ŭ����(NestedClass_Outer)������ ���� Ŭ����(NestedClass_Inner)�� �޼ҵ� ���
		//  : ���� ���� ��� ����
	}
	
	class NestedClass_Inner {
		int y = 200;
		public void display() {
			System.out.println("["+this.getClass().getName() + "]  x = " + x); 
			//- ���� Ŭ����(NestedClass_Inner)���� �ܺ� Ŭ����(NestedClass_Outer)�� �޼ҵ� ���
			//  : ������ ���� ���� ����� ����
			
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


