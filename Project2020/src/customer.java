

public class customer{

	 private String name;
	 private long PhoneNum;
	 private String DOB;
	
	 public static class Builder{

			private String name;
			private long PhoneNum;
			private String DOB;
			
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
			
			
			public customer build(){
				
				customer Customer = new customer();
				Customer.DOB = this.DOB;
				Customer.name = this.name;
				Customer.PhoneNum = this.PhoneNum;
				
				return Customer;
				
			}
			
		}
	 
	 private customer () {}

}
