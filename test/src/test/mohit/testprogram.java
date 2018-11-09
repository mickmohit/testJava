package test.mohit;

public class testprogram {

	public static void main(String args[])
	{
		System.out.println("Hello World");
		
		String a="aba";
		
		char b[]=a.toCharArray();
		
		boolean m=false;
		m=pallendrometest(a);
		
		if(m=true)
		{
			System.out.println("no is pallindrome");
		}
		else
		{
			System.out.println("not a pallindrome");
		}
		
		/*for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
			
			
		}*/
	}
	
	public static boolean pallendrometest(String a)
	{
		
		boolean t=false;
	
		char b[]=a.toCharArray();
		char c[]=new char[b.length];
		for(int i=b.length-1;i>=0; i--)
		{
			c[i]=b[i];
			
	}
		
		for(int i=0; i<b.length; i++)
		{
			if(c[i]==b[i])
			{
				t=true;
			}
		
	}	
		
		return t;
}
	
}
