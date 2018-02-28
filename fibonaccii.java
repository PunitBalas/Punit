
// Write fibonacci series   first 10 number

public class fibonaccii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valold = 0;
		int valcurrent = 1;
		int valnew = 0;

		for (int i = 0; i < 10; i++) {

			if (i == 0) {
				System.out.println("" + valcurrent);
			}

			valnew = valcurrent + valold;
			valold = valcurrent;
			valcurrent = valnew;

			System.out.println("" + valnew);

		}

	}

}
