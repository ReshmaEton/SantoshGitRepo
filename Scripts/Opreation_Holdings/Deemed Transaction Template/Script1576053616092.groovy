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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('CommonCases/Login'), [('AppUrl') : AppUrl, ('UserName') : UserName, ('Password') : Password
        , ('SecurityAns') : SecurityAns], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Relationship'), [('RelationName') : RelationName, ('RelationDesc') : RelationDesc
        , ('RelationStatus') : RelationStatus, ('SourceOfWealth') : SourceOfWealth, ('RelationType') : RelationType, ('Notes') : Notes], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Entity'), [('EntLegalName') : EntLegalName, ('EntStatus') : EntStatus, ('EntType') : EntType
        , ('EntShortName') : EntShortName, ('EntTaxStatus') : EntTaxStatus, ('EntDueDeligenceType') : EntDueDeligenceType
        , ('EntCurrency') : EntCurrency, ('EntAccMethod') : EntAccMethod, ('EntChartOfAcc') : EntChartOfAcc, ('EntCalendr') : EntCalendr
        , ('EntClosingGrup') : EntClosingGrup], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Account'), [('AccNum') : AccNum, ('AccName') : AccName, ('AccType') : AccType
        , ('Custodian') : Custodian, ('TradingCustodian') : TradingCustodian, ('RollupNameStrategy') : RollupNameStrategy
        , ('AccCurrency') : AccCurrency, ('TransAuthority') : TransAuthority, ('AccStatus') : AccStatus, ('PledgedAcc') : PledgedAcc
        , ('TreasuryEdge') : TreasuryEdge, ('BillPayFlag') : BillPayFlag, ('ExpenseFlag') : ExpenseFlag, ('TaxCostMethod') : TaxCostMethod
        , ('AccAdvCustody') : AccAdvCustody, ('SECclass') : SECclass, ('PricDataSource') : PricDataSource, ('GLaccEqt') : GLaccEqt
        , ('GLaccCash') : GLaccCash, ('ANHstatus') : ANHstatus, ('CapitalAllocation') : CapitalAllocation], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Edit_Account/Close_button'), 6)

WebUI.click(findTestObject('Object Repository/CRM/Edit_Account/Close_button'))

WebUI.refresh()

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/a_Operations'), 6)

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/a_Operations'))

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/a_Transactions'))

WebUI.click(findTestObject('Object Repository/Operations/Deem Transaction Template/span_Templates'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/Deem Transaction Template/CreateDeemedTransactionTemplate'), 
    9)

WebUI.click(findTestObject('Object Repository/Operations/Deem Transaction Template/CreateDeemedTransactionTemplate'))

WebUI.delay(2)

//Create Deemed Template
WebUI.waitForElementClickable(findTestObject('Object Repository/Investment/Loan/buttonSave DeemedTemplate'), 5)

WebUI.setText(findTestObject('Object Repository/Investment/Loan/TemplateName_ DeemedTemplate'), TemplateName)

WebUI.click(findTestObject('Object Repository/Investment/Loan/TransactionType_DT'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Investment/Loan/TransactionType_DT'), TransactionType, false)

WebUI.click(findTestObject('Object Repository/Operations/Deem Transaction Template/span_Relationship_icon'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Operations/Deem Transaction Template/input_Relatioship_textbox'), RelationName)

WebUI.sendKeys(findTestObject('Object Repository/Operations/Deem Transaction Template/input_Relatioship_textbox'),Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/Operations/Deem Transaction Template/span_Entity_icon'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Operations/Deem Transaction Template/input_Entity_textbox'), EntLegalName)

WebUI.sendKeys(findTestObject('Object Repository/Operations/Deem Transaction Template/input_Entity_textbox'),Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/Operations/Deem Transaction Template/ANH Account'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Operations/Deem Transaction Template/ANH Account -Dropdown'))

WebUI.setText(findTestObject('Object Repository/Operations/Deem Transaction Template/input_ANH Asset_cusip'), Cusip)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Operations/Create Deemed Transaction/Cusip List'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/Cash TransactionCode'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Cash TransactionCode DropDown'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/Assets TransactionCode'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Assets TransactionCode -Borrower'))

WebUI.click(findTestObject('Object Repository/Operations/Deem Transaction Template/GL Debit DropDown'))

WebUI.click(findTestObject('Object Repository/Operations/Deem Transaction Template/GL Credit DropDown'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/TemplateName_ DeemedTemplate'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Investment/Loan/buttonSave DeemedTemplate'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Operations/Deem Transaction Template/Deemed Templates tab'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/Deem Transaction Template/Template name ColumnSetting'), 6)

WebUI.click(findTestObject('Object Repository/Operations/Deem Transaction Template/Template name ColumnSetting'))

WebUI.mouseOver(findTestObject('Object Repository/Operations/Deem Transaction Template/span_Filter'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/Deem Transaction Template/input Template Name'), 6)

WebUI.setText(findTestObject('Object Repository/Operations/Deem Transaction Template/input Template Name'), TemplateName)

String xpath = ('//div[@data-role=\'filtermulticheck\']/form/ul/li/label[text()=\'' + TemplateName) + '\']/input'

TestObject to = new TestObject('SelectRelCheckBox')

to.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.click(to)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CRM/Edit-Relationship/button_Filter'))

WebUI.verifyTextPresent(TemplateName, false)

WebUI.takeScreenshot()


