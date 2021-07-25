package main;

import java.util.Scanner;

public class CompanyShareMain {
	public static void main(String[] args) {
		CompanyShare companyShare=new CompanyShare();
		int i=1;
		do {
			System.out.print("1->add company \n 2->remove company \n 3->print company");
			Scanner scanInput = new Scanner(System.in);
			int getUserInput = scanInput.nextInt();
			
			switch(getUserInput) {
			case 1 :{
				System.out.print("Enter comapny name- ");
				String getUserInput2 = scanInput.next();
				System.out.print("Enter comapny share- ");
				int getUserInput3 = scanInput.nextInt();
				companyShare.addNode(getUserInput3, getUserInput2);
				break;
			}
			case 2 :{
				System.out.print("Enter comapny name- ");
				String getUserInput2 = scanInput.next();
				
				break;
			}
			case 3:{
				companyShare.printList();
				break;
			}
			}
			
			System.out.print("want to repeat- ");
			i = scanInput.nextInt();
		}while(i==1);
	
	}
}