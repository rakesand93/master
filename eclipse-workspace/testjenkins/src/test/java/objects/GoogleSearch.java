package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {
	
	WebDriver driver;
	
	public GoogleSearch(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchBox = By.xpath("//textarea[@name='q']");
	By searchButton = By.xpath("//input[@name='btnK']");
	
	
	
	public void searchGoogle(String input) {
		
		try {
		driver.findElement(searchBox).sendKeys(input);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

}
	
	public void clickSearchByXpath() {
		
		try {
		driver.findElement(searchButton).click();
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}


