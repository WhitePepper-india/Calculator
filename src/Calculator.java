import java.util.Scanner;

// import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		Calculator C= new Calculator();
		
		System.out.println("Enter the first no. :");
		int a = scan.nextInt();
		
		System.out.println("Enter the second no. :");
		int b = scan.nextInt();
		
		C.Addition(a,b);
		C.Subtraction(a,b);
		C.Division(a,b);
		C.Multiplication(a,b);
	}
	void Addition(int a, int b) {System.out.println(a+b);}
	void Subtraction(int a, int b) {System.out.println(a-b);}
	void Division(int a, int b) {System.out.println(a/b);}
	void Multiplication(int a, int b) {System.out.println(a*b);}
}
