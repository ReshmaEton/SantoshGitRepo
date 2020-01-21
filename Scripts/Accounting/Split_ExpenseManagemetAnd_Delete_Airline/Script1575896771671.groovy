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

WebUI.callTestCase(findTestCase('CommonCases/Bulk Upload'), [('AppUrl') : AppUrl, ('UserName') : UserName, ('Password') : Password
        , ('SecurityAns') : SecurityAns, ('RelationName') : RelationName, ('RelationDesc') : RelationDesc, ('RelationStatus') : RelationStatus
        , ('SourceOfWealth') : SourceOfWealth, ('RelationType') : RelationType, ('Notes') : Notes, ('EntLegalName') : EntLegalName
        , ('EntStatus') : EntStatus, ('EntType') : EntType, ('EntShortName') : EntShortName, ('EntTaxStatus') : EntTaxStatus
        , ('EntDueDeligenceType') : EntDueDeligenceType, ('EntCurrency') : EntCurrency, ('EntAccMethod') : EntAccMethod, ('EntChartOfAcc') : EntChartOfAcc
        , ('EntCalendr') : EntCalendr, ('EntClosingGrup') : EntClosingGrup, ('AccNum') : AccNum, ('AccName') : AccName, ('AccType') : AccType
        , ('Custodian') : Custodian, ('TradingCustodian') : TradingCustodian, ('RollupNameStrategy') : RollupNameStrategy
        , ('AccCurrency') : AccCurrency, ('TransAuthority') : TransAuthority, ('AccStatus') : AccStatus, ('PledgedAcc') : PledgedAcc
        , ('TreasuryEdge') : TreasuryEdge, ('BillPayFlag') : BillPayFlag, ('ExpenseFlag') : ExpenseFlag, ('TaxCostMethod') : TaxCostMethod
        , ('AccAdvCustody') : AccAdvCustody, ('SECclass') : SECclass, ('PricDataSource') : PricDataSource, ('GLaccEqt') : GLaccEqt
        , ('GLaccCash') : GLaccCash, ('ANHstatus') : ANHstatus, ('CapitalAllocation') : CapitalAllocation, ('UploadFileLocation') : 'C:\\Users\\Santosh.Kumar\\Desktop\\BulkUpload template.xlsx'
        ], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Expence Management/a_Accounting tab'), 5)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/a_Accounting tab'))

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/a_My Work'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Expence Management/Expense Approval tab'), 5)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/Expense Approval tab'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/Column_setting_ExpenseApproval'))

WebUI.mouseOver(findTestObject('Object Repository/Accounting/Expence Management/span_Filter_ExpenseApproval'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Expence Management/Filter_searchTextBox_ExpApproval'), 
    6)

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

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/a_Add Split_ExpenseManagement'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Accounting/Expence Management/descriptionTextBox_ExpMng'), SplitDescription1)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/td_Uncategorized_ExpMng'))

WebUI.setText(findTestObject('Object Repository/Accounting/Expence Management/Uncategorized_forSend'), SplitCategory1)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/Amount_ExpMng'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Expence Management/Amount_ExpMngSend'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Expence Management/Amount_ExpMngSend'), SplitAmount1)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/a_Add Split_ExpenseManagement'))

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Expence Management/DescriptionTextBox2_ExpMng'), SplitDescription2)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/td_uncategorizedVacation_2_ExpMng'))

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Expence Management/Uncategorized_forSend'), SplitCategory2)

WebUI.click(findTestObject('Accounting/Expence Management/Amount_2_ExpMng'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Accounting/Expence Management/Amount_ExpmngforSend1'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Accounting/Expence Management/Amount_ExpmngforSend1'), SplitAmount2)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Expence Management/a_Update_ExpMng'), 5)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/a_Update_ExpMng'))

WebUI.delay(28)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/blueTik_button'))

WebUI.delay(28)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/blueTik_button'))

WebUI.delay(28)

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
WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/a_Operations'), 6)

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

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/Expande button-AGT'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/Journal Entries tab-AGT'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Edit Expense Management/column setting modify-AGT'), 
    2)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Edit Expense Management/Expande button JE-AGT'), 2)

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/Expande button JE-AGT'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Edit Expense Management/Column setting As Of Date-JE-AGT'), 
    2)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Edit Expense Management/EditButton global transaction'), 
    2)

//Delete expense management
WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/EditButton global transaction'))

WebUI.delay(8)

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Edit Expense Management/RedCrossButoton GlobalTrans'), 
    5)

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/RedCrossButoton GlobalTrans'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/a_Close GlobalTrans'))

WebUI.refresh()

//Approve in expense Approval Accounting Tab
WebUI.delay(8)

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Expence Management/a_Accounting tab'), 5)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/a_Accounting tab'))

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/a_My Work'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Expence Management/Expense Approval tab'), 5)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/Expense Approval tab'))

WebUI.delay(28)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/Column_setting_ExpenseApproval'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Object Repository/Accounting/Expence Management/span_Filter_ExpenseApproval'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Expence Management/Filter_searchTextBox_ExpApproval'), 
    6)

WebUI.setText(findTestObject('Object Repository/Accounting/Expence Management/Filter_searchTextBox_ExpApproval'), RelationName)

String xpath2 = ('//div[@data-role=\'filtermulticheck\']/form/ul/li/label[text()=\'' + RelationName) + '\']/input'

TestObject to2 = new TestObject('SelectRelCheckBox')

to2.addProperty('xpath', ConditionType.EQUALS, xpath2)

WebUI.click(to2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/button_Filter_ExpApproval'))

WebUI.verifyTextPresent(RelationName, false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/blueTik_button'))

WebUI.delay(28)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/blueTik_button'))

WebUI.delay(28)

WebUI.click(findTestObject('Object Repository/Accounting/Expence Management/blueTik_button'))

WebUI.delay(28)

//Verify in Global Transaction
WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/a_Operations'), 6)

WebUI.click(findTestObject('Operations/BulkUpload/a_Operations'))

WebUI.click(findTestObject('Operations/BulkUpload/a_Transactions'))

WebUI.click(findTestObject('Operations/BulkUpload/a_Global'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/BulkUpload/Relationship_global_transactions'), 
    6)

WebUI.setText(findTestObject('Object Repository/Operations/BulkUpload/Relationship_global_transactions'), RelationName)

WebUI.sendKeys(findTestObject('Object Repository/Operations/BulkUpload/Relationship_global_transactions'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/Transaction Amount_globalTansaction'))

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Edit Expense Management/Transaction Amount_globalTansaction_2'), 
    TransactionAmount_2)

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/searchButton_global_transactions'))

WebUI.verifyTextPresent(RelationName, false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/EditButton global transaction'))

WebUI.delay(8)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/a_Close-AGT'))

//Again verify in AGT if need
WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/Expande button-AGT'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/Journal Entries tab-AGT'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Edit Expense Management/column setting modify-AGT'), 
    2)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Edit Expense Management/Expande button JE-AGT'), 2)

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/Expande button JE-AGT'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Accounting/Edit Expense Management/Column setting As Of Date-JE-AGT'), 
    2)

WebUI.takeScreenshot()

WebUI.closeBrowser()

