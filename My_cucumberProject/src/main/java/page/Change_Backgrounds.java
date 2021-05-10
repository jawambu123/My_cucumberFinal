package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Change_Backgrounds {
 
	public Change_Backgrounds() {
		this.driver = driver;
	}
	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionSky()']")
	WebElement set_blue;
	@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionWhite()']")
	WebElement set_White;

	public void set_color() throws InterruptedException {
		set_blue.click();
		Thread.sleep(3000);
	}

	public void change_white() throws InterruptedException {
		set_White.click();
		Thread.sleep(3000);
	}
}
