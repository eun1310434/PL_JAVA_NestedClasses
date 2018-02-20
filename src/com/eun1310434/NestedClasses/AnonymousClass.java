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
				//������ Ŭ����(AnonymousClass_Base)�� �ִ� display() �޼ҵ带 ������ �Ͽ� ���
				for(int i = 0; i < 3 ; i++){
					System.out.println(
							"["+this.getClass().getName() + "]  message = "
							   +message
							); 
				}
			}
			
			public void Add_display(){
				//������ Ŭ����(AnonymousClass_Base)�� ���� 
				//���ο� �޼ҵ带 �߰������� ���� �ϳ� ����� �Ұ���
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
		//������ Ŭ����(AnonymousClass_Base)�� ���� 
		//���ο� �޼ҵ带 �߰������� ���� �ϳ� ����� �Ұ���
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








