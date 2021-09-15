package EratosthenesPPAP;

public class sieveOfEratosthenes {

	// Maximum range
	static boolean max[] = new boolean[1000001];

	static void fill() {
		// Maximum Range
		int n = 1000000;

		// Mark all numbers as a prime
		for (int i = 2; i <= n; ++i) {
			max[i] = true;
		}
		for (int i = 2; i <= Math.sqrt(n); ++i) {

			// if number is prime
			if (max[i] == true) {

				// mark all the factors
				// of i non prime
				for (int j = i * i; j <= n; j += i) {
					max[j] = false;
				}
			}
		}
	}

	static void range(int L, int R) {
		for (int i = L; i <= R; ++i) {

			// checking the prime number
			if (max[i] == true) {
				// print the prime number
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		// starting in a range
		int L = 12500;

		// ending in a range
		int R = 12600;

		// mark all the numbers
		fill();

		// printing the prime numbers in range
		range(L, R);
	}

}
