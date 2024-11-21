package strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scanner.nextLine();
		
//		1.First Approach
		
		String rev1="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev1+=str.charAt(i);
		}
		
		System.out.println("Reversed String is: "+rev1);
		
//		2.Second Approach
		
		String rev2="";
		
		char[] ch=str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			rev2+=ch[i];
		}
		System.out.println("Reversed String is: "+rev2);
		
		
//		3.Third Approach
	
		StringBuffer buffer=new StringBuffer(str);
		buffer.reverse();
		System.out.println("Reversed String is: "+buffer);
				
	}

}
