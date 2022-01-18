package ReusableComponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseHelpers extends driverConfig{
	public static boolean isClicked(WebElement element)
	{ 
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, 5);
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	        element.click();
	        return true;
	    } catch(Exception e){
	        return false;
	    }
	}
}
