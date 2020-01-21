import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Create project
WebUI.waitForElementPresent(findTestObject('CRM/Create Project/Project tab'), 3)

WebUI.waitForElementClickable(findTestObject('CRM/Create Project/Project tab'), 3)

WebUI.click(findTestObject('CRM/Create Project/Project tab'))

WebUI.waitForElementClickable(findTestObject('CRM/Create Project/Project Plus Icon'), 3)

WebUI.click(findTestObject('CRM/Create Project/Project Plus Icon'))

WebUI.waitForElementPresent(findTestObject('CRM/Create Project/Project name'), 3)

WebUI.setText(findTestObject('CRM/Create Project/Project name'), ProjectName)

WebUI.selectOptionByLabel(findTestObject('CRM/Create Project/Project Category'), ProjectCategory, false)

WebUI.selectOptionByLabel(findTestObject('CRM/Create Project/Priority'), Priority, false)

WebUI.setText(findTestObject('CRM/Create Project/Project Description'), ProjectDescription)

WebUI.selectOptionByLabel(findTestObject('CRM/Create Project/Owner'), Owner, false )
    
WebUI.selectOptionByLabel(findTestObject('CRM/Create Project/Target Relationship'), RelationName, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CRM/Create Project/Targer Level'), TargetLevel, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CRM/Create Project/Target'), RelationName, false)

WebUI.setText(findTestObject('CRM/Create Project/Start Date'), StartDate)

WebUI.setText(findTestObject('CRM/Create Project/Target Date'), TargetDate)

WebUI.setText(findTestObject('CRM/Create Project/End Date'), EndDate)

WebUI.selectOptionByLabel(findTestObject('CRM/Create Project/Status'), Status, false)

WebUI.click(findTestObject('CRM/Create Project/button_Save'))

WebUI.delay(5)

WebUI.takeScreenshot()

