@Regression
Feature: DataDriven

  
  Scenario Outline: searchNow
    Given user will serach <search>
    When user will search <search2>
    And user will search again <search3>
    And user will search again4 <search4>
    And user will search again5 <search5>
    And user will search again6 <search6>
    

    Examples: 
      | search       | search2 |  search3	 	| search4|		search5|		search6|
|" Google"|"Microsoft Bing"|"Yahoo"|"Baidu"|"Yandex"|"DuckDuckGo"|
	| "Ecosia						"		|" Internet Archive					"	 | " more    			"	| " information					"	|"at			"			|" cucumber.io/docs				"		|
      |"Selenium" |  "Java"    | "TestNg"|  "restassured"| "API"  | "call, post, put, delete "		|
      |"Junit"					|		" Jira"		| "Cucumber"	|"CucumberJunit"| "CucumberTestng"| "Eclipse"|
      
      
