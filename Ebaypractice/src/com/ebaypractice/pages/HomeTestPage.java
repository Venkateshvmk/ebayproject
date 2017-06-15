package com.ebaypractice.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class HomeTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "homepage.ebay")
	private QAFWebElement homepageEbay;
	@FindBy(locator = "homepage.allcatogory")
	private QAFWebElement homepageAllcatogory;
	@FindBy(locator = "homepage.shopbycatgry")
	private QAFWebElement homepageShopbycatgry;
	@FindBy (locator = "homepage.searchbtn")
	private QAFWebElement catogorysearchbutton;

	

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
		driver.get("/");
		driver.manage().window().maximize();
	}

	public QAFWebElement getHomepageEbay() {
		return homepageEbay;
	}

	public QAFWebElement getHomepageAllcatogory() {
		return homepageAllcatogory;
	}

	public QAFWebElement getHomepageShopbycatgry() {
		return homepageShopbycatgry;
	}
	public QAFWebElement getCatogorysearchbutton() {
		return catogorysearchbutton;
	}
	
	public void selectCatogory(String catogoryname){
		QAFExtendedWebElement catgoryname=new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("homepage.ebay",catogoryname)));
		catgoryname.waitForVisible();
		/*String.format(ConfigurationManager.getBundle().getString("homepage.ebay",catogoryname))
		ConfigurationManager.getBundle().getString("homepage.ebay",catogoryname);*/		
	}
	
   public void allCatogories(String name){
	   Select sel=new Select(getHomepageAllcatogory());
	   List<WebElement> catogorylist=sel.getOptions();
		System.out.println("   "+catogorylist);
	   sel.selectByVisibleText(name);
	   getCatogorysearchbutton().click();
	   getCatogorysearchbutton().waitForVisible();
	//  sel.selectByIndex(3);
	 
   }
   public void scrollPage(){
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,-250)", "");
   }
      
}
