package com.springdemo;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal;
	
	// constuctor injection
	 public CustomerManager(ICustomerDal customerDal) {
	   this.customerDal = customerDal;
	}
	
	
    // setter injection
	//public void setCustomerDal(ICustomerDal customerDal) {
		//this.customerDal = customerDal;
	//}

	public void add() {
		//iþ kurallarý
		customerDal.add();
		
	}

}
