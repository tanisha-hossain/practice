import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		int g = scan.nextInt();
		int b = scan.nextInt();
		
		int c = 3*r + 4*g + 5*b;
		System.out.print(c);
	}
}
