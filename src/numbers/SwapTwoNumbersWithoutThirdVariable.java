package numbers;

public class SwapTwoNumbersWithoutThirdVariable {
	
	public static void main(String[] args) {
		int a=70;
		int b=40;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+" "+b);
	}

}
