package homework3;

import java.util.Scanner;


public class TestProcessStudentInformation {
	 
    
	public static void main(String[] args) {
		int choice;
             System.out.println("----------SUCCESS TECHNOLIGIE COLLEGE-------------");
             System.out.println("Student Information Processing Program\n");
          
         
        	 do {
      	 
        	 System.out.println("1-Student information");
             System.out.println("2-Courses");
             System.out.println("Make your choise:\n");
             
		     Scanner sc = new Scanner(System.in); 
		     choice = sc.nextInt();
        
	         }while (choice!=1 && choice!=2 && choice!=3);
	
	
	if (choice==1) {
		    System.out.println("Student Information :");
		    StudentInformation stInfo = new StudentInformation();
		
		    stInfo.setStName();
		    stInfo.setStDateOfBirth();
		    stInfo.setAddress();
		    String []st1=new String[4];
		
		    st1[1] =stInfo.getStName();
		    st1[2]=stInfo.getStDateOfBirth();
		    st1[3]=stInfo.getAddress();
		
		
		
		for(int i = 1 ;i<st1.length;i++) {
	   		System.out.println(st1[i]);
		
	}
	
		
	    System.out.println("\nGenerate student ID");
	
     	System.out.println("The studentID of "+st1[1]+" is: "+st1[1]+st1[2]);
	
     	Courses picture = new Courses();
	    picture.getStudentPicture();
	}
	
	if (choice==2) {
	   Courses course =new Courses(5);
	   course.courses();
		
} 
}
}
