package numbers;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();


		// 1.First Approach

		int rev1=0;

		while(num!=0){

			rev1=rev1*10+num%10;

			num=num/10;

		}

		System.out.println(rev1);


		// 2.First Approach		

		StringBuilder sb=new StringBuilder();
		sb.append(num);	
		StringBuilder rev2=sb.reverse();

		System.out.println(rev2);


		// 3.First Approach

		StringBuffer buffer=new StringBuffer(String.valueOf(num));
		StringBuffer rev3=buffer.reverse();

		System.out.println(rev3);


	}

}
