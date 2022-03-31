package Day2;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class EditLead {

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
			 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pradi");
			 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
			 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pradi");
			 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
			 driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Testing Team");
			 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Pradi@gmail.com");
			 WebElement we=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			 Select se=new Select(we);
			 se.selectByVisibleText("New York");
			 driver.findElement(By.className("smallSubmit")).click();
			 
			 driver.findElement(By.linkText("Edit")).click();
			 driver.findElement(By.id("updateLeadForm_description")).clear();
			 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("High priority Lead creation");
			 driver.findElement(By.className("smallSubmit")).click();
			 String Title= driver.getTitle();
			 System.out.println("Tiltle of the page is:" +Title);
			 
			 
			 
			 
		}

}