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

WebUI.waitForElementClickable(findTestObject('CRM/Edit_Account/Close_button'), 6)

WebUI.click(findTestObject('CRM/Edit_Account/Close_button'))

WebUI.refresh()

WebUI.delay(10)

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/a_Operations'), 6)

WebUI.click(findTestObject('Operations/BulkUpload/a_Operations'))

WebUI.click(findTestObject('Operations/BulkUpload/a_Transactions'))

WebUI.click(findTestObject('Operations/BulkUpload/a_Global'))

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/a_Bulk Upload'), 5)

WebUI.click(findTestObject('Operations/BulkUpload/a_Bulk Upload'))

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/click_on_choose_files'), 5)

WebUI.verifyElementNotClickable(findTestObject('Operations/BulkUpload/button_Upload'))

WebUI.uploadFile(findTestObject('Operations/BulkUpload/click_on_choose_files'), UploadFileLocation)

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/button_Upload'), 5)

WebUI.takeScreenshot()

WebUI.verifyElementClickable(findTestObject('Operations/BulkUpload/button_Upload'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Operations/BulkUpload/button_Upload'))

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/button_Run Validation'), 5)

WebUI.click(findTestObject('Operations/BulkUpload/button_Run Validation'))

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/button_Ok_Success'), 5)

WebUI.click(findTestObject('Operations/BulkUpload/button_Ok_Success'))

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/button_Approve'), 5)

WebUI.click(findTestObject('Operations/BulkUpload/button_Approve'))

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/span_My Work'), 5)

WebUI.click(findTestObject('Operations/BulkUpload/span_My Work'))

WebUI.refresh()

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/My_work_Bulk_Transactions'), 5)

WebUI.click(findTestObject('Operations/BulkUpload/My_work_Bulk_Transactions'))

WebUI.delay(15)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/first row Bulk_transactions'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/BulkUpload/button_Approve_my_work_Bulk_Transactions'), 
    5)

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/button_Approve_my_work_Bulk_Transactions'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/first row Bulk_transactions'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/BulkUpload/button_Approve_my_work_Bulk_Transactions'), 
    5)

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/button_Approve_my_work_Bulk_Transactions'))

WebUI.delay(20)

WebUI.refresh()

