import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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

//Bulk Upload
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

//verify in AGT
WebUI.delay(8)

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/a_Operations'), 6)

WebUI.click(findTestObject('Operations/BulkUpload/a_Global'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/BulkUpload/Relationship_global_transactions'), 
    6)

WebUI.setText(findTestObject('Object Repository/Operations/BulkUpload/Relationship_global_transactions'), RelationName)

WebUI.sendKeys(findTestObject('Object Repository/Operations/BulkUpload/Relationship_global_transactions'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/AccountTextBox_global_transactions'))

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/listOfAccount_global_transactions'))

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/Transaction Amount_globalTansaction'))

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Edit Expense Management/Transaction Amount_globalTansaction_2'), 
    TransactionAmount_2)

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/searchButton_global_transactions'))

WebUI.verifyTextPresent(RelationName, false)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Edit Expense Management/column setting cusipType-AGT'), 
    2)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Edit Expense Management/Expande button-AGT'), 2)

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/Expande button-AGT'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/Journal Entries tab-AGT'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Edit Expense Management/column setting modify-AGT'), 
    2)

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.refresh()

 WebUI.delay(10)
//Create Expense categoty
WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/a_Accounting tab'))

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Category/a_Setup-Accounting'))

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Category/span_Expense Category-Accounting'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Category/a_Add new record-ExpCategory'))

WebUI.delay(2)

WebUI.setText(findTestObject('Accounting/Edit Expense Category/input_Expense Category'), CategoryName)

WebUI.sendKeys(findTestObject('Accounting/Edit Expense Category/input_Expense Category'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Object Repository/Accounting/Edit Expense Category/input_ExpCategory-ChartOfAcc'), ChartOfAccounts)

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Edit Expense Category/input_ExpCategory-ChartOfAcc'), Keys.chord(
        Keys.TAB))

WebUI.setText(findTestObject('Object Repository/Accounting/Edit Expense Category/input_ExpCategory-GLAcc'), GLAccount)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Category/GLAccount DropDown'))

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Category/a_Save-ExpCategory'))

WebUI.delay(29)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/a_My Work'))

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Category/Expense Categories tab'))

WebUI.delay(21)

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Category/ColumnSetting Category'))

WebUI.mouseOver(findTestObject('Object Repository/Accounting/Edit Expense Category/span_Filter ExpCategory tab'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Edit Expense Category/input Search'), 6)

WebUI.setText(findTestObject('Object Repository/Accounting/Edit Expense Category/input Search'), CategoryName)

String xpath = ('//div[@data-role=\'filtermulticheck\']/form/ul/li/label[text()=\'' + CategoryName) + '\']/input'

TestObject to = new TestObject('SelectRelCheckBox')

to.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.click(to)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Category/button_Filter Category'))

WebUI.verifyTextPresent(CategoryName, false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Category/BlueTik ExpCategory'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Category/span_Expense Category-Accounting'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Category/ExpCategory Filter button'))

WebUI.setText(findTestObject('Object Repository/Accounting/Edit Expense Category/input_Filter ExpCategory'), CategoryName)

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Category/button_Filter ExpCategory'))

WebUI.verifyTextPresent(CategoryName, false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/a_My Work'))

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/Expense Approval tab'))

WebUI.delay(28)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/Column_setting_ExpenseApproval'))

WebUI.mouseOver(findTestObject('Object Repository/Accounting/Expence Management/span_Filter_ExpenseApproval'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Expence Management/Filter_searchTextBox_ExpApproval'), 
    6)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Accounting/Expence Management/Filter_searchTextBox_ExpApproval'), RelationName)

String xpath1 = ('//div[@data-role=\'filtermulticheck\']/form/ul/li/label[text()=\'' + RelationName) + '\']/input'

TestObject to1 = new TestObject('SelectRelCheckBox')

to1.addProperty('xpath', ConditionType.EQUALS, xpath1)

WebUI.click(to1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/button_Filter_ExpApproval'))

WebUI.verifyTextPresent(RelationName, false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/EditButton_Expense Approval'))

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Category/Category DropDown-ExpApproval'))

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Edit Expense Category/input Category ExpApproavl'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.setText(findTestObject('Object Repository/Accounting/Edit Expense Category/input Category ExpApproavl'), CategoryName)

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Edit Expense Category/input Category ExpApproavl'), Keys.chord(
        Keys.TAB))

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Edit Expense Category/CountreParty DropDown-expApproval'), 
    2)

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Category/CountreParty DropDown-expApproval'))

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Edit Expense Category/input_CounterParty ExpApproval'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.setText(findTestObject('Object Repository/Accounting/Edit Expense Category/input_CounterParty ExpApproval'), ConterParty)

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Edit Expense Category/input_CounterParty ExpApproval'), Keys.chord(
        Keys.TAB))

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Edit Expense Category/Deliverable DropDown ExpApproval'), 
    2)

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Category/Deliverable DropDown ExpApproval'))

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Edit Expense Category/input_Deliverable ExpApproval'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.setText(findTestObject('Object Repository/Accounting/Edit Expense Category/input_Deliverable ExpApproval'), Deliverable)

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Edit Expense Category/input_Deliverable ExpApproval'), Keys.chord(
        Keys.TAB))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Expence Management/a_Update_ExpMng'), 2)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/a_Update_ExpMng'))

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Category/button_Ok PopUp changecategory'))

WebUI.delay(25)

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Category/BlueTik ExpApproval'))

WebUI.delay(25)

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Category/BlueTik2-ExpApproval'))

WebUI.delay(25)

//verify in expanse management tab
WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/Expense Management_tab'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Expence Management/Relationship_filter_ExpManagament'), 
    9)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/Relationship_filter_ExpManagament'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Expence Management/textbox_relationship_filter'), 
    5)

WebUI.setText(findTestObject('Object Repository/Accounting/Expence Management/textbox_relationship_filter'), RelationName)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/button_Filter'))

WebUI.delay(5)

WebUI.verifyTextPresent(RelationName, false)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/ExpandeButton_ExpMng'))

WebUI.takeScreenshot()

//verify in General Journal
WebUI.click(findTestObject('Accounting/Expence Management/a_General Journal_AccModule'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Expence Management/Relationship_input_Genaral Journal'), 
    5)

WebUI.setText(findTestObject('Object Repository/Accounting/Expence Management/Relationship_input_Genaral Journal'), RelationName)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/searchButton_General Journal'))

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Expence Management/th_Amount_General Journal'), 5)

WebUI.delay(5)

WebUI.verifyTextPresent(RelationName, false)

WebUI.takeScreenshot()

//verify in AGT
WebUI.click(findTestObject('Operations/BulkUpload/a_Operations'))

WebUI.click(findTestObject('Operations/BulkUpload/a_Transactions'))

WebUI.click(findTestObject('Operations/BulkUpload/a_Global'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/BulkUpload/Relationship_global_transactions'), 
    6)

WebUI.setText(findTestObject('Object Repository/Operations/BulkUpload/Relationship_global_transactions'), RelationName)

WebUI.sendKeys(findTestObject('Object Repository/Operations/BulkUpload/Relationship_global_transactions'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/AccountTextBox_global_transactions'))

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/listOfAccount_global_transactions'))

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/Transaction Amount_globalTansaction'))

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Edit Expense Management/Transaction Amount_globalTansaction_2'), 
    TransactionAmount_2)

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/searchButton_global_transactions'))

WebUI.verifyTextPresent(RelationName, false)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Edit Expense Management/column setting cusipType-AGT'), 
    2)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Edit Expense Management/Expande button-AGT'), 2)

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/Expande button-AGT'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/Journal Entries tab-AGT'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Edit Expense Management/column setting modify-AGT'), 
    2)

WebUI.takeScreenshot()

WebUI.closeBrowser()

