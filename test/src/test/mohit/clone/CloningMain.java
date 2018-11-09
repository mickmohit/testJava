package test.mohit.clone;

public class CloningMain {
	
		  public static void main(String args[]){
		    EmployeeAddress empAddress=new EmployeeAddress("22","Avenue Street", "Dallas");
		    Employee emp=new Employee("David", 32,empAddress);
		    Employee empClone=null;
		    try {
		      empClone=(Employee) emp.clone();
		      
		   //   empClone.setEmpAddress(new EmployeeAddress("20","Delhi Street", "Delhi"));
		      
		    }catch(CloneNotSupportedException cnse){
		      cnse.printStackTrace();
		    }
		 
		    if(empClone.getEmpAddress()==emp.getEmpAddress()){
		    	 System.out.println("empClone's empAddress reference equals emp's empAddress reference.");
		    	 }
		    
		    
		    System.out.println("Shallow Cloned Employee Object: "+emp);
		    System.out.println("Cloned Employee Object: "+empClone);
		  }
		}
