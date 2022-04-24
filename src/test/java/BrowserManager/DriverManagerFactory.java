package BrowserManager;


public class DriverManagerFactory {

	
	public static DriverManager getManager(DriverType type) {
		DriverManager driverManager= null;
		
		switch (type) {
		case CHROME:
			driverManager= new ChromeDriverManager();
			break;
			
		case FIREFOX:
			driverManager= new FirefoxDriverManager();
			break;

		default:
			System.out.println("invalid browser selected");
			break;
		}
		return driverManager;
	}
}
