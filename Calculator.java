package Assignments.Week1_Day2;

public class Calculator {

	public int add(int num1, int num2, int num3) {
		int total;
		total = num1 + num2 + num3;
		return total;
		// System.out.println("Total is: " + total);
	}

	public int sub(int num1, int num2) {
		int difference;
		difference = num1 - num2;
		return difference;

	}

	public double Multiply(double dnum1, double dnum2) {
		double product;
		product = dnum1 * dnum2;
		return product;

	}

	public float Divide(float fnum1, float fnum2) {
		float divison;
		divison = fnum1 / fnum2;
		return divison;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		int result1;
		int result2;
		// double result3;
		// float result4f;
		result1 = calc.add(50, 20, 30);
		System.out.println("Total is: " + result1);
		result2 = calc.sub(result1, 20);
		System.out.println("Difference is: " + result2);
		double result3 = calc.Multiply(10.24, 2.99);
		System.out.println("Mutliplication number is: " + result3);
		float result4 = calc.Divide(20.50f, 5.50f);
		System.out.println("Division is: " + result4);

	}

}
