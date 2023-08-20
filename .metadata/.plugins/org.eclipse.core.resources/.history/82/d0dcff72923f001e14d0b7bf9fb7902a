package com.virtualkey.main;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.virtualkey.util.FileService;





public class App {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int choice;
		String cont, txtName;
		FileService ss = new FileService();
		
		System.out.println("Virtual Key _ Developed by Panagiotis Kalogirou"+ '\n');
		
		try {	
	
		do {
			
			
			System.out.println("1: Display all the files in ascending order 2: Manage the files 3: Close the application" + '\n' + "Please enter your choice");
			choice = sc.nextInt();
			
								
			switch(choice) {
			case 1: 
					ss.updateList();
					break;
			case 2: System.out.println("1: Add a file 2: Delete a file 3: Search a file"+ '\n'+ "Please enter your choice");
					choice = sc.nextInt();
					switch(choice) {
					case 1: System.out.println("Please enter the name of the file");
							txtName = sc.next();
							ss.addFile(txtName);
							break;
					case 2: System.out.println("Please enter the name of the file");
							txtName = sc.next();
							ss.deleteFile(txtName);
							break;
					case 3: System.out.println("Please enter the name of the file");
							txtName = sc.next();
							ss.searchFile(txtName);;
							break;
					default:System.out.println("Please enter a number from 1 to 3");
					}
				
					break;
					
			case 3: System.out.println("The application will be terminated");
					System.exit(0);
					break;
			
					
			default: System.out.println("Please enter a number from 1 to 3");
					break;
			}
			
			System.out.println("Do you want to continue?");
			cont = sc.next();

	    }while(cont.equalsIgnoreCase("y"));
		
		sc.close();
	    
	}catch(InputMismatchException e) {
		System.out.println("Value must contain only number");	
	}
		
	}
}


	
