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

WebUI.callTestCase(findTestCase('CommonCases/Projects'), [('"EndDate"') : EndDate, ('"StartDate"') : StartDate, ('ProjectName') : ProjectName
        , ('ProjectCategory') : ProjectCategory, ('Priority') : Priority, ('StrategicInitiative') : StrategicInitiative, ('ProjectDescription') : ProjectDescription
        , ('EntLegalName') : EntLegalName, ('RelationName') : RelationName, ('Status') : Status, ('Owner') : Owner, ('TargetLevel') : TargetLevel
        , ('"TargetDate"') : TargetDate], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('CRM/Edit_Project/button_Close'), 6)

WebUI.click(findTestObject('CRM/Edit_Project/button_Close'))

WebUI.refresh()

WebUI.waitForElementClickable(findTestObject('CRM/Edit_Project/Project tab'), 6)

WebUI.click(findTestObject('CRM/Edit_Project/Project tab'))

WebUI.waitForElementClickable(findTestObject('CRM/Edit_Project/Column_setting'), 6)

WebUI.click(findTestObject('CRM/Edit_Project/Column_setting'))

WebUI.mouseOver(findTestObject('CRM/Edit_Project/Filter'))

WebUI.waitForElementClickable(findTestObject('CRM/Edit_Project/Filter_search'), 6)

WebUI.setText(findTestObject('CRM/Edit_Project/Filter_search'), ProjectName)

String xpath = ('//div[@data-role=\'filtermulticheck\']/form/ul/li/label[text()=\'' + ProjectName) + '\']/input'

TestObject to = new TestObject('SelectRelCheckBox')

to.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.click(to)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CRM/Edit_Project/button_Filter'))

WebUI.verifyTextPresent(ProjectName, false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('CRM/Edit_Project/Filtered Project'))

