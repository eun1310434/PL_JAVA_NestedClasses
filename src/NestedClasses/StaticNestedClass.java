package NestedClasses;
class StaticNestedClass_Outer {
	private int x1 = 100;
	private static int x2 = 200;
	
	
	//public class StaticNestedClass_Inner { 
		// ERROR - Static Ŭ������ ���� �ؾ� 
	    //         Static ����(private static int z) ��� ����
	static class StaticNestedClass_Inner {
		private int y = 200;
		private static int z = 300;
		
		public StaticNestedClass_Inner(int _y, int _z){
			this.y = _y;
			// this.z = _z;
			// WARNING - Static �޼ҵ� �̱⿡ ���� ������ �ƴ� Ŭ���� �̸����� ������ ����
			
			StaticNestedClass_Inner.z = _z;
			// Static �޼ҵ� �̱⿡ ���� ������ �ƴ� Ŭ���� �̸����� ����
		}

		public void display_x() {
			//System.out.println("["+this.getClass().getName() + "]  x = " + x1); 
			//Cannot make a static reference to the non-static field x1
			//Static���� ����� StaticNestedClass_Inner Ŭ�������� non-static�޼ҵ�(x1) ���� �Ұ�
			
			System.out.println("["+this.getClass().getName() + "]  x = " + x2); 
			//Static���� ����� StaticNestedClass_Inner Ŭ�������� static�޼ҵ�(x2) ���� ����
		}
		
		public void display_y() {
			System.out.println("["+this.getClass().getName() + "]  y = " + y); 
		}
		
		public static void display_z(){
			System.out.println("["+StaticNestedClass_Inner.class.getName()+"]  z = " + z); 
		}
	}

}

public class StaticNestedClass {
	public static void main(String[] ar) {
		StaticNestedClass_Outer.StaticNestedClass_Inner in1 
		= new StaticNestedClass_Outer.StaticNestedClass_Inner(500, 5000);
		// in1�� ���� "y = 500" �� �ǰ� static����  "z = 5000"�� �ȴ�
		
		StaticNestedClass_Outer.StaticNestedClass_Inner in2 
		= new StaticNestedClass_Outer.StaticNestedClass_Inner(1000, 10000);
		// in2�� ���� "y = 1000" �� �ǰ� static����  "z = 10000"�� �ȴ�
		// �ᱹ in1���� ������ static���� "z = 5000"�� static �̱⿡ "z = 10000"���� �ٲ�
		
		in1.display_x();
		in2.display_x();

		System.out.println(""); 
		in1.display_y();
		in2.display_y();

		System.out.println(""); 
		// in1.display_z(); 
		// WARNING - Static �޼ҵ� �̱⿡ ���� ������ �ƴ� Ŭ���� �̸����� ������ ����
		StaticNestedClass_Outer.StaticNestedClass_Inner.display_z();
		// Static �޼ҵ� �̱⿡ ���� ������ �ƴ� Ŭ���� �̸����� ����
		
		// in2.display_z();
		// WARNING - Static �޼ҵ� �̱⿡ ���� ������ �ƴ� Ŭ���� �̸����� ������ ����
		StaticNestedClass_Outer.StaticNestedClass_Inner.display_z();
		// Static �޼ҵ� �̱⿡ ���� ������ �ƴ� Ŭ���� �̸����� ����
	}
}
