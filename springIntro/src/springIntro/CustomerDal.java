package springIntro;

public class CustomerDal implements ICustomerDal {
  String connectionString;
	
	
	public String getConnectionString() {
		return connectionString;
	}


	public void setConnetcitionString(String connetcitionString) {
		this.connectionString = connectionString;
	}



	public void add() {
		System.out.println("Connection String :" +this.connectionString);
		System.out.println("Oracle veritabanýna eklendi");
	}

}
