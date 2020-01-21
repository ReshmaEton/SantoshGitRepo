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

WebUI.waitForElementClickable(findTestObject('CRM/Create Investment Objectives/Investment Objectives tab'), 6)

WebUI.click(findTestObject('CRM/Create Investment Objectives/Investment Objectives tab'))

WebUI.click(findTestObject('CRM/Create Investment Objectives/PlusIcon'))

WebUI.waitForElementClickable(findTestObject('CRM/Create Investment Objectives/button_Submit'), 6)

WebUI.selectOptionByLabel(findTestObject('CRM/Create Investment Objectives/Investment Objective Code'), InvestmentObjectiveCode, 
    false)

WebUI.setText(findTestObject('CRM/Create Investment Objectives/Effective Date'), EffectiveDate)

WebUI.setText(findTestObject('CRM/Create Investment Objectives/End Date'), EndDate)

WebUI.setText(findTestObject('CRM/Create Investment Objectives/Min_Cash_Balance'), minCashBalance)

WebUI.selectOptionByLabel(findTestObject('CRM/Create Investment Objectives/Liquidity'), Liquidity, false)

WebUI.selectOptionByLabel(findTestObject('CRM/Create Investment Objectives/Incom Needs'), IncomNeeds, false)

WebUI.selectOptionByLabel(findTestObject('CRM/Create Investment Objectives/Risk Level'), RiskLevel, false)

WebUI.selectOptionByLabel(findTestObject('CRM/Create Investment Objectives/Tax Bracket'), TaxBracket, false)

WebUI.selectOptionByLabel(findTestObject('CRM/Create Investment Objectives/Tax State SIT'), TaxStateSIT, false)

WebUI.selectOptionByLabel(findTestObject('CRM/Create Investment Objectives/Passive Active Preference'), PassiveActivePreference, 
    false)

WebUI.selectOptionByLabel(findTestObject('CRM/Create Investment Objectives/Entity Envestor Experience'), EntityInvestorExp, 
    false)

WebUI.selectOptionByLabel(findTestObject('CRM/Create Investment Objectives/Investor Accrediation status'), InvestorAccrediationStatus, 
    false)

WebUI.selectOptionByLabel(findTestObject('CRM/Create Investment Objectives/Inv adv Agreement status'), InvAdvAgreementStatus, 
    false)

WebUI.selectOptionByLabel(findTestObject('CRM/Create Investment Objectives/Discretionary'), Discretionary, false)

WebUI.setText(findTestObject('CRM/Create Investment Objectives/notes'), notes)

WebUI.click(findTestObject('CRM/Create Investment Objectives/button_Submit'))

WebUI.delay(9)

WebUI.click(findTestObject('CRM/Create Investment Objectives/button_Final Approval'))

WebUI.takeScreenshot()

