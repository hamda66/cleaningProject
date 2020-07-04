import java.lang.*;
import java.io.*;
import java.util.*;

public class ShowCustomer {

	public static void ShowCustomer() throws IOException {
		
		 BufferedReader br = new BufferedReader(new FileReader("customerDet.txt")); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st); 
		
	}
	
	
}
