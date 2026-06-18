package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() { 
		File src = new File("D:\\OneDrive - Coforge Limited\\Desktop\\MavenProject\\HybridDrivenFramework\\Configuration\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch(Exception e) {
			System.out.println("Unable to load XLSX File" + e.getMessage());
		}
}
	public String getBrowser() {
		return pro.getProperty("Browser");
	}
	public String getAppURL() {
		return pro.getProperty("AppURL");
	}
}
