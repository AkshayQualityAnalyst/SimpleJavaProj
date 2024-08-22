import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.Chrome.driver",
				"C:\\Users\\manka\\eclipse-workspace\\ProjectForDemo\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\manka\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);

		// WebDriverManager.chromedriver().setup();

		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@class='dropdown']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Yoyosingh");
		driver.findElement(By.id("input-lastname")).sendKeys("Yoyosingh");

		// change email every time to execute code well

		driver.findElement(By.id("input-email")).sendKeys("Yoyosingh123ad@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("7080901000");
		driver.findElement(By.id("input-password")).sendKeys("7080901000");
		driver.findElement(By.id("input-confirm")).sendKeys("7080901000");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		WebElement cross = driver.findElement(By.linkText("Success"));
		System.out.println(cross.isDisplayed());
		driver.findElement(By.linkText("Continue")).click();
		WebElement verif = driver.findElement(By.linkText("Account"));
		System.out.println(verif.isDisplayed());
		Thread.sleep(3000);
		driver.close();
	}
}