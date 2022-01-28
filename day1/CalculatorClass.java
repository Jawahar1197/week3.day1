package week3.day1;

public class CalculatorClass {
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
    private void add(int a, int b, int c) 
    {
		System.out.println(a+b+c);
	}
    private void mult(int a, double b) {
		System.out.println(a*b);
	}
    private void mult(int a, int b) {
		System.out.println(a*b);
	}
    private void sub(int a, int b) {
		System.out.println(a-b);
	}
    private void sub(int a, double b) {
    	System.out.println(a-b);
    }
    public static void main(String[] args) {
		CalculatorClass cal = new CalculatorClass();
		cal.add(5, 3);
		cal.add(5, 3, 5);
		cal.mult(5, 2.50);
		cal.mult(5, 5);
		cal.sub(10, 2.35);
		cal.sub(5, 2);
	}
		
	}