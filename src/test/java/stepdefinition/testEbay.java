package stepdefinition;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.project.setup.runEbay;
import com.project.setup.testConstants;
import com.project.setup.testSetup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class testEbay extends testSetup {
/*	  DesiredCapabilities capabilities = new DesiredCapabilities();
      //public testConstants tstCont = new testConstants();
      public  AndroidDriver<MobileElement> driver;*/
/*	String getPort = "";
	testSetup initSuite = new testSetup();
	String port = "";
	String device = "";*/
	//testConstants tstCont = new testConstants();
	//testSetup initSuite = new testSetup();
/*	public testSetup initSuite =  new testSetup();
	//@Parameters({"port","device"})
	public testEbay(String port, String device) {
		try {
			//initSuite = new testSetup();
			this.initSuite.setupCapabilities(port, device);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
/*	@BeforeClass	
	@Parameters("port")
	public void getPort(String port){
		getPort =  port;
		
	}*/
	
	//public AndroidDriver<MobileElement> driver;
	
/*	@Given("^Launch eBay application$")
	@Parameters({"port","device"})*/
	public void launchEbay() throws Throwable {
	System.out.println("DHUKLO");
	testSetup.setupCapabilities("4723","0715f762c2ab2f3a");
/*  	testConstants.testObj.PORT_DEVICE = port;
    capabilities.setCapability("platformName", "ANDROID");
    capabilities.setCapability("platformVersion", "6.0.1");
    capabilities.setCapability("deviceName", device);
    //capabilities.setCapability("portNumber", port);
          capabilities.setCapability("appPackage","com.sec.android.app.popupcalculator");
    capabilities.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
    capabilities.setCapability("appPackage","com.ebay.mobile");
    capabilities.setCapability("appActivity","com.ebay.mobile.activities.eBay");
    driver = new AndroidDriver<MobileElement>(new URL("http://localhost:"+port+"/wd/hub"),capabilities);
    //driver = new RemoteWebDriver (new URL("http://localhost:"+port+"/wd/hub"),capabilities);
    System.out.println("Session ID is...."+driver.getSessionId());
    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);*/
/*	//boolean isExecuted = false;
	if(testConstants.testObj.isExecuted == false){
	List<DesiredCapabilities> ltsCap = testConstants.testObj.lstCap;
	for (DesiredCapabilities desiredCapabilities : ltsCap) {
		String portNum = (String)desiredCapabilities.getCapability("portNumber");
		if(getPort.equalsIgnoreCase(portNum)){
			driver = new AndroidDriver<MobileElement>(new URL("http://localhost:"+portNum+"/wd/hub"),desiredCapabilities);
		    //driver = new RemoteWebDriver (new URL("http://localhost:"+port+"/wd/hub"),capabilities);
		    System.out.println("Session ID is...."+driver.getSessionId());
		    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		}
	}
	testConstants.testObj.isExecuted = true;
	}*/
	
/*	if(port.equals("4723")){
	    driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),testConstants.testObj.lstCap.get(0));
	    //driver = new RemoteWebDriver (new URL("http://localhost:"+port+"/wd/hub"),capabilities);
	    System.out.println("Session ID is...."+driver.getSessionId());
	    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}else{
	    driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4725/wd/hub"),testConstants.testObj.lstCap.get(1));
	    //driver = new RemoteWebDriver (new URL("http://localhost:"+port+"/wd/hub"),capabilities);
	    System.out.println("Session ID is...."+driver.getSessionId());
	    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}*/
		//testEbay tst = new testEbay(port,device);

	
	}
	
	@Then("^I click on home haburger menu$")
	public void clickMenu() throws Throwable {
		System.out.println("Session ID is...."+driver.getSessionId());
		driver.findElement(By.id("com.ebay.mobile:id/home")).click();
	}
	
	@Then("^I select categories$")
	public void openCategories() throws Throwable {
		driver.findElement(By
				.xpath("//android.widget.CheckedTextView[contains(@resource-id,'com.ebay.mobile:id/design_menu_item_text') and @text='Categories']"))
				.click();		
	}
	
	@Then("^I open Books & Magazines category$")
	public void openSubCat() throws Throwable {
		driver.findElement(By
				.xpath("//android.widget.TextView[contains(@resource-id,'com.ebay.mobile:id/category_name') and @text='Books & Magazines']"))
				.click();		
	}
	
/*	@AfterTest
	public void End() {
		driver.quit();
	}*/
}
