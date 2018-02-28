
// Write fibonacci series  which comes up to 100 number 

public class Fibonacci {

	public static void main(String[] args) {

		int valold = 0;
		int valcurrent = 1;
		int valnew = 0;

		for (int i = 0; i < 50; i++) {

			if (i == 0) {
				System.out.println("" + valcurrent);
			}

			valnew = valcurrent + valold;
			valold = valcurrent;
			valcurrent = valnew;

			if (valnew > 100) {

				break;

			} else {

				System.out.println("" + valnew);
			}

		}

	}

}
