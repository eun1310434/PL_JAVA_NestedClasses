/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
*/

package com.eun1310434.NestedClasses;
class AnonymousClass_Base {
	protected String message;
	
	public AnonymousClass_Base(String _message){
		this.message = _message;
	}
	
	public void display(){
		System.out.println(
				"["+this.getClass().getName() + "]  message = "+message
				); 
	}
}

class AnonymousClass_Outer {
	protected String message;
	
	public AnonymousClass_Outer(String _message){
		this.message = _message;
	}
	
	public void display(){
		AnonymousClass_Base bc = new AnonymousClass_Base(message){
			public void display(){
				//기존의 클래스(AnonymousClass_Base)에 있는 display() 메소드를 재정의 하여 사용
				for(int i = 0; i < 3 ; i++){
					System.out.println(
							"["+this.getClass().getName() + "]  message = "
							   +message
							); 
				}
			}
			
			public void Add_display(){
				//기존의 클래스(AnonymousClass_Base)에 없는 
				//새로운 메소드를 추가생성은 가능 하나 사용은 불가능
				for(int i = 0; i < 2 ; i++){
					System.out.println(
							"["+this.getClass().getName() + "]  message = "
							   +message
							); 
				}
			}
		};
		bc.display();
		//bc.Add_display();
		//ERROR
		//기존의 클래스(AnonymousClass_Base)에 없는 
		//새로운 메소드를 추가생성은 가능 하나 사용은 불가능
	}
}


public class AnonymousClass {
	public static void main(String[] ar) {
		AnonymousClass_Base a1 = new AnonymousClass_Base("a1");
		AnonymousClass_Outer a2 = new AnonymousClass_Outer("a2");
		
		a1.display();

		System.out.println(""); 
		
		a2.display();
	}
}








