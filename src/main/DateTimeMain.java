package main;

import java.util.Scanner;

import java.text.SimpleDateFormat;  
import java.util.Date;  

public class DateTimeMain {
	public static void main(String[] args) {
		DateTimeTransaction dateTimeTransaction=new DateTimeTransaction();
		int i=1;
		do {
			System.out.print("1->add company \n 2->remove company \n 3->print company");
			Scanner scanInput = new Scanner(System.in);
			int getUserInput = scanInput.nextInt();
			
			switch(getUserInput) {
			case 1 :{
				System.out.print("Enter comapny share- ");
				int getUserInput3 = scanInput.nextInt();
				System.out.print("share purchese->0 \t sold->1 - ");
				int getUserInput4 = scanInput.nextInt();
				 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
				    Date date = new Date();  
				dateTimeTransaction.addNode(getUserInput3,getUserInput4,formatter.format(date));
				break;
			}
			case 2 :{
				System.out.print("Enter comapny name- ");
				String getUserInput2 = scanInput.next();
				
				break;
			}
			case 3:{
				dateTimeTransaction.printList();
				break;
			}
			}
			
			System.out.print("want to repeat- ");
			i = scanInput.nextInt();
		}while(i==1);
	
	}
}
