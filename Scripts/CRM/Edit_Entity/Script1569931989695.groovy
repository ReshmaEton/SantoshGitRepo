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

WebUI.callTestCase(findTestCase('CommonCases/Entity'), [('EntLegalName') : EntLegalName, ('EntStatus') : EntStatus, ('EntType') : EntType
        , ('EntShortName') : EntShortName, ('EntTaxStatus') : EntTaxStatus, ('EntDueDeligenceType') : EntDueDeligenceType
        , ('EntCurrency') : EntCurrency, ('EntAccMethod') : EntAccMethod, ('EntChartOfAcc') : EntChartOfAcc, ('EntCalendr') : EntCalendr
        , ('EntClosingGrup') : EntClosingGrup], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CRM/Edit_Entity/button_Close'))

WebUI.refresh()

WebUI.waitForElementClickable(findTestObject('CRM/Edit_Entity/Entities_tab'), 6)

WebUI.click(findTestObject('CRM/Edit_Entity/Entities_tab'))

WebUI.waitForElementClickable(findTestObject('CRM/Edit_Entity/Entity Name column setting'), 9)

WebUI.click(findTestObject('CRM/Edit_Entity/Entity Name column setting'))

WebUI.mouseOver(findTestObject('CRM/Edit_Entity/span_Filter Entity Name'))

WebUI.waitForElementClickable(findTestObject('CRM/Edit_Entity/Contains_k-textbox'), 9)

WebUI.setText(findTestObject('CRM/Edit_Entity/Contains_k-textbox'), EntLegalName)

WebUI.click(findTestObject('CRM/Edit_Entity/button_Filter'))
WebUI.takeScreenshot()

WebUI.verifyTextPresent(EntLegalName,false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CRM/Edit_Entity/Filtered Entity Name'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Edit_Entity/button_Edit'), 6)

WebUI.click(findTestObject('Object Repository/CRM/Edit_Entity/button_Edit'))

WebUI.waitForElementClickable(findTestObject('CRM/Create Entity/EntityShortName'), 6)

WebUI.clearText(findTestObject('CRM/Create Entity/EntityShortName'))

WebUI.setText(findTestObject('CRM/Create Entity/EntityShortName'), EntShortName_Edit)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('CRM/Create Entity/EntitySubmitButton'), 6)

WebUI.click(findTestObject('CRM/Create Entity/EntitySubmitButton'))

WebUI.delay(5)

WebUI.click(findTestObject('CRM/Create Entity/EntityFinalApprovalButton'))

WebUI.takeScreenshot()

