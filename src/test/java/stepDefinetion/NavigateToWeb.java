package stepDefinetion;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.handler.timeout.TimeoutException;

public class NavigateToWeb extends BaseClass {
    
    @When("user navigate to site")
    public void user_navigate_to_another_site1() throws InterruptedException {
	try {
	    driver.navigate().to("https://chat.openai.com/chat");
		Thread.sleep(5000);
	    
	} catch (org.openqa.selenium.TimeoutException e) {
	    System.out.println(e.getMessage());
	   
	}
	try {
	    driver.navigate().to("https://www.google.com");
		Thread.sleep(6000);
	} catch (org.openqa.selenium.TimeoutException e) {
	    System.out.println(e.getMessage());
	   
	}
	
    
	try {
		driver.navigate().to("https://www.DuckDuckGo.com");
		Thread.sleep(7000);
	} catch (org.openqa.selenium.TimeoutException e) {
	    System.out.println(e.getMessage());
	   
	}

    }
    @Then("user navigate to another site")
    public void user_navigate_to_another_site() throws InterruptedException {
	try {
	    driver.navigate().to("https://www.Codecademy.com");
		Thread.sleep(8000);
	} catch (org.openqa.selenium.TimeoutException e) {
	    System.out.println(e.getMessage());
	   
	}
	
	try {
	    driver.navigate().to("https://www.yahoo.com");
		Thread.sleep(9000);
	} catch (org.openqa.selenium.TimeoutException e) {
	    System.out.println(e.getMessage());
	   
	}
	
	try {
	    driver.navigate().to("https://www.Reddit.com");
		Thread.sleep(5000);
	} catch (org.openqa.selenium.TimeoutException e) {
	    System.out.println(e.getMessage());
	   
	}
    }
    @Then("again user navigate to site another1")
    public void again_user_navigate_to_site_another1() throws InterruptedException {
	try {
	    driver.navigate().to("https://www.amazon.com");
		Thread.sleep(9000);
	} catch (org.openqa.selenium.TimeoutException e) {
	    System.out.println(e.getMessage());
	   
	}
	try {
	    driver.navigate().to("https://www.twitch.com");
		Thread.sleep(9000);
	} catch (org.openqa.selenium.TimeoutException e) {
	    System.out.println(e.getMessage());
	   
	}
	try {
	    driver.navigate().to("https://www.youtube.com");
		Thread.sleep(9000);
	} catch (org.openqa.selenium.TimeoutException e) {
	    System.out.println(e.getMessage());
	   
	}
	

       
    }

}
