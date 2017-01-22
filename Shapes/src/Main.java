
import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (number % 2 == 0) {
			for (int i = 1; i < number / 2 + 1; i++) {
				for (int a = 1; a <= (number / 2) - i; a++) {
					System.out.print("-");
				}

				System.out.print("*");

				for (int b = 0; b < (i - 1) * 2; b++) {
					System.out.print("-");
				}

				System.out.print("*");

				for (int a = 1; a <= (number / 2) - i; a++) {
					System.out.print("-");
				}
				System.out.println();
			}
			int counter = 1;
			for (int i = (number / 2) - 1; i >= 1; i--) {
				for (int a = 0; a < counter; a++) {
					System.out.print("-");
				}

				System.out.print("*");
				for (int b = 0; b < (i - 1) * 2; b++) {
					System.out.print("-");
				}
				System.out.print("*");
				for (int a = 0; a < counter; a++) {
					System.out.print("-");
				}
				counter++;
				System.out.println();
			}

		} else {
			int counter = 1;
			for (int i = 0; i < number / 2 + 1; i++) {
				for (int a = 0; a < (number / 2) - i; a++) {
					System.out.print("-");
				}
				if (i == 0) {
					System.out.print("*");
					for (int a = 0; a < (number / 2) - i; a++) {
						System.out.print("-");
					}
					System.out.println();
					continue;
				} else {
					System.out.print("*");
					for (int b = 0; b < counter; b++) {
						System.out.print("-");
					}
					System.out.print("*");
					for (int a = 0; a < (number / 2) - i; a++) {
						System.out.print("-");
					}
				}
				counter += 2;
				System.out.println();
			}
			counter = 1;
			int counter2 =number - 4;
			for (int i = number / 2; i >= 1; i--) {
				for(int a=0;a<counter;a++){
					System.out.print("-");
				}
				if(i==1){
					System.out.print("*");
					for(int a=0;a<counter;a++){
						System.out.print("-");
					}
					System.out.println();
					continue;
				}else{
					System.out.print("*");
					for(int b =0;b<counter2;b++){
						System.out.print("-");
					}
					System.out.print("*");
					for(int a=0;a<counter;a++){
						System.out.print("-");
					}
				}
				counter2-=2;
				counter++;
				
				System.out.println();
			}
		}
	}
}