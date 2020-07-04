import java.io.*;
import java.util.*;
import java.lang.*;

public  class AddCustomer {
 
	 public void AddCustomer() throws IOException {
		 Scanner input = new Scanner(System.in);
		   int inputchoice = input.nextInt();
		    ArrayList<customer> cus = new ArrayList<customer>();
		    FileOutputStream F = new FileOutputStream(new File ("customerDet.txt"), true);
		    ObjectOutputStream O = new ObjectOutputStream(F);
		    PrintWriter pw = new PrintWriter(F);
		    
			System.out.println("Name:  ");
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
	 
}

