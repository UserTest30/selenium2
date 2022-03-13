package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
public class BrowserLaunch {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shanmugaundaram\\eclipse-workspace\\sele\\org.day1\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://greenstech.in/selenium-course-content.html");
WebElement scrollDown = driver.findElement(By.xpath("//h2[text()='selenium Testing course content']"));
Thread.sleep(3000);
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[a].scrolltoview(true')",scrollDown);
//Thread.sleep(3000);
//WebElement Scrollup = driver.findElement(By.xpath("//div[text()=courses']"));
//js.executeScript("arguments[0].ScrollIntoView(false)",Scrollup);
}
}
