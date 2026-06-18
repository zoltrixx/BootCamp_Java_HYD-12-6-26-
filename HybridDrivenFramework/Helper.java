package utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	public static void capturedScreenshot(WebDriver driver) {

        try {
            // Convert driver to TakesScreenshot
            TakesScreenshot ts = (TakesScreenshot) driver;

            // Capture screenshot
            File source = ts.getScreenshotAs(OutputType.FILE);

            // Save screenshot directly
            FileUtils.copyFile(source, new File("./Screenshots/EasyCalculation_" + getCurrentDateTime()+ ".png"));

            System.out.println("✅ Screenshot captured: ");

        } catch (Exception e) {

            System.out.println("❌ Screenshot failed");
            System.out.println("Error: " + e.getMessage());
        }
    }
	
	public static String getCurrentDateTime() {
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentdate = new Date();
		return customFormat.format(currentdate);
	}
}
