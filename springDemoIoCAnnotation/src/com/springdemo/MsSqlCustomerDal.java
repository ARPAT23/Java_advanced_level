package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class MsSqlCustomerDal implements ICustomerDal{
    
	@Value("${database.connectionString}")
	String connectionString;
	
	
	public String getConnetcitionString() {
		return connectionString;
	}


	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}


	@Override
	public void add() {
		System.out.println("ConnecTion String :" +this.connectionString);
		System.out.println("Ms Sql veritabanýna eklendi");
		
	}

}
