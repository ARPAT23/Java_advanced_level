package springIntro;

import org.springframework.beans.factory.annotation.Value;

public class MySqlCustomerDal implements ICustomerDal{
	
	 @Value("${database.connectionString}")
     String connectionString;
	
	
	public String getConnectionString() {
		return connectionString;
	}


	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}


	@Override
	public void add() {
		System.out.println("ConnecTion String :" +this.connectionString);
		System.out.println("Mysql veritabanưna eklendi");
		
	}

}
