
package utility;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import pojo.BaseClass;

public class ScreenShot extends BaseClass{

	public static void sShot() throws IOException {
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("");
		
		FileHandler.copy(source, destination);
	}
}
