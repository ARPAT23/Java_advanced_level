package springIntro;

public class MsSqlCustomerDal implements ICustomerDal{
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
