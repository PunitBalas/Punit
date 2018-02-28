import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter any number");

		int enternum = sc.nextInt();

		evenodd(enternum);

	}

	public static int evenodd(int n) {

		// System.out.println("in even odd method");
		int m;

		if (n % 2 == 0) {

			System.out.println("this is even");
		} else {

			System.out.println("this is odd");
		}

		return n;
	}

}
