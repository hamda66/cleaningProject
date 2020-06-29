import java.util.*;
import java.io.*;
import java.lang.*;


public class inputdeatail {

	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int inputchoice = -1;
		int x =0;
		
		
		FileOutputStream F = new FileOutputStream(new File ("customerDet.txt"));
		FileOutputStream Q = new FileOutputStream(new File ("EmployeeDet.txt"));
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
		
		if (inputchoice == 1) {
			System.out.println("Name: ");
			String name = input.next();
			System.out.println("Phone Number: ");
			long num = input.nextLong();
			System.out.println("Date of Birth (DD-MMM-YYYY): ");
			String dob = input.next();
			
			customer Customer = new customer.Builder().phonenum(num)
					.Name(name)
					.birthd(dob)
					.build();
			
			
			cus.add(Customer);
			int c = cus.size();
			 for(customer str: cus) {
				
				
				pw.println(str.toString());
				
				}
			 pw.close();
                 O.close();
		   		 F.close();
			
		}
		
		if(inputchoice==4) {
			 for (int i = 0; i < cus.size(); i++) {
			      System.out.println(cus.get(i));
			    }
			
		}
		
		else {
			
			
			
		}
		
		

	}
	while(inputchoice !=3);
}
	
	}
