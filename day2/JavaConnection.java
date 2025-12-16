package week3.day2;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Database connected with Java");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
		System.out.println("Database disconnected with Java ");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Database connected and disconnected");
		
	}
	
	public static void main(String[] args) {
		
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
	}

}
