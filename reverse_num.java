import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int reversed=0,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to be reversed :");
		num=sc.nextInt();
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		System.out.print("Reversed numbers are :"+reversed);
	}
}
