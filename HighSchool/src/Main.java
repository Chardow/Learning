import java.util.Scanner;
public class Main {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numbers = input.nextInt();
		int minNumber=0;
		int number;
		for(int i = 0; i<numbers;i ++){
			number = input.nextInt();
			if(i == 0){
				minNumber =number;
				continue;
			}
			
			if(number<minNumber){
				minNumber = number;
			}
			
		}
		System.out.println(minNumber);
	}
}