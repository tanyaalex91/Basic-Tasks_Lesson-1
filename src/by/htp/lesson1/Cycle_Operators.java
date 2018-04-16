package by.htp.lesson1;

public class Cycle_Operators {

	public static void main(String[] args) {

		// //1.1 
		for (int x = 2; x <= 100; x = x + 2) {
			System.out.println(x);
		}

		System.out.println("===============================================");
		//
		// //1.2.
		int z = 1;
		while (z <= 13) {

			z = z + 2;
			System.out.println(z);
		}
		System.out.println("========================================================");

		// 1.4 

		int sum = 0;

		for (int y = 20; y <= 200; y++) {
			sum = sum + y;
		}
		System.out.println(sum);

		System.out.println("===================================================");

		//// 1.5 

		for (int month = 1; month <= 12; month++) {

			if (month == 1) {
				System.out.println("January");
			} else {
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

		}

	}

}
