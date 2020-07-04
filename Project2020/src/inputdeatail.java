import java.util.*;
import java.io.*;
import java.lang.*;


public class inputdeatail {

	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int inputchoice;
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
		System.out.println(" ");
		System.out.println("2.Admin");
		System.out.println("----------------------");
		System.out.println("3.Exit");
		
	    inputchoice = input.nextInt();
		
	    CustomerChoice CusChoice = new CustomerChoice();
	    AdminChoice ADchoice = new AdminChoice();
	    
	    
		switch (inputchoice) {
		case 1:
			CusChoice.CustomerChoice();
			break;
		
		case 2:
			ADchoice.AdminChoice();		
           break;		
           
		}
}
	while(inputchoice !=3);
}
	}
