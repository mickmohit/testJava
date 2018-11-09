package test.mohit.interviewPrep;

public class Anagram {
	public static void main(String args[]) {
	boolean i=false;
	i=isAnagram("Mohit","Mhoit");
	System.out.println(i);
	}
	
	public static boolean isAnagram(String a, String b){
	    //assume that we are using ASCII
	    int[] charCnt = new int[256];
	    for(int i = 0; i < a.length(); i++){
	        charCnt[a.charAt(i)]++;
	        System.out.println(a.charAt(i));
	    }
	    for(int i = 0; i< b.length(); i++){
	        charCnt[b.charAt(i)]--;
	        System.out.println(b.charAt(i));
	    }
	    for(int i = 0; i<charCnt.length; i++){
	        if(charCnt[i] != 0) return false;
	    }
	    return true;
	}
}
