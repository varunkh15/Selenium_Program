package SeleniumSessions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {
	public WebDriver driver;
	/**
	 * This method is used to launch the browser on the basis of given broser name
	 * @param browser
	 * @return
	 */
	public WebDriver launchBrowser(String browser) 
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else
		{
			System.out.println("Please pass the correct browser : "+browser);
		}
		return driver;
	}
	/**
	 * this is used to launch the url
	 * @param url
	 */
	public void launchUrl(String url)
	{
		driver.get(url);
	}
	/**
	 * This is used to get the page title
	 * @return
	 */
	public String getPageTitle()
	{
		String title = driver.getTitle();
		return title;		
	}
	/**
	 * This is used to get the Page url
	 * @return
	 */
	public String getPageCurrentUrl()
	{
		String url1 = driver.getCurrentUrl();
		return url1;
	}
	public void closeBrowser()
	{
		driver.close();
	}
}
