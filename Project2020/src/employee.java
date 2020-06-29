import java.io.*;
import java.lang.*;

public class employee {

	private String name;
	private long PhoneNum;
	private String DOB;
	private String JobTitle;
	private String shift; 
	
public static class Builder{

	private String name;
	private long PhoneNum;
	private String DOB;
	private String JobTitle;
	private String shift;
	
	public Builder Name(String name) {
		this.name= name;
		return this;
	}
	
	public Builder phonenum(long PhoneNum){
		this.PhoneNum = PhoneNum;
		return this;
	}
	public Builder birthd(String DOB) {
		this.DOB = DOB;
		return this;
	}
	
	public Builder Job(String JobTitle) {
		this.JobTitle = JobTitle;
		return this;
	}
	
	public Builder ShiftTime(String shift) {
		this.shift = shift;
		return this;
}
	
	public employee build(){
		employee Employee = new employee();
		Employee.JobTitle= this.JobTitle;
		Employee.shift= this.shift;
		Employee.name = this.name;
		Employee.DOB = this.DOB;
		Employee.PhoneNum = this.PhoneNum;
		
		return Employee;
		
	}

	@Override
	public String toString() {
		return "[name =" + name + ", PhoneNum =" + PhoneNum + ", DOB =" + DOB + ", JobTitle =" + JobTitle
				+ ", shift =" + shift ;
	}
	
	
}
	
private employee() {}

}
