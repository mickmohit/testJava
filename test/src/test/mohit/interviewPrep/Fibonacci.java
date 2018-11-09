package test.mohit.interviewPrep;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c=0;
		a=0;b=1;
		for(int i=1;i<=10;i++)
		{
			System.out.println(a +" "+ i+ "times");
			c=a+b;
			a=b;
			b=c;
			
		}
		
	}

}
