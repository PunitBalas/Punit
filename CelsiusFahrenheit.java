import java.util.Scanner;

// write a program for convert Celsius to Fahrenheit

public class CelsiusFahrenheit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any celsius value");
		float celsiusval = sc.nextInt();

		convertFahrenheit(celsiusval);

	}

	public static float convertFahrenheit(float celsiusval) {

		float Fahrenheitval = 0;

		System.out.println("celsiusval value is" + celsiusval);

		Fahrenheitval = (celsiusval * 9 / 5) + 32;

		System.out.println("Fahrenheitval value is" + Fahrenheitval);
		return Fahrenheitval;
	}

}
