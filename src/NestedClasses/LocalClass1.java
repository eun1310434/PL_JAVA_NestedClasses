/*
 * 18.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 */

package NestedClasses;
class LocalClass1_Outer {
  
    static String regularExpression = "[^0-9]";
  
    public static void validatePhoneNumber(
        String phoneNumber1, String phoneNumber2) {
      
        final int numberLength = 10;
       
        class PhoneNumber {
            
            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber){
                String currentNumber = phoneNumber.replaceAll(
                  regularExpression, "");
                
                if (currentNumber.length() == numberLength){
                	formattedPhoneNumber = currentNumber;
                }else{
                	formattedPhoneNumber = null;
                }
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }
        }

        //Check myNumber1
        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        if (myNumber1.getNumber() == null) {
            System.out.println("First number is invalid");
            
        }else{
            System.out.println("First number is " + myNumber1.getNumber());
            
        }
        
        //Check myNumber2
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);
        if (myNumber2.getNumber() == null){
            System.out.println("Second number is invalid");
            
        }else{
            System.out.println("Second number is " + myNumber2.getNumber());
            
        }
        
    }
}

public class LocalClass1 {
    public static void main(String... args) {
		LocalClass1_Outer.validatePhoneNumber("123-456-7890", "456-7890");
		//LocalClass1_Outer.PhoneNumber oi = LocalClass1_Outer.new PhoneNumber();
		// ERROR - 메서드 내부에 선언이 되어서 접근이 불가
    }
}



