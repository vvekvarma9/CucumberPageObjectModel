package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarSearchPageLocators {

	@FindBy(how = How.XPATH, using = "//select[@id='makes']")
	public WebElement carMakeDropDown;

	@FindBy(how = How.XPATH, using = "//select[@id='models']")
	public WebElement selectModelDropDown;

	@FindBy(how = How.CSS, using = "#locations")
	public WebElement selectLocationDropDown;

	@FindBy(how = How.CSS, using = "#priceTo")
	public WebElement priceDropDown;

	@FindBy(how = How.XPATH, using = "//input[@id='search-submit']")
	public WebElement findMyNextCarBtn;
}
