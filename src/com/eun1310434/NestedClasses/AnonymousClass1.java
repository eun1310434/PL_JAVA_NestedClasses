/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.NestedClasses;
public class AnonymousClass1 {
	  
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
  
    public void sayHello() {
        
        HelloWorld englishGreeting = new HelloWorld() {
            String name;
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println(
						"["+this.getClass().getName() + "] Hello, " + name);
            }
        };
        
        HelloWorld frenchGreeting = new HelloWorld() {
            String name;
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println(
						"["+this.getClass().getName() + "] Salut, " + name);
            }
        };
        
        HelloWorld spanishGreeting = new HelloWorld() {
            String name;
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println(
						"["+this.getClass().getName() + "] Hola," + name);
            }
        };
        
        
        englishGreeting.greet();
        englishGreeting.greetSomeone("Fred");

		System.out.println(""); 
		
        frenchGreeting.greet();
        frenchGreeting.greetSomeone("Fred");

		System.out.println(""); 
		
        spanishGreeting.greet();
        spanishGreeting.greetSomeone("Fred");
    }

    public static void main(String... args) {
    	AnonymousClass1 myApp =
            new AnonymousClass1();
        myApp.sayHello();
    }            
}






