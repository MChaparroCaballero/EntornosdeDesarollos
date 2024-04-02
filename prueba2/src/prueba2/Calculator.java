package prueba2;

import static org.junit.Assert.assertEquals;

public class Calculator {

	public int evaluate(String expression) {
		int sum = 0;
		for (String summand : expression.split("\\+"))
			sum += Integer.valueOf(summand);
		return sum;
	}

	public int factorial(int d) {
		for (int i = d - 1; i >= 1; i--) {
			d = d * i;
		}
		return d;
	}

	public boolean primo(int d) {
		boolean esPrimo;
		if (d % 4 != 0 && d % d == 0 && d % 1 == 0) {
			return esPrimo=true;

		} else {
			return esPrimo=false;
		}

	}

	public boolean perfecto(int d) {
		boolean esPerfecto;
		int sumaDivisores = 0;
		for (int i = 1; i <= d / 2; i++) {
			if (d % i == 0) {
				sumaDivisores += i;
			}
		}
		if (sumaDivisores == d) {
			return esPerfecto = true;
		} else {
			return esPerfecto = false;

		}
	}
}