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

//Search By existing Relationship and Account name

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/BulkUpload/Relationship_global_transactions'), 6)

WebUI.setText(findTestObject('Object Repository/Operations/BulkUpload/Relationship_global_transactions'), RelationName)

WebUI.sendKeys(findTestObject('Object Repository/Operations/BulkUpload/Relationship_global_transactions'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/AccountTextBox_global_transactions'))

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/listOfAccount_global_transactions'))

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/searchButton_global_transactions'))

WebUI.verifyTextPresent(RelationName, false)

WebUI.takeScreenshot()

//Search Criteria By using Id

WebUI.refresh()

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/SearchCriteria/Id'), 6)

WebUI.click(findTestObject('Object Repository/Operations/SearchCriteria/Id'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/SearchCriteria/Id2'), RelationshipId)

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/searchButton_global_transactions'))

WebUI.verifyTextPresent(RelationName, false)

WebUI.takeScreenshot()

//Search By using Transaction Amount

WebUI.refresh()

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/SearchCriteria/Transaction Amount_input'), 6)

WebUI.click(findTestObject('Object Repository/Operations/SearchCriteria/Transaction Amount_input'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/SearchCriteria/Transaction Amount_input_2'), TransactionAmount)

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/searchButton_global_transactions'))

WebUI.delay(9)

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/Relationship_column_setting'))

WebUI.mouseOver(findTestObject('Object Repository/Home/Documents_Creteria/Filter'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Home/Documents_Creteria/Filter_SerachBox'), 6)

WebUI.setText(findTestObject('Object Repository/Home/Documents_Creteria/Filter_SerachBox'), RelationName)

String xpath4 = ('//div[@data-role=\'filtermulticheck\']/form/ul/li/label[text()=\'' + RelationName) + '\']/input'

TestObject to4 = new TestObject('SelectRelCheckBox4')

to4.addProperty('xpath', ConditionType.EQUALS, xpath4)

WebUI.click(to4)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/Button_Filter'))

WebUI.verifyTextPresent(RelationName, false)

WebUI.takeScreenshot()

//By using Transaction Date

WebUI.refresh()

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/SearchCriteria/Transaction Start Date'), 6)

WebUI.sendKeys(findTestObject('Object Repository/Operations/SearchCriteria/Transaction Start Date'), TransactionDate)

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/searchButton_global_transactions'))

WebUI.delay(9)

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/Relationship_column_setting'))

WebUI.mouseOver(findTestObject('Object Repository/Home/Documents_Creteria/Filter'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Home/Documents_Creteria/Filter_SerachBox'), 6)

WebUI.setText(findTestObject('Object Repository/Home/Documents_Creteria/Filter_SerachBox'), RelationName)

String xpath5 = ('//div[@data-role=\'filtermulticheck\']/form/ul/li/label[text()=\'' + RelationName) + '\']/input'

TestObject to5 = new TestObject('SelectRelCheckBox')

to5.addProperty('xpath', ConditionType.EQUALS, xpath5)

WebUI.click(to5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/Button_Filter'))

WebUI.verifyTextPresent(RelationName, false)

WebUI.takeScreenshot()

