package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddData extends BasePage {
	WebDriver driver;

	@FindBy(how=How.XPATH, using="/html/body/div[4]/input[1]") WebElement ADD_ELEMENT;
	@FindBy(how=How.XPATH, using="//*[@id=\"extra\"]/input[1]") WebElement CATEGORY;
	@FindBy(how=How.XPATH, using="//*[@id=\"extra\"]/select[1]\r\n") WebElement CATEGORY_ELEMENT;
	@FindBy(how=How.XPATH, using="//*[@id=\"extra\"]/select[2]") WebElement DUE_DATE_ELEMENT;
	@FindBy(how=How.XPATH, using="	//*[@id=\"extra\"]/select[3]\r\n") WebElement DUE_DATE_MONTH_ELEMENT;
	@FindBy(how=How.XPATH, using="	//*[@id=\"extra\"]/select[4]\r\n") WebElement DUE_DATE_MONTH_YEAR_ELEMENT;
	@FindBy(how=How.XPATH, using="	//*[@id=\"extra\"]/input[1]\r\n") WebElement ADD_CATEGORY;
	@FindBy(how=How.XPATH, using="//*[@id=\"extra\"]/select[5]") WebElement COLOR;
	@FindBy(how=How.XPATH, using="/html/body/div[4]/input[2]") WebElement ADD_BUTTON;
	@FindBy(how=How.XPATH, using="	//*[@id=\"todos-content\"]/form/ul/li/input\r\n") WebElement CHECKBOX_BUTTON;
	@FindBy(how=How.XPATH, using="	/html/body/div[3]/input[3]\r\n") WebElement TOGGLE_ALL_CHECKBOX_BUTTON;
	@FindBy(how=How.XPATH, using="	/html/body/div[3]/input[1]\r\n") WebElement REMOVE_BUTTON;
	@FindBy(how=How.XPATH, using="	//*[@id=\"extra\"]/button[1]\r\n") WebElement SKY_BLUE_COLOR_BUTTON;
	@FindBy(how=How.XPATH, using="	//*[@id=\"extra\"]/button[1]\r\n") WebElement WHITE_COLOR_BUTTON;

	//*[@id="todos-content"]/form/ul/li/input
	//*[@id="extra"]/input[1]
	
	
	public void AddElement(String Element) {
		ADD_ELEMENT.sendKeys(Element);
	}
	
	public void Category(String CATEGORY) {
		selectDropdown(CATEGORY_ELEMENT, CATEGORY);
	}
	
	public void DueDate(String date ) {
		selectDropdown(DUE_DATE_ELEMENT, date);
	}
	
	public void DueDateMonth(String month ) {
		selectDropdown(DUE_DATE_MONTH_ELEMENT, month);
	}
	
	public void DueDateMonthYear(String Year ) {
		selectDropdown(DUE_DATE_MONTH_YEAR_ELEMENT, Year);
	}
	
	public void AddCategory(String AddCategory) {
		ADD_ELEMENT.sendKeys(AddCategory);
	}
	
	public void color(String color ) {
		selectDropdown(COLOR, color);
	}
	
	public void AddButton() {
		ADD_BUTTON.click();
	}
	
	
	public void CheckboxButton() {
		CHECKBOX_BUTTON.click();
	}

	public void RemoveButton() {
		REMOVE_BUTTON.click();
	}
	
	public void ToggleCheckboxButton() {
		TOGGLE_ALL_CHECKBOX_BUTTON.click();
	}
	
	public void SkyBlueColorButton() {
		SKY_BLUE_COLOR_BUTTON.click();
	}
	
	public void WhiteColorButton() {
		WHITE_COLOR_BUTTON.click();
	}
	


}
