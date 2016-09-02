package com.project.setup;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import com.project.setup.testConstants;

public class testSetup {
	  
      static DesiredCapabilities capabilities = new DesiredCapabilities();
      //public testConstants tstCont = new testConstants();
      public static  AndroidDriver<MobileElement> driver;
      //WebDriver driver;
      String getPort = "";
      String getDevice = "";
      
/*      @BeforeTest(alwaysRun=true)
      @Parameters({"port","device"})
      private void getParam(String port, String device){
    	  getPort = port;
    	  getDevice = device;
      }*/
      
      @BeforeTest(alwaysRun=true)
      @Parameters({"port","device"})
      public static void setupCapabilities(String port, String device) throws MalformedURLException, InterruptedException {
            capabilities.setCapability("platformName", "ANDROID");
            capabilities.setCapability("platformVersion", "6.0.1");
            capabilities.setCapability("deviceName", device);
            capabilities.setCapability("portNumber", port);
/*          capabilities.setCapability("appPackage","com.sec.android.app.popupcalculator");
            capabilities.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");*/
            capabilities.setCapability("appPackage","com.ebay.mobile");
            capabilities.setCapability("appActivity","com.ebay.mobile.activities.eBay");
            driver = new AndroidDriver<MobileElement>(new URL("http://localhost:"+port+"/wd/hub"),capabilities);
            //driver = new RemoteWebDriver (new URL("http://localhost:"+port+"/wd/hub"),capabilities);
            System.out.println("Session ID is...."+driver.getSessionId());
            driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
/*            testConstants.testObj.lstCap.add(capabilities);
            testConstants.testObj.lstPort.add(port);
            testConstants.testObj.lstDevice.add(device);
            System.out.println("Size of the List ********* " + testConstants.testObj.lstCap.size());*/
            //return capabilities;
            
      }
      
}
