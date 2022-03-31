package Day2;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class SeleniumExercise {

		public static void main(String[] args) {

			WebDriverManager.chromedriver().setup(); 
			 ChromeDriver driver=new ChromeDriver(); 
			 driver.get("http://leaftaps.com/opentaps/control/main");
			 driver.manage().window().maximize();
			 driver.findElement(By.id("username")).sendKeys("democsr");
			 driver.findElement(By.id("password")).sendKeys("crmsfa");
			 driver.findElement(By.className("decorativeSubmit")).click();
			 driver.findElement((By.linkText("CRM/SFA"))).click();
			 driver.findElement(By.linkText("Leads")).click();
			 driver.findElement(By.linkText("Create Lead")).click();
			 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("pradeep");
			 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
			 WebElement dd=driver.findElement(By.id("createLeadForm_dataSourceId"));
			 Select se= new Select(dd);
			 se.selectByVisibleText("Employee");		 
			 driver.findElement(By.className("smallSubmit")).click();			 

		}

	}
