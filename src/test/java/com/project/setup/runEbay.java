package com.project.setup;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "src/test/java/com/project/features", 
		features = {"classpath:features/*.feature"},
		format = { "pretty","html: cucumber-html-reports","json: cucumber-html-reports/cucumber.json" },
        glue = {"stepdefinition"}
		)
public class runEbay extends AbstractTestNGCucumberTests {
	
	
/*	  DesiredCapabilities capabilities = new DesiredCapabilities();
      //public testConstants tstCont = new testConstants();
      public  AndroidDriver<MobileElement> driver;
      //WebDriver driver;
      //@BeforeTest(alwaysRun=true)
      @Parameters({"port","device"})
      public void setupCapabilities(String port, String device) throws MalformedURLException, InterruptedException {
    	  	testConstants.testObj.PORT_DEVICE = port;
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
            driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
            testConstants.testObj.lstCap.add(capabilities);
            testConstants.testObj.lstPort.add(port);
            testConstants.testObj.lstDevice.add(device);
            System.out.println("Size of the List ********* " + testConstants.testObj.lstCap.size());
            //return capabilities;
            
      }
}*/

}

