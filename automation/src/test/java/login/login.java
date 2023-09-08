package login;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class login extends setup {
	@Test()
	@Parameters("Browser")
	public void Test(String username_given, String password_given) {
	driver.findElement(By.name(l_loc.getProperty("username"))).sendKeys(username_given);
	driver.findElement(By.name(l_loc.getProperty("password"))).sendKeys(password_given);
	driver.findElement(By.xpath(l_loc.getProperty("login_button"))).click();
}

}
