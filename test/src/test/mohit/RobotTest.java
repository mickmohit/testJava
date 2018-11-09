package test.mohit;

import java.util.Scanner;

public class RobotTest {

	static int total_charge=100;
	static int total_distance=5;
	static double charge_per_km=total_charge/total_distance;
	static int weight_charge=2;
	 static boolean signal=false;
	public static void main(String[] args)
	{
		
	
		System.out.println("Enter KM & Weight");
		 Scanner sc = new Scanner(System.in);
		 double i1 = (double)sc.nextDouble();
		 int i2 = sc.nextInt();
		 double battery_consumed=0.0;
		 if(i2>10) {
			 System.out.println( "Overweight");
		 }
		 else {
			 if( i1==0 ) i1=0; if(i2 == 0 ) i2=0; 
			 
		 battery_consumed=power_Consumed(i1,i2);
		 double battery_remaining=total_charge-battery_consumed;
			System.out.println("remaining battery" +battery_remaining);
			
			signal=light_display(battery_remaining);
			if(signal==false)
			System.out.println("Battery ok");
			else System.out.println("Battery not okay");
			
		 }
		
		 System.out.println("Want to scan any bar code and display it's price, Type Yes to check");
		 String s=sc.next();
		 
		 if(s.equals("Yes")) {
			System.out.println("Press 1 for successful bar code read and 0 or any other no. for unsuccessful bar code read");
			
			 int i3 = sc.nextInt();
			 if(i3==1)
			 {System.out.println(" Bar code read successfully, Default price is 10 Rs.");}
			 else
				 System.out.println("Scan Failure");
	}
		 		 
	}
	public static boolean light_display( double i) 
	{
		
		if(i<15)
		
		return true;
		return false;
		
	} 
	
	
	public static double power_Consumed(double i1, int weight)
	{
		if(i1>0 && weight==0)
		{double x;
		x=charge_per_km*i1+weight;
		return x;}
		
		if(i1>0 && weight>0)
		{
			double x;
			x=charge_per_km*i1+weight*weight_charge;
			return x;
		}
		
		if(i1==0 && weight>0)
		{
			double x;
			x=charge_per_km*i1+weight*weight_charge;
			return x;
		}
		else
	return 0.0;
	}
}
