package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.CommonFunctions;

public class GoogleHomePage {
    WebDriver driver;
    CommonFunctions commons;
    
    public GoogleHomePage(WebDriver driver, CommonFunctions commons) {
	PageFactory.initElements(driver, this);
	this.driver= driver;
	this.commons=commons;
    }
    

    @FindBy(css = "input.gLFyf")
    WebElement inputWebElement;

    public  void inputSomething(String inputText) {
	commons.inputValuesEnter(inputWebElement, inputText);
	
    }
public  void clickSelect() {
    commons.click(inputWebElement);
	commons.ctrlA(inputWebElement);
	
}
    private void inputSomething2(String inputText)  {
	commons.click(inputWebElement);
	
	commons.ctrlA(inputWebElement);
	
	commons.inputValuesEnter(inputWebElement, inputText);
	
    }
}
