package NestedClasses;
class StaticNestedClass_Outer {
	private int x1 = 100;
	private static int x2 = 200;
	
	
	//public class StaticNestedClass_Inner { 
		// ERROR - Static 클래스로 선언 해야 
	    //         Static 변수(private static int z) 사용 가능
	static class StaticNestedClass_Inner {
		private int y = 200;
		private static int z = 300;
		
		public StaticNestedClass_Inner(int _y, int _z){
			this.y = _y;
			// this.z = _z;
			// WARNING - Static 메소드 이기에 변수 선언이 아닌 클래스 이름으로 접근이 가능
			
			StaticNestedClass_Inner.z = _z;
			// Static 메소드 이기에 변수 선언이 아닌 클래스 이름으로 접근
		}

		public void display_x() {
			//System.out.println("["+this.getClass().getName() + "]  x = " + x1); 
			//Cannot make a static reference to the non-static field x1
			//Static으로 선언된 StaticNestedClass_Inner 클래스에서 non-static메소드(x1) 접근 불가
			
			System.out.println("["+this.getClass().getName() + "]  x = " + x2); 
			//Static으로 선언된 StaticNestedClass_Inner 클래스에서 static메소드(x2) 접근 가능
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
		// in1의 변수 "y = 500" 이 되고 static변수  "z = 5000"이 된다
		
		StaticNestedClass_Outer.StaticNestedClass_Inner in2 
		= new StaticNestedClass_Outer.StaticNestedClass_Inner(1000, 10000);
		// in2의 변수 "y = 1000" 이 되고 static변수  "z = 10000"이 된다
		// 결국 in1에서 설정한 static변수 "z = 5000"은 static 이기에 "z = 10000"으로 바뀜
		
		in1.display_x();
		in2.display_x();

		System.out.println(""); 
		in1.display_y();
		in2.display_y();

		System.out.println(""); 
		// in1.display_z(); 
		// WARNING - Static 메소드 이기에 변수 선언이 아닌 클래스 이름으로 접근이 가능
		StaticNestedClass_Outer.StaticNestedClass_Inner.display_z();
		// Static 메소드 이기에 변수 선언이 아닌 클래스 이름으로 접근
		
		// in2.display_z();
		// WARNING - Static 메소드 이기에 변수 선언이 아닌 클래스 이름으로 접근이 가능
		StaticNestedClass_Outer.StaticNestedClass_Inner.display_z();
		// Static 메소드 이기에 변수 선언이 아닌 클래스 이름으로 접근
	}
}
