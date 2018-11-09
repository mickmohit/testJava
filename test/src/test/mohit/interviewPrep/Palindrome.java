package test.mohit.interviewPrep;

import java.util.Scanner;

class Palindrome
{
  public static void main(String args[])
  {
    String inputString;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Input a string");
    inputString = in.nextLine();
 
    int length  = inputString.length();
    int i, begin, end, middle;
 
    begin  = 0;
    end    = length - 1;
    middle = (begin + end)/2;
 
    System.out.print(begin+" "+end + " "+ middle);
    
    for (i = begin; i <= middle; i++) {
    	System.out.print(inputString.charAt(begin)+ " "+ inputString.charAt(end));
      if (inputString.charAt(begin) == inputString.charAt(end)) {
       /* begin++;
        end--;*/
      }
      else {
        break;
      }
    }
    System.out.print(i);
    if (i == middle + 1) {
      System.out.println("Palindrome");
    }
    else {
      System.out.println("Not a palindrome");
    } 	
  }
}