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

//Create Portfolio
WebUI.waitForElementPresent(findTestObject('CRM/Create Portfolio/Portfolio Tab'), 3)

WebUI.waitForElementClickable(findTestObject('CRM/Create Portfolio/Portfolio Tab'), 3)

WebUI.click(findTestObject('CRM/Create Portfolio/Portfolio Tab'))

WebUI.waitForElementClickable(findTestObject('CRM/Create Portfolio/Portfolio plus Icon'), 3)

WebUI.click(findTestObject('CRM/Create Portfolio/Portfolio plus Icon'))

WebUI.waitForElementPresent(findTestObject('CRM/Create Portfolio/Portfolio Name'), 3)

WebUI.setText(findTestObject('CRM/Create Portfolio/Portfolio Name'), PortfolioName)

WebUI.setText(findTestObject('CRM/Create Portfolio/Description'), PortDescription)


WebUI.selectOptionByLabel(findTestObject('CRM/Create Portfolio/Portfolio Status'), PortfolioStatus, false)

WebUI.selectOptionByLabel(findTestObject('CRM/Create Portfolio/Portfolio Type'), PortfolioType, false)

WebUI.waitForElementClickable(findTestObject('CRM/Create Portfolio/Click on Submit Btn'), 9)

WebUI.click(findTestObject('CRM/Create Portfolio/Click on Submit Btn'))

WebUI.delay(9)

WebUI.click(findTestObject('CRM/Create Portfolio/Final Approval Btn'))

WebUI.delay(5)

WebUI.takeScreenshot()

