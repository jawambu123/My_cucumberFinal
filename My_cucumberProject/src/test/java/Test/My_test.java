package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.Change_Backgrounds;
import util.BrowserFactory;

public class My_test {
WebDriver driver;	
@Test	
public void browserTesting () throws InterruptedException {
	driver= BrowserFactory.browsersetting();
	Change_Backgrounds backgrounds = PageFactory.initElements(driver, Change_Backgrounds.class);
	backgrounds.set_color();
	driver.close();
}
}
