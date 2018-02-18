package by.htp.lesson1;

public class Cycle_Operators {

	public static void main(String[] args) {

		// //1.1 ¬ывести на экран все четные цифры от 1 до 100 (использу€ цикл for)
		 for (int x = 2; x <=100; x = x+2) {
		 System.out.println(x);
		 }
		 
		 System.out.println("===============================================");
		//
		// //1.2. ¬ывести на экран все нечетные цифры от 1 до 15 (не использу€ цикл for)
	 int z = 1;
		while (z <=13){
	
	 z = z +2;
	System.out.println(z);}
	System.out.println("========================================================");

		// 1.4 ѕосчитать сумму цифр от 20 до 200 и результат вывести на экран (использу€
		// цикл for)

	int sum = 0;

for (int y = 20; y <=200; y++) {
	sum = sum+y;
}
		System.out.println(sum);
		
		System.out.println("===================================================");
		
////1.5 ѕройти циклом по числам от 1 до 12 и вывести название мес€ца,
		// соответствующее каждому числу (использу€ цикл и оператор if else)
		
	
	for (int month = 1; month <=12; month++) {
	
		if (month ==1) {
			System.out.println("January");
		}
		else {	
			System.out.println("February");
			System.out.println("March");
			System.out.println("April");
			System.out.println("May");
			System.out.println("June");
			System.out.println("July");
			System.out.println("August");
			System.out.println("September");
			System.out.println("October");
			System.out.println("November");
			System.out.println("December");
			
			break;
		}
			
//			if (month ==2) {
//				System.out.println("February");
//			}
//				else {	
//					System.out.println("March");
//	}
//			if (month ==3) {
//				System.out.println("March");
//			}
//				else {	
//					System.out.println("April");
//	}
//			
//			if (month ==4) {
//				System.out.println("April");
//			}
//				else {	
//					
//					System.out.println("May");		
//	}
//			
//			
//			if (month ==5) {
//				System.out.println("May");
//			}
//				else {	
//					
//					System.out.println("June");		
//	}	
//			
//			if (month ==6) {
//				System.out.println("June");
//			}
//				else {	
//					
//					System.out.println("July");		
//	}	
//			
//			if (month ==7) {
//				System.out.println("July");
//			}
//				else {	
//					
//					System.out.println("August");		
//	}	
//			
//			if (month ==8) {
//				System.out.println("August");
//			}
//				else {	
//					
//					System.out.println("September");		
//	}	
//			if (month ==9) {
//				System.out.println("September");
//			}
//				else {	
//					
//					System.out.println("October");		
//	}	
//			
//			if (month ==10) {
//				System.out.println("October");
//			}
//				else {	
//					
//					System.out.println("November");		
//	}	
//			if (month ==11) {
//				System.out.println("November");
//			}
//				else {	
//					
//					System.out.println("December");		
	}	
			
				
	}	
			
		}
