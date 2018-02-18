package NestedClasses;
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






