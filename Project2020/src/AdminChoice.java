import java.io.*;
import java.util.*;
import java.lang.*;

public class AdminChoice {

	public void AdminChoice() throws IOException {
		
		System.out.println(" ");
		System.out.println("******Welcome Admin******");
		System.out.println("input number for following choice: ");
		System.out.println("1.List Customer");
		System.out.println("2.empoloyee");
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		ShowCustomer cus = new ShowCustomer();
		
		switch (x) {
		
		case 1:	
			cus.ShowCustomer();
		break;
		
		case 2:
			
		break;
			
		}
		
	}
	
	
}
