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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('CommonCases/Login'), [('AppUrl') : AppUrl, ('UserName') : UserName, ('Password') : Password
        , ('SecurityAns') : SecurityAns], FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.callTestCase(findTestCase('CommonCases/Create Deemed Transaction'), [('RelationName') : RelationName, ('RelationName1') : RelationName1
//        , ('EntLegalName') : EntLegalName, ('EntLegalName1') : EntLegalName1, ('TransactionDateCD') : TransactionDateCD, ('TransactionAmountCD') : TransactionAmountCD
//        , ('TransactionCurrencyCD') : TransactionCurrencyCD, ('TransactionTypeCD') : TransactionTypeCD], FailureHandling.CONTINUE_ON_FAILURE)
//
//
//WebUI.click(findTestObject('Object Repository/Investment/Loan/span_Please Select'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Object Repository/Investment/Loan/list Please Select'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('Object Repository/Investment/Loan/button_Use Template'))
//
//WebUI.delay(5)
//
//
//WebUI.click(findTestObject('Object Repository/Investment/Loan/input_Principal_formatted'))
//
//WebUI.sendKeys(findTestObject('Object Repository/Investment/Loan/input_Principal_formatted -2'), Keys.chord(Keys.CONTROL, 'a'))
//
//WebUI.sendKeys(findTestObject('Object Repository/Investment/Loan/input_Principal_formatted -2'), Principal)
//
//WebUI.click(findTestObject('Object Repository/Investment/Loan/ETC- Lender'))
//
//WebUI.click(findTestObject('Object Repository/Investment/Loan/ETC- Lender -DropDown'))
//
//WebUI.setText(findTestObject('Object Repository/Investment/Loan/input_IssueDate'), TransactionDateCD)
//
//WebUI.delay(8)
//
//WebUI.setText(findTestObject('Object Repository/Investment/Loan/input_MatonDemand'), MatOnDemand)
//
//WebUI.setText(findTestObject('Object Repository/Investment/Loan/input_MaturityDate'), TransactionDateCD)
//
//WebUI.setText(findTestObject('Object Repository/Investment/Loan/input_InterestRateMethod_k-inp'), InterestRateMethod)
//
//WebUI.sendKeys(findTestObject('Object Repository/Investment/Loan/input_InterestRateMethod_k-inp'), Keys.chord(Keys.TAB))
//
//WebUI.setText(findTestObject('Object Repository/Investment/Loan/input_AccrualMethod_k-input ng'), AccrualMethod)
//
//WebUI.sendKeys(findTestObject('Object Repository/Investment/Loan/input_AccrualMethod_k-input ng'), Keys.chord(Keys.TAB))
//
////WebUI.sendKeys(findTestObject('Object Repository/Investment/Loan/input_CurrIntRate_k-formatted'), Keys.chord(Keys.CONTROL, 'a' ))
//
//WebUI.setText(findTestObject('Object Repository/Investment/Loan/input_CurrIntRate_k-formatted'), CurrIntRate)//no working
//
//WebUI.setText(findTestObject('Object Repository/Investment/Loan/input_PaymentFrequency_k-input'), PaymentFrequency)
//
//WebUI.sendKeys(findTestObject('Object Repository/Investment/Loan/input_PaymentFrequency_k-input'), Keys.chord(Keys.TAB))
//
//WebUI.setText(findTestObject('Object Repository/Investment/Loan/input_Day Count_k-input'), DayCount)

//WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/a_Investment tab'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/a_Analysis_Investment'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/a_Position Analysis'))

WebUI.delay(12)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/input_Relationship_PositionAnalysis'))

WebUI.setText(findTestObject('Object Repository/Investment/Loan/Approve/input_Relationship_PositionAnalysis'), RelationName)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/input_Account_PositionAnalysis'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/input_Account_PositionAnalysis'))

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/Account DropDown_PositionAnalysis'))

WebUI.setText(findTestObject('Object Repository/Investment/Loan/Approve/input_As Of Date_criteriaBox_p'), TransactionDateCD)

WebUI.sendKeys(findTestObject('Object Repository/Investment/Loan/Approve/input_As Of Date_criteriaBox_p'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/Investment/Loan/Approve/SearchButton_PositionAnalysis'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/Investment/Loan/Approve/a_Close_ReportQueue'), 5)

WebUI.takeScreenshot()



