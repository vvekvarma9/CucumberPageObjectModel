package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.annotations.BeforeClass;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import com.cucumber.listener.ExtentCucumberFormatter;

@CucumberOptions(plugin = { "json:target/RunCuke/cucumber.json", "pretty", "html:target/RunCuke/cucumber",
		"com.cucumber.listener.ExtentCucumberFormatter" }, monochrome = true, features = {
				"src/test/resources/features/" }, glue = "steps", tags = { "@Search-Cars" })
public class RunCuke extends AbstractTestNGCucumberTests {

	@BeforeClass
	public static void writeExtentReport() {
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		String fileName = System.getProperty("user.dir") + "\\target\\Extent_Reports\\" + strDate + ".html";
		File newFile = new File(fileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile, false);
		ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));

		ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
		ExtentCucumberFormatter.addSystemInfo("Browser Version", "v88.0");
		ExtentCucumberFormatter.addSystemInfo("Selenium Version", "v3.141.9");

	}

}
