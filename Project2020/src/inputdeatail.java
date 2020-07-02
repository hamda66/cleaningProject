import java.util.*;
import java.io.*;
import java.lang.*;


public class inputdeatail {

	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int inputchoice = -1;
		int x =0;
		
		
		FileOutputStream F = new FileOutputStream(new File ("customerDet.txt"), true);
		FileOutputStream Q = new FileOutputStream(new File ("EmployeeDet.txt"), true);
		ObjectOutputStream O = new ObjectOutputStream(F);
		ObjectOutputStream R = new ObjectOutputStream(Q);
		FileWriter fw = null;
		
		PrintWriter pw = new PrintWriter(F);
		
		do {
		System.out.println("******Welcome******");
		System.out.println("Enter number for option; ");
		System.out.println(" ");
		System.out.println("Are you :");
		System.out.println(" ");
		System.out.println("1.Customer");
		System.out.println("2.Admin");
		System.out.println("----------------------");
		System.out.println("3.Exit");
		
	    inputchoice = input.nextInt();
	    ArrayList<customer> cus = new ArrayList<customer>();
		
	    AddCustomer b = new AddCustomer();
	    
		if (inputchoice == 1) {
			b.AddCustomer();
			
		}
		
		
		 if (inputchoice == 2) {
			 int AdminChoice = input.nextInt();
			System.out.println(" ");
			System.out.println("******Welcome Admin******");
			System.out.println("input number for following choice: ");
			System.out.println("1.List Customer");
			System.out.println("2.empoloyee");
			
			if (AdminChoice==1) {
				int AdminCustomerChoice = input.nextInt();
				System.out.println("input number for following choice: ");
				System.out.println("1.List Customer");
				System.out.println("2.delete customer");
				
				if (AdminCustomerChoice==1) {
					for (int i = 0; i < cus.size(); i++) {
			      System.out.println(cus.get(i));
			 }
				}
				
				
			}
			
			
		}
		
		

	}
	while(inputchoice !=3);
}

	
	}
