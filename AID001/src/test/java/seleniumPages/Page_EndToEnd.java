package seleniumPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import common.Pages_Initiate;
import static org.junit.Assert.*;


public class Page_EndToEnd extends Pages_Initiate {
	
	String url= "www.templeandwebster.com.au";
	String actualUrl = driver.getCurrentUrl();
	WebElement searchField = driver.findElement(By.xpath("//*[@id=\'doc3\']/div[2]/div/div/div[2]/form/div/div[1]/input[4]"));
	WebElement commenceSearch = driver.findElement(By.xpath("//*[@id=\'doc3\']/div[2]/div/div/div[2]/form/div/div[1]/div/input"));
	WebElement minAmtField = driver.findElement(By.xpath("//*[@id=\'priceslideinputs_82610\']/input[1]"));
	WebElement maxAmtField = driver.findElement(By.xpath("//*[@id=\'priceslideinputs_82610\']/input[2]"));
	WebElement goBtn = driver.findElement(By.xpath("//*[@id=\'sblistgo_82610\']"));
	WebElement firstResult = driver.findElement(By.id("productbox_DWHO1603"));
	WebElement firstProdVariant = driver.findElement(By.xpath("//*[@id=\'AddToCartForm\']/div[1]/div[1]/div[4]/div/div/div[1]/a[1]/div/img"));
	WebElement quantityDropdown = driver.findElement(By.id("s2id_autogen1"));
	WebElement selectQuantityTwo = driver.findElement(By.id("select2-result-label-43"));
	WebElement productTitle = driver.findElement(By.xpath("//*[@id=\'AddToCartForm\']/div[1]/div[1]/p/span"));
	WebElement addToCartBtn = driver.findElement(By.id("sbtn"));
	WebElement prodNameInCart = driver.findElement(By.xpath("//*[@id=\'showBasket\']/table[1]/tbody/tr[2]/td[1]/div[2]/div[1]"));
	WebElement cartTotalCost = driver.findElement(By.id("txtTotalDisplay"));
	
	public void launchBrowser() {
		driver = new ChromeDriver();
	}
	
	public void navigateToTAndWHomePage() {
		driver.get("https://www.templeandwebster.com.au/");
	} //navigateToTAndWHomePage
		
	public void verifyHomepageLaunched() {	
		if(actualUrl.equals(url)) {
			System.out.println("You are viewing Temple and Webster Homepage");
		} 
	} //verifyHomepageLaunched
	
	public void searchForKeyword(String keyword) {
		searchField.sendKeys(keyword);
		commenceSearch.click();
	}//searchForKeyword
	
	public void filterResults(String maxAmount) {
		minAmtField.sendKeys("0");
		maxAmtField.sendKeys(maxAmount);
		goBtn.click();
		
		try {
		    Thread.sleep(5000);
		} catch(InterruptedException e) {
		    System.out.println("got interrupted!");
		}
	} //filterResults
	
	public void selectProduct() {
		firstResult.click();
	} //selectProduct
	
	public void selectProductVariant() {
		firstProdVariant.click();
	}//selectProductVariant
	
	public void selectNumberOfItems() {
		quantityDropdown.click();
		
		try {
		    Thread.sleep(3000);
		} catch(InterruptedException e) {
		    System.out.println("got interrupted!");
		}
		
		selectQuantityTwo.click();
		
		try {
		    Thread.sleep(3000);
		} catch(InterruptedException e) {
		    System.out.println("got interrupted!");
		}
	} //selectNumberOfItems
	
	public void addItemToCart() {
		addToCartBtn.click();
		
		try {
		    Thread.sleep(3000);
		} catch(InterruptedException e) {
		    System.out.println("got interrupted!");
		}
	}
	
	public void verifyCartItems() {
		assertEquals(productTitle, prodNameInCart);
	}
	
}
