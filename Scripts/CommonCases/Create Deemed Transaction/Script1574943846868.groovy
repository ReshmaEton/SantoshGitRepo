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

//Create Deemed Transaction under Global Transaction
WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/Create Deemed Transaction/a_Operations tab'), 
    5)

WebUI.click(findTestObject('Object Repository/Operations/Create Deemed Transaction/a_Operations tab'))

WebUI.click(findTestObject('Object Repository/Operations/Create Deemed Transaction/a_Transactions_Operation'))

WebUI.click(findTestObject('Object Repository/Operations/Create Deemed Transaction/a_Global_Operation'))

WebUI.click(findTestObject('Object Repository/Operations/Create Deemed Transaction/a_Create Deemed...'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/Create Deemed Transaction/Payor Relationship CreateDeemed'), 
    5)

WebUI.click(findTestObject('Object Repository/Operations/Create Deemed Transaction/Payor Relationship CreateDeemed'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/Create Deemed Transaction/Payor Relationship CreateDeemed'), 
    RelationName, false)

WebUI.click(findTestObject('Object Repository/Operations/Create Deemed Transaction/select_Payor CreateDeemed'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/Create Deemed Transaction/select_Payor CreateDeemed'), 
    EntLegalName, false)

WebUI.click(findTestObject('Object Repository/Operations/Create Deemed Transaction/Payee Relationship CreateDeemed'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/Create Deemed Transaction/Payee Relationship CreateDeemed'), 
    RelationName1, false)

WebUI.click(findTestObject('Object Repository/Operations/Create Deemed Transaction/select_Payee_CreateDeemed'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/Create Deemed Transaction/select_Payee_CreateDeemed'), 
    EntLegalName1, false)

WebUI.click(findTestObject('Object Repository/Operations/Create Deemed Transaction/Transaction Date CreateDeemed'))

WebUI.setText(findTestObject('Object Repository/Operations/Create Deemed Transaction/Transaction Date CreateDeemed'), TransactionDateCD)

WebUI.click(findTestObject('Object Repository/Operations/Create Deemed Transaction/TransactionType_CreateDeemed'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/Create Deemed Transaction/TransactionType_CreateDeemed'), 
    TransactionTypeCD, false)

WebUI.click(findTestObject('Object Repository/Operations/Create Deemed Transaction/Transaction Amount_CD'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/Create Deemed Transaction/Transaction Amount CD2'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/Create Deemed Transaction/Transaction Amount CD2'), TransactionAmountCD)

WebUI.takeScreenshot()

//WebUI.click(findTestObject('Object Repository/Operations/Create Deemed Transaction/Page_/Currency_CD'))
//WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/Create Deemed Transaction/Page_/Currency_CD'), TransactionCurrencyCD, false)
WebUI.click(findTestObject('Object Repository/Operations/Create Deemed Transaction/button_Start Deemed Workflow'))

WebUI.delay(5)

WebUI.takeScreenshot()

