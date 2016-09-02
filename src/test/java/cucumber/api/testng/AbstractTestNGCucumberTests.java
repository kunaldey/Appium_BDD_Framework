package cucumber.api.testng;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.project.setup.testConstants;
import com.project.setup.testSetup;

@CucumberOptions(
		features = "src/test/java/com/project/features", 
		plugin = "json:target/cucumber1.json", 
		glue = {"stepdefinition"})

public class AbstractTestNGCucumberTests{
    private TestNGCucumberRunner testNGCucumberRunner;

   // @BeforeClass(alwaysRun = true)
/*    DesiredCapabilities capabilities = new DesiredCapabilities();
    //public testConstants tstCont = new testConstants();
    public  AndroidDriver<MobileElement> driver;*/

    //@BeforeTest(alwaysRun=true)
    @BeforeClass(alwaysRun = true)
    @Parameters({"port","device"})
    public void setUpClass(String port, String device) throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
/*        testConstants.testObj.DEVICE_PORT = port;
        testConstants.testObj.DEVICE_NAME = device;*/
/*        testSetup.setupCapabilities(port, device);*/
/*        capabilities.setCapability("platformName", "ANDROID");
        capabilities.setCapability("platformVersion", "6.0.1");
        capabilities.setCapability("deviceName", device);
        capabilities.setCapability("portNumber", port);
        capabilities.setCapability("appPackage","com.ebay.mobile");
        capabilities.setCapability("appActivity","com.ebay.mobile.activities.eBay");
        driver = new AndroidDriver<MobileElement>(new URL("http://localhost:"+port+"/wd/hub"),capabilities);
        System.out.println("Session ID is...."+driver.getSessionId());
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);*/
    }

    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }
}

