package test.mohit.interviewPrep;

public class StringReverseExample {

	 public static void main(String args[]){  
		 
		 String word = "HelloWorld";
		 String reverse;
		 reverse = reverse(word);
		 System.out.println(reverse);
	 }
	 public static String reverse(String source){
	        if(source == null || source.isEmpty()){
	            return source;
	        }       
	        String reverse = "";
	        for(int i = source.length() -1; i>=0; i--){
	            reverse = reverse + source.charAt(i);
	        }
	      
	        return reverse;
	    }
	    
	

}
