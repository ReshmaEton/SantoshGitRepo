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


WebUI.waitForElementClickable(findTestObject('CRM/Edit_Account/Close_button'), 6)

WebUI.click(findTestObject('CRM/Edit_Account/Close_button'))

WebUI.refresh()

//Create Again Rel Ent Acc

WebUI.waitForElementVisible(findTestObject('CRM/Relationship/Porfolio_Tab'), 3)

WebUI.waitForElementClickable(findTestObject('CRM/Relationship/Porfolio_Tab'), 3)

WebUI.click(findTestObject('CRM/Relationship/button_Create Relationship...'))

WebUI.setText(findTestObject('CRM/Relationship/Text_Relationship Name_form-c'), RelationName1)

WebUI.setText(findTestObject('CRM/Relationship/Text_Relationship_descript'), RelationDesc)

WebUI.selectOptionByLabel(findTestObject('CRM/Relationship/select_(Please Select)RelStatus'), RelationStatus, false)

WebUI.setText(findTestObject('CRM/Relationship/Text_Source of wealth'), SourceOfWealth)
WebUI.selectOptionByLabel(findTestObject('CRM/Relationship/select_(Please Select)ClientEm_RelType'), RelationType, false)

WebUI.setText(findTestObject('CRM/Relationship/Text_Notes'), Notes)

WebUI.takeScreenshot()

WebUI.click(findTestObject('CRM/Relationship/button_SubmitRelationship'))

WebUI.delay(9)

WebUI.click(findTestObject('CRM/Relationship/button_Final ApprovalRelationship'))

WebUI.delay(5)

WebUI.takeScreenshot()
WebUI.callTestCase(findTestCase('CommonCases/Entity'), [('EntLegalName') : EntLegalName1, ('EntStatus') : EntStatus, ('EntType') : EntType
        , ('EntShortName') : EntShortName, ('EntTaxStatus') : EntTaxStatus, ('EntDueDeligenceType') : EntDueDeligenceType
        , ('EntCurrency') : EntCurrency, ('EntAccMethod') : EntAccMethod, ('EntChartOfAcc') : EntChartOfAcc, ('EntCalendr') : EntCalendr
        , ('EntClosingGrup') : EntClosingGrup], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Account'), [('AccNum') : AccNum1, ('AccName') : AccName, ('AccType') : AccType
        , ('Custodian') : Custodian, ('TradingCustodian') : TradingCustodian, ('RollupNameStrategy') : RollupNameStrategy
        , ('AccCurrency') : AccCurrency, ('TransAuthority') : TransAuthority, ('AccStatus') : AccStatus, ('PledgedAcc') : PledgedAcc
        , ('TreasuryEdge') : TreasuryEdge, ('BillPayFlag') : BillPayFlag, ('ExpenseFlag') : ExpenseFlag, ('TaxCostMethod') : TaxCostMethod
        , ('AccAdvCustody') : AccAdvCustody, ('SECclass') : SECclass, ('PricDataSource') : PricDataSource, ('GLaccEqt') : GLaccEqt
        , ('GLaccCash') : GLaccCash, ('ANHstatus') : ANHstatus, ('CapitalAllocation') : CapitalAllocation], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('CRM/Edit_Account/Close_button'), 6)

WebUI.click(findTestObject('CRM/Edit_Account/Close_button'))

WebUI.refresh()

WebUI.delay(5)

//Create Deemed Transaction

WebUI.callTestCase(findTestCase('CommonCases/Create Deemed Transaction'), [('RelationName') : RelationName, ('RelationName1') : RelationName1
        , ('EntLegalName') : EntLegalName, ('EntLegalName1') : EntLegalName1, ('TransactionDateCD') : TransactionDateCD, ('TransactionAmountCD') : TransactionAmountCD
        , ('TransactionCurrencyCD') : TransactionCurrencyCD, ('TransactionTypeCD') : TransactionTypeCD], FailureHandling.CONTINUE_ON_FAILURE)

//Create Deemed Template Lender

WebUI.click(findTestObject('Object Repository/Investment/Loan/button_New Template...'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Investment/Loan/buttonSave DeemedTemplate'), 5)

WebUI.setText(findTestObject('Object Repository/Investment/Loan/TemplateName_ DeemedTemplate'), TemplateName1)

WebUI.click(findTestObject('Object Repository/Investment/Loan/TransactionType_DT'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Investment/Loan/TransactionType_DT'), TransactionType, false)

//Create Loan Cusip

WebUI.click(findTestObject('Object Repository/Operations/Loan Cusip/button_New Loan...'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/Loan Cusip/input_Loan Name_form'), 5)

WebUI.setText(findTestObject('Object Repository/Operations/Loan Cusip/input_Loan Name_form'), LoanName)

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/Loan Cusip/input_Cusip_loancusip'), 5)

WebUI.setText(findTestObject('Object Repository/Operations/Loan Cusip/input_Cusip_loancusip'), Cusip)

WebUI.click(findTestObject('Object Repository/Operations/Loan Cusip/InstrumentType'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/Loan Cusip/InstrumentType'), InstrumentType, false)

WebUI.click(findTestObject('Object Repository/Operations/Loan Cusip/Lender Relationship'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/Loan Cusip/Lender Relationship'), RelationName, false)

WebUI.click(findTestObject('Object Repository/Operations/Loan Cusip/Borrower Relationship'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/Loan Cusip/Borrower Relationship'), RelationName1, 
    false)
WebUI.click(findTestObject('Object Repository/Operations/Loan Cusip/Lender Entity'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/Loan Cusip/Lender Entity'), EntLegalName, false)

WebUI.click(findTestObject('Object Repository/Operations/Loan Cusip/Borrower Entity'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/Loan Cusip/Borrower Entity'), EntLegalName1, false)

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/Loan Cusip/button_Create Loan'), 5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Operations/Loan Cusip/button_Create Loan'))

WebUI.delay(5)

//Go Back to Template Name

WebUI.click(findTestObject('Object Repository/Investment/Loan/Relationship Tem1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Relationship_Drop Down'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Investment/Loan/ANH Account Temp1'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/ANH Account DropDown'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/Cash TransactionCode'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Cash TransactionCode DropDown'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/Assets TransactionCode'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Assets TransactionCode DropDown'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/Accrual GL Debit_TempName'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Accrual GL Credit_TempName'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/TemplateName_ DeemedTemplate'))
WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Investment/Loan/buttonSave DeemedTemplate'))

WebUI.delay(5)

//Create Deemed Template Borrower
WebUI.click(findTestObject('Object Repository/Investment/Loan/button_New Template...'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Investment/Loan/buttonSave DeemedTemplate'), 5)

WebUI.setText(findTestObject('Object Repository/Investment/Loan/TemplateName_ DeemedTemplate'), TemplateName2)

WebUI.click(findTestObject('Object Repository/Investment/Loan/TransactionType_DT'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Investment/Loan/TransactionType_DT'), TransactionType, false)

WebUI.setText(findTestObject('Object Repository/Investment/Loan/Loan Cusip Borrower'), Cusip)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Investment/Loan/cusipList'))

WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Investment/Loan/Relationship Tem1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Relationship_Drop Down -Borrower'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Investment/Loan/ANH Account Temp1'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/ANH Account DropDown'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/Cash TransactionCode'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Cash TransactionCode DropDown'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/Assets TransactionCode'))

WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Investment/Loan/Assets TransactionCode -Borrower'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/Accrual GL Debit_TempName'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Accrual GL Credit_TempName'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/TemplateName_ DeemedTemplate'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Investment/Loan/buttonSave DeemedTemplate'))

WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Investment/Loan/span_Please Select'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Investment/Loan/list Please Select'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Investment/Loan/button_Use Template'))

WebUI.delay(5)

//Lender Summary
WebUI.click(findTestObject('Object Repository/Investment/Loan/input_Principal_formatted'))

WebUI.sendKeys(findTestObject('Object Repository/Investment/Loan/input_Principal_formatted -2'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Investment/Loan/input_Principal_formatted -2'), Principal)

WebUI.click(findTestObject('Object Repository/Investment/Loan/ETC- Lender'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/ETC- Lender -DropDown'))

WebUI.setText(findTestObject('Object Repository/Investment/Loan/input_IssueDate'), TransactionDateCD)

WebUI.setText(findTestObject('Object Repository/Investment/Loan/input_MatonDemand'), MatOnDemand)

WebUI.setText(findTestObject('Object Repository/Investment/Loan/input_MaturityDate'), TransactionDateCD)

WebUI.setText(findTestObject('Object Repository/Investment/Loan/input_InterestRateMethod_k-inp'), InterestRateMethod)

WebUI.sendKeys(findTestObject('Object Repository/Investment/Loan/input_InterestRateMethod_k-inp'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Object Repository/Investment/Loan/input_AccrualMethod_k-input ng'), AccrualMethod)

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Object Repository/Investment/Loan/input_AccrualMethod_k-input ng'), Keys.chord(Keys.TAB))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Investment/Loan/input_CurrIntRate_k-formatted'), CurrIntRate)

WebUI.setText(findTestObject('Object Repository/Investment/Loan/input_PaymentFrequency_k-input'), PaymentFrequency)

WebUI.sendKeys(findTestObject('Object Repository/Investment/Loan/input_PaymentFrequency_k-input'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Object Repository/Investment/Loan/input_Day Count_k-input'), DayCount)

WebUI.click(findTestObject('Object Repository/Investment/Loan/button_Generate Transactions'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/Investment/Loan/a_Edit Resulting DT'), 5)

WebUI.takeScreenshot()

WebUI.delay(25)

WebUI.click(findTestObject('Object Repository/Investment/Loan/button_Approve DeemedTransaction'))

WebUI.delay(5)

//Approve Loan Deemed tab

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/a_My Work'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/Deemed tab'))

WebUI.delay(9)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/first Row Deemed'))

WebUI.delay(9)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/button_Approve DeemedTab'))

WebUI.delay(9)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/a_Investment tab'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/a_Private Loans'))

//filter Loan

WebUI.waitForElementClickable(findTestObject('Object Repository/Investment/Loan/Approve/Three dot LoanName'), 5)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/Three dot LoanName'))
	
WebUI.mouseOver(findTestObject('Object Repository/Investment/Loan/Approve/span_Filter'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Investment/Loan/Approve/input Search'), 2)

WebUI.setText(findTestObject('Object Repository/Investment/Loan/Approve/input Search'), LoanName)

String xpath = ('//div[@data-role=\'filtermulticheck\']/form/ul/li/label[text()=\'' + LoanName) + '\']/input'

TestObject to = new TestObject('SelectRelCheckBox')

to.addProperty('xpath', ConditionType.EQUALS,xpath)

WebUI.click(to)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/button_Filter'))

WebUI.verifyTextPresent(LoanName, false)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/expande button PrivateLoan'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/History tab_privateLoan'))

WebUI.delay(2)

WebUI.takeScreenshot()

//Position Analysis

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/a_Analysis_Investment'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/a_Position Analysis'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/span_Relationship_k-icon k-i-a'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Investment/Loan/Approve/input_Relationship_k-input eto'), RelationName)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/input_Account_PositionAnalysis'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/Account DropDown_PositionAnalysis'))

WebUI.setText(findTestObject('Object Repository/Investment/Loan/Approve/input_As Of Date_criteriaBox_p'), TransactionDateCD)

WebUI.sendKeys(findTestObject('Object Repository/Investment/Loan/Approve/input_As Of Date_criteriaBox_p'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/SearchButton_PositionAnalysis'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/Investment/Loan/Approve/a_Close_ReportQueue'), 5)

WebUI.takeScreenshot()

//click on Open Button
//click on expand button and take screenshot Leave Bcoze goes to Queue







