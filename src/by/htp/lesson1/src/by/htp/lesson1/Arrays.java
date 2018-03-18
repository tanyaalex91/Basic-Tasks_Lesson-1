package by.htp.lesson1;

public class Arrays {

	public static void main(String[] args) {
		int[] mas = new int[10];
		mas[0] = 2;
		mas[1] = 4;
		mas[2] = 5;
		mas[3] = 8;
		mas[4] = 17;
		mas[5] = 6;
		mas[6] = 9;
		mas[7] = 10;
		mas[8] = 15;
		mas[9] = 16;

		int N = mas.length;

		double sum = 0;
		double average = 0.0;

		for (int i = 0; i < N; i++) {
			sum += mas[i];
			average = sum / N;

		}
		System.out.println(average);

	}



	}


