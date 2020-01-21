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

WebUI.waitForElementClickable(findTestObject('CRM/Edit-Relationship/close_Button'), 6)

WebUI.click(findTestObject('CRM/Edit-Relationship/close_Button'))

WebUI.refresh()

WebUI.waitForElementClickable(findTestObject('CRM/Edit-Relationship/Column_setting'), 6)

WebUI.click(findTestObject('CRM/Edit-Relationship/Column_setting')) //click on ...
    
WebUI.mouseOver(findTestObject('CRM/Edit-Relationship/Filter'))

WebUI.waitForElementClickable(findTestObject('CRM/Edit-Relationship/Filter_search'), 6)

WebUI.setText(findTestObject('CRM/Edit-Relationship/Filter_search'), RelationName)

String xpath = ('//div[@data-role=\'filtermulticheck\']/form/ul/li/label[text()=\'' + RelationName) + '\']/input'

TestObject to = new TestObject('SelectRelCheckBox')

to.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.click(to)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CRM/Edit-Relationship/button_Filter'))

WebUI.verifyTextPresent(RelationName, false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CRM/Edit-Relationship/Selected_Name'))

WebUI.waitForElementClickable(findTestObject('CRM/Edit-Relationship/button_Edit'), 6)

WebUI.click(findTestObject('CRM/Edit-Relationship/button_Edit'))

WebUI.waitForElementPresent(findTestObject('CRM/Relationship/button_SubmitRelationship'), 9)

WebUI.waitForElementClickable(findTestObject('CRM/Relationship/button_SubmitRelationship'), 9)

WebUI.clearText(findTestObject('CRM/Relationship/Text_Relationship_descript'))

WebUI.clearText(findTestObject('CRM/Relationship/Text_Source of wealth'))

WebUI.clearText(findTestObject('CRM/Relationship/Text_Notes'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('CRM/Relationship/Text_Relationship_descript'), RelationDesc_Edit)

WebUI.setText(findTestObject('CRM/Relationship/Text_Source of wealth'), SourceOfWealth_Edit)

WebUI.setText(findTestObject('CRM/Relationship/Text_Notes'), Notes_Edit)

WebUI.click(findTestObject('CRM/Relationship/button_SubmitRelationship'))

WebUI.delay(5)

WebUI.click(findTestObject('CRM/Relationship/button_Final ApprovalRelationship'))

WebUI.takeScreenshot()

