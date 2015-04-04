public class TextLab13_Matthew_Pearce {

	// TextLab13st.java
	// The Recursive Methods Program
	// This is the student, starting version of the TextLab13 assignment.
	// Students need to write the implementations of the
	// <countUp>, <countDown>, <sum>, <fact>, <pow>, <fibo>, and <gcf> methods.

	public static void main(String args[]) {
		System.out.println("TextLab13");
		skip2(2);
		System.out.println("Counting from 1 up to 10");
		Test.countUp(1, 10);
		skip3(3);
		System.out.println("Counting from 10 down to 1");
		Test.countDown(1, 10);
		skip3(3);
		System.out.println("The sum of all integers 0 to 100 are "
				+ Test.sum(100));
		skip2(2);
		System.out.println("The factorial of 8 is " + Test.fact(8));
		skip2(2);
		System.out.println("The 10th Fibonacci Number is " + Test.fibo(10));
		skip2(2);
		System.out.println("The GCF of 120 and 108 is " + Test.gcf(120, 108));
		skip2(2);
		System.out.println("2 raised to the 8th power is " + Test.pow(2, 8));
		skip2(2);
	}

	static int skips = 0;

	public static void skip2(int skips) {
		if (skips > 0) {
			System.out.print("\n");
			skip2(skips - 1);
		}
	}

	public static void skip3(int skips) {

		if (skips > 0) {
			System.out.print("\n");
			skip3(skips - 1);
		}
	}
}

class Test {
	public static void countUp(int k, int n) {
		// displays consecutive integers from k to n

		if (k <= n) {
			System.out.println(k);
			countUp(k + 1, n);
		}
	}

	public static void countDown(int k, int n)
	// displays consecutive integers backwards from k to n
	{
		if (k <= n) {
			countDown(k + 1, n);
			System.out.println(k);
		}
	}

	public static int sum(int n)
	// returns the sum of all integers 1 + 2 + .... + n-1 + n
	{
		if (n == 0) {
			return 0;
		} else {
			return n + sum(n - 1);
		}
	}

	public static int fact(int n)
	// returns n factorial
	{
		if (n == 0) {
			return 0;
		} else {

			return n * fact(n - 1);
		}
	}

	public static int fibo(int n)
	// returns the nth Fibonacci number
	{
		if (n == 0) {
			return 0;
		} else {
			return n + fibo(n - 1);
		}

	}

	public static int gcf(int n1, int n2)
	// returns the gcf of n1 and n2
	{
		int rem = n1 % n2;
		if (rem == 0)
			return n2;
		else
			return gcf(n2, rem);
	}

	public static int pow(int n1, int n2)
	// returns n1 raised to the n2 power
	{
		if (n2 == 0 || n1 == 1)
			return 1;

		else
			return n1 * pow(n1, n2 - 1);

	}

}
