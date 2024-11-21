package numbers;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");

		int num=scanner.nextInt();

		boolean rs=checkPalindrome(num);
		if(rs)
			System.out.println("The entered number is a Palindrome");
		else
			System.out.println("The entered number is not a palindrome number");	
	}

	public static boolean checkPalindrome(int num) {
		int temp=num;

		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;
		}
		if(rev==temp)
			return true;
		else
			return false;
	}
}
