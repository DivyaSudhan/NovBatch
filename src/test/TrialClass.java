
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\target\\Driver\\chromedriver.exe");
		WebDriver driver = new chromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
	}

}
