package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddData;

import util.BrowserFactory;

public class AddDataTest {
	WebDriver driver;

	@Test
	public void ValidUserShouldAbleToAddTestData() throws InterruptedException {
		
		driver=BrowserFactory.init();
		
		AddData Adddata = PageFactory.initElements(driver, AddData.class );
		
		
		Adddata.AddElement("jndsjdjd");
		Adddata.Category("Test");
		Adddata.DueDate("5");
		Adddata.DueDateMonth("Feb");
		Adddata.DueDateMonthYear("2021");
		Adddata.AddCategory("MD9");
		Adddata.color("Green");
		Adddata.AddButton();
		
		Adddata.CheckboxButton();
		Thread.sleep(2000);

		Adddata.ToggleCheckboxButton();
		Adddata.RemoveButton();
		
		Adddata.SkyBlueColorButton();
		Thread.sleep(2000);

		Adddata.WhiteColorButton();
		Thread.sleep(2000);
		
		
		
		BrowserFactory.tearDown();
		
	}
}
