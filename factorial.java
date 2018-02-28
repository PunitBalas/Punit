import java.util.Scanner;

// write a program for factorial user input any number and we want that factorial

public class factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter any number");
		int givenNum = sc.nextInt();
		
		findfactorial(givenNum);

		
}
	
	public static int findfactorial(int givenNum){
		
		
		int num = 1;

		for (int i = givenNum; i >= 1; i--) {

			num = num * i;

		}
		System.out.println("here updated n is " + num);
		
		return num;
	}

}
