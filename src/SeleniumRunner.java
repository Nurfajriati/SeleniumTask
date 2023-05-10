import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Membuka web google schoolar
		driver.get("https://scholar.google.com/");
//		WebElement searchInput = driver.findElement(By.cssSelector("[aria-label='Telusuri']"));
//		searchInput.sendKeys("Selenium");
//		searchInput.sendKeys(Keys.ENTER);
		
		//Input yang ingin ditelusuri 
		WebElement searchInput = driver.findElement(By.xpath("/html/body/div/div[7]/div[1]/div[2]/form/div/input"));
		searchInput.sendKeys("Selenium");
		searchInput.sendKeys(Keys.ENTER);
		
		//Memilih pencariannya pada tahun 2023
		WebElement year23 = driver.findElement(By.xpath("/html/body/div/div[10]/div[1]/div/div[1]/ul/li[2]/a"));
		year23.sendKeys(Keys.ENTER);
		
		//Mengurutkan berdasarkan tanggal
		WebElement fordate = driver.findElement(By.xpath("/html/body/div/div[10]/div[1]/div/ul[1]/li[2]/a"));
		fordate.sendKeys(Keys.ENTER);
		
		//Mengganti pencarian abstrak ke semua
		WebElement change = driver.findElement(By.xpath("/html/body/div/div[10]/div[2]/div[3]/div[1]/div/span[2]/button[2]"));
		change.sendKeys(Keys.ENTER);
		
		//Memilih artikel yang diinginkan
		WebElement choose = driver.findElement(By.id("vEjBd88hIlIJ"));
		choose.sendKeys(Keys.ENTER);
		
		
	}

}
