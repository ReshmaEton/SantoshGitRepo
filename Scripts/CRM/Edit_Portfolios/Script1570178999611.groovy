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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('CommonCases/Login'), [('AppUrl') : AppUrl, ('UserName') : UserName, ('Password') : Password
        , ('SecurityAns') : SecurityAns], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Relationship'), [('RelationName') : RelationName, ('RelationDesc') : RelationDesc
        , ('RelationStatus') : RelationStatus, ('SourceOfWealth') : SourceOfWealth, ('RelationType') : RelationType, ('Notes') : Notes], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Portfolio'), [('PortfolioName') : PortfolioName, ('PortDescription') : PortDescription
        , ('PortfolioStatus') : PortfolioStatus, ('PortfolioType') : PortfolioType], FailureHandling.CONTINUE_ON_FAILURE)


WebUI.waitForElementClickable(findTestObject('CRM/Edit_Portfolios/close_button'), 6)

WebUI.click(findTestObject('CRM/Edit_Portfolios/close_button'))

WebUI.refresh()

WebUI.waitForElementClickable(findTestObject('CRM/Edit_Portfolios/Portfolios tab'), 6)

WebUI.click(findTestObject('CRM/Edit_Portfolios/Portfolios tab'))

WebUI.waitForElementClickable(findTestObject('CRM/Edit_Portfolios/Column_setting'), 6)

WebUI.click(findTestObject('CRM/Edit_Portfolios/Column_setting'))

WebUI.mouseOver(findTestObject('CRM/Edit_Portfolios/span_Filter'))

WebUI.waitForElementClickable(findTestObject('CRM/Edit_Portfolios/Contains_k-textBox'), 6)

WebUI.setText(findTestObject('CRM/Edit_Portfolios/Contains_k-textBox'), PortfolioName)

WebUI.click(findTestObject('CRM/Edit_Portfolios/button_Filter'))

WebUI.click(findTestObject('CRM/Edit_Portfolios/selected Portfolio Name'))

WebUI.waitForElementClickable(findTestObject('CRM/Edit_Portfolios/button_Edit'), 6)

WebUI.click(findTestObject('CRM/Edit_Portfolios/button_Edit'))

WebUI.waitForElementClickable(findTestObject('CRM/Create Portfolio/Click on Submit Btn'), 6)

WebUI.clearText(findTestObject('CRM/Create Portfolio/Description'))

WebUI.setText(findTestObject('CRM/Create Portfolio/Description'), PortDescription_Edit)

WebUI.click(findTestObject('CRM/Create Portfolio/Click on Submit Btn'))

WebUI.waitForElementClickable(findTestObject('CRM/Create Portfolio/Final Approval Btn'), 9)

WebUI.click(findTestObject('CRM/Create Portfolio/Final Approval Btn'))

WebUI.takeScreenshot()

