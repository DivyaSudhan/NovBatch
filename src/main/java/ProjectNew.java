import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectNew {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\NewProject\\src\\org\\test\\msedgedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		
        
}
}
