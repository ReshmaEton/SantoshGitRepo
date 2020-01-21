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

WebUI.callTestCase(findTestCase('CommonCases/Login'), [('AppUrl') : AppUrl, ('UserName') : UserName, ('Password') : Password
        , ('SecurityAns') : SecurityAns], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Relationship'), [('RelationName') : RelationName, ('RelationDesc') : RelationDesc
        , ('RelationStatus') : RelationStatus, ('SourceOfWealth') : SourceOfWealth, ('RelationType') : RelationType, ('Notes') : Notes], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Entity'), [('EntLegalName') : EntLegalName, ('EntStatus') : EntStatus, ('EntType') : EntType
        , ('EntShortName') : EntShortName, ('EntTaxStatus') : EntTaxStatus, ('EntDueDeligenceType') : EntDueDeligenceType
        , ('EntCurrency') : EntCurrency, ('EntAccMethod') : EntAccMethod, ('EntChartOfAcc') : EntChartOfAcc, ('EntCalendr') : EntCalendr
        , ('EntClosingGrup') : EntClosingGrup], FailureHandling.CONTINUE_ON_FAILURE)


WebUI.waitForElementClickable(findTestObject('CRM/Create_Related_Parties/Related Parties_tab'), 6)

WebUI.click(findTestObject('CRM/Create_Related_Parties/Related Parties_tab'))

WebUI.click(findTestObject('CRM/Create_Related_Parties/PlusIcon'))

WebUI.waitForElementClickable(findTestObject('CRM/Create_Related_Parties/select_EntityName'), 6)

WebUI.selectOptionByLabel(findTestObject('CRM/Create_Related_Parties/select_EntityName'), EntLegalName, false)

WebUI.selectOptionByLabel(findTestObject('CRM/Create_Related_Parties/Role_ID'), RoleID, false)

WebUI.setText(findTestObject('CRM/Create_Related_Parties/Effective Date'), EffectiveDate)

WebUI.setText(findTestObject('CRM/Create_Related_Parties/End Date'), EndDate)

WebUI.click(findTestObject('CRM/Create_Related_Parties/Submit_Button'))

WebUI.delay(9)

WebUI.click(findTestObject('CRM/Create_Related_Parties/Final_Approval'))

WebUI.takeScreenshot()

