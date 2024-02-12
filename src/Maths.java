import java.util.Scanner;

public class Maths {

	public static void main(String[] args) {
		
	/*	double x = 2.44334;
		double y = -12.232;
		
		double z = Math.floor(x);
		
		System.out.println(z); */
		
		double a, b , c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value for a");
		a = scanner.nextDouble();
		
		System.out.println("Enter the value for b");
		b = scanner.nextDouble();
		
		c = Math.sqrt((a*a)+(b*b));
		
		System.out.println("The hypotenuse is "+c);
		
		scanner.close();
		

	}

}
