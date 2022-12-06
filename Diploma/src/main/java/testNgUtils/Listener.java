package testNgUtils;

import io.qameta.allure.Attachment;
import lombok.SneakyThrows;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import propertyHelper.PropertyReader;

import static driver.SimpleDriver.getWebDriver;

public class Listener implements ITestListener {

    @SneakyThrows
    @Override
    public void onStart(ITestContext context) {
        // <уловие> ? <если уловие = true> : <если уловие = false>
        String propertyName = context.getSuite().getParameter("config") == null ? System.getProperty("config") : context.getSuite().getParameter("config");
        new PropertyReader(propertyName);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Reporter.log("Ohh... this test was failed => " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        Reporter.log(context.getSuite().getXmlSuite().getTest());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Reporter.log("Cool... this test was passed => " + result.getName());
    }

}