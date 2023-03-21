package com.Hooks;

import com.Utils.ConfigReader;
import com.Utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.Properties;


public class ApplicationHooks {

    private DriverFactory driverFactory;
    private ConfigReader configReader;
    private WebDriver driver;
    Properties prop;


    @Before(order=0)
    public void getProperty(){
        configReader = new ConfigReader();
        prop = configReader.init_prop();
    }
    @Before(order=1)
    public void launchBrowser(){
        String browserName = prop.getProperty("browser");
        driverFactory= new DriverFactory();
        driverFactory.init_driver(browserName);
    }

    @After(order = 0)
    public void quitbrowser(){
       DriverFactory.getDriver().quit();
         //driver.quit();
    }
    @After(order = 1)
    public void tearDown(Scenario scenario){
       if(scenario.isFailed()){
           // takescreenshot

           String screenshotname =   scenario.getName().replaceAll(" ", "_");
           byte[] sourcepath = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcepath,"image/png",screenshotname);
       }
    }


}
