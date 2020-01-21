
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject

import org.openqa.selenium.WebElement


def static "sqlConnection.EntityScreen.connection"(
    	String url	
     , 	String user	
     , 	String password	
     , 	String driverClassName	) {
    (new sqlConnection.EntityScreen()).connection(
        	url
         , 	user
         , 	password
         , 	driverClassName)
}

def static "sqlConnection.PortfolioScreen.connection"(
    	String url	
     , 	String user	
     , 	String password	
     , 	String driverClassName	) {
    (new sqlConnection.PortfolioScreen()).connection(
        	url
         , 	user
         , 	password
         , 	driverClassName)
}

def static "com.jira.components.JSelect.selectByText"(
    	TestObject o	
     , 	String optionText	) {
    (new com.jira.components.JSelect()).selectByText(
        	o
         , 	optionText)
}

def static "com.jira.components.JSelect.selectByText"(
    	String labelSelect	
     , 	String optionText	) {
    (new com.jira.components.JSelect()).selectByText(
        	labelSelect
         , 	optionText)
}

def static "com.jira.components.JSelect.selectByText"(
    	WebElement el	
     , 	String optionText	) {
    (new com.jira.components.JSelect()).selectByText(
        	el
         , 	optionText)
}

def static "sqlConnection.AddressScreen.connection"(
    	String url	
     , 	String user	
     , 	String password	
     , 	String driverClassName	) {
    (new sqlConnection.AddressScreen()).connection(
        	url
         , 	user
         , 	password
         , 	driverClassName)
}

def static "sqlConnection.AccountScreen.connection"(
    	String url	
     , 	String user	
     , 	String password	
     , 	String driverClassName	) {
    (new sqlConnection.AccountScreen()).connection(
        	url
         , 	user
         , 	password
         , 	driverClassName)
}

def static "sqlConnection.RelationshipScreen.connection"(
    	String url	
     , 	String user	
     , 	String password	
     , 	String driverClassName	) {
    (new sqlConnection.RelationshipScreen()).connection(
        	url
         , 	user
         , 	password
         , 	driverClassName)
}

def static "sqlConnection.HouseholdScreen.connection"(
    	String url	
     , 	String user	
     , 	String password	
     , 	String driverClassName	) {
    (new sqlConnection.HouseholdScreen()).connection(
        	url
         , 	user
         , 	password
         , 	driverClassName)
}
