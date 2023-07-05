package Pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_login {
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="pass")
	private WebElement passward;
	@FindBy(name="login")
	private WebElement loginbtn;
	
	public Facebook_login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//news

public void passun(String un)
{
username.sendKeys(un);
}
public void passpwd(String pwd)
{
passward.sendKeys(pwd);
}
public void btns()
{
loginbtn.click();
}

}




