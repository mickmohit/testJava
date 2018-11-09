package test.mohit;

public class CollegeStudent extends Student {
    /**
     * This method is used to show details of a college student.
     * @author CodesJava
     */
    public void show(){
          System.out.println("College Student details.");
    }

    //main method
    public static void main(String args[]){
     //Super class can contain subclass object.   
     Student obj = new CollegeStudent();

     //method call resolved at runtime
     obj.show();
    }
}

