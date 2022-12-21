package stepDefinetion;






import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class Search1 extends BaseClass  {
    
    @Given("user will serach {string}")
    public void user_will_serach1(String string) throws InterruptedException {
	
	googleHomePage.inputSomething(string);
	       Thread.sleep(2000);
       
    }
    @When("user will search {string}")
    public void user_will_search2(String string) throws InterruptedException {
		googleHomePage.clickSelect();
	       googleHomePage.inputSomething(string);
	       Thread.sleep(2000);
    }
    @And("user will search again {string}")
    public void user_will_search3(String string) {
	googleHomePage.clickSelect();
       googleHomePage.inputSomething(string);
       
    }
    
    @And("user will search again4 {string}")
    public void user_will_serch4(String string) {
	googleHomePage.clickSelect();
       googleHomePage.inputSomething(string);
       
    }
    
    @And("user will search again5 {string}")
    public void user_will_serch5(String string) {
	googleHomePage.clickSelect();
       googleHomePage.inputSomething(string);
       
    }
    
    @And("user will search again6 {string}")
    public void user_will_serch6(String string) {
	googleHomePage.clickSelect();
       googleHomePage.inputSomething(string);
       
    }
  
    
	
    
        
      
 
	
	
	
}
