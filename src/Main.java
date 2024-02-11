import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		long x = 1034989094039993493L;
		double y = 3.443;
		boolean z = false;
		String v = "sdsds";
		String r = "jhsdjsd";
		double frn = 10;
		
		String temp, memp;
		
		//String temp= null;
		
		temp = v;
		memp = r;
		v = memp;
		r = temp;
		
		frn = (double) frn / 3;
		
		
		System.out.println("\"Thilina\"");
		System.out.print("24");
		System.out.println("\"");
		System.out.println("My number is "+x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("Hello "+r);
		System.out.println(frn);
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is ur name?");
		String name = scanner.nextLine();
		
		System.out.println("How old are u?");
		int age =scanner.nextInt();
		scanner.nextLine(); //additional scanner is used because the next scanner doesn't let user to input anything if not the additional scanner is used
		
		System.out.println("What is ur fav fd?");
		String food = scanner.nextLine();
		

		System.out.println("My name is "+name);
		System.out.println("I am "+age+ "yrs old");
		System.out.println("My fav fd is "+food);
		
	}

}


