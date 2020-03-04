import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		System.out.print("Enter year: ");
		int year = scanner.nextInt();
		System.out.println(is_leap(year));
	}
	
	static boolean is_leap(int year) {
		boolean leap = false;
	    
	    if (year%400==0)
	        leap = true;
	    else if (year%100==0)
	        leap = false;
	    else if (year%4==0)
	        leap = true;
	    
	    return leap;
	}
}
