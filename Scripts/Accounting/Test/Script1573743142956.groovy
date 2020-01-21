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

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/a_Operations'), 6)

WebUI.click(findTestObject('Operations/BulkUpload/a_Operations'))

WebUI.click(findTestObject('Operations/BulkUpload/a_Transactions'))

WebUI.click(findTestObject('Operations/BulkUpload/a_Global'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/BulkUpload/Relationship_global_transactions'), 
    6)

WebUI.setText(findTestObject('Object Repository/Operations/BulkUpload/Relationship_global_transactions'), RelationName)

WebUI.sendKeys(findTestObject('Object Repository/Operations/BulkUpload/Relationship_global_transactions'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/Transaction Amount_globalTansaction'))

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Edit Expense Management/Transaction Amount_globalTansaction_2'), TransactionAmount)

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/searchButton_global_transactions'))

WebUI.verifyTextPresent(RelationName, false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Accounting/Edit Expense Management/EditButton global transaction'))

WebUI.delay(9)

WebUI.takeScreenshot()

