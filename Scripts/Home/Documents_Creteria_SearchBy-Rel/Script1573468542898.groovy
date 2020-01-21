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

WebUI.waitForElementClickable(findTestObject('Object Repository/Home/Documents_Creteria/a_Documents'), 8)

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/a_Documents'))

//Search By Relationship Name
WebUI.waitForElementClickable(findTestObject('Object Repository/Home/Documents_Creteria/input_Relationship_k-input'), 5)

WebUI.setText(findTestObject('Object Repository/Home/Documents_Creteria/input_Relationship_k-input'), RelationName)

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/button_Search_DocumentsCreteria'))

WebUI.delay(5)

WebUI.verifyTextPresent(RelationName, false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/Searched Relationship'))

WebUI.delay(9)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/button_Close'))

//Search By Content Category and Content Type
WebUI.refresh()

WebUI.waitForElementClickable(findTestObject('Object Repository/Home/Documents_Creteria/input_Content Category_k-input'), 
    5)

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/input_Content Category_k-input'))

WebUI.setText(findTestObject('Object Repository/Home/Documents_Creteria/input_Content Category_k-input'), ContentCategory)

WebUI.sendKeys(findTestObject('Object Repository/Home/Documents_Creteria/input_Content Category_k-input'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Object Repository/Home/Documents_Creteria/input_Content Category_k-input'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/input_Content Type_k-input k-r'))

WebUI.setText(findTestObject('Object Repository/Home/Documents_Creteria/input_Content Type_k-input k-r'), ContentType)

WebUI.sendKeys(findTestObject('Object Repository/Home/Documents_Creteria/input_Content Type_k-input k-r'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/button_Search_DocumentsCreteria'))

WebUI.delay(9)

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/Relationship_column_setting'))

WebUI.mouseOver(findTestObject('Object Repository/Home/Documents_Creteria/Filter'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Home/Documents_Creteria/Filter_SerachBox'), 6)

WebUI.setText(findTestObject('Object Repository/Home/Documents_Creteria/Filter_SerachBox'), RelationName)

String xpath = ('//div[@data-role=\'filtermulticheck\']/form/ul/li/label[text()=\'' + RelationName) + '\']/input'

TestObject to = new TestObject('SelectRelCheckBox')

to.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.click(to)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/Button_Filter'))

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/Searched Relationship'))

WebUI.delay(9)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/button_Close'))

//Search By Upload Date From and Upload Date Throgh
WebUI.refresh()

WebUI.waitForElementClickable(findTestObject('Object Repository/Home/Documents_Creteria/input_Upload Date From_criteri'), 
    9)

WebUI.setText(findTestObject('Object Repository/Home/Documents_Creteria/input_Upload Date From_criteri'), UploadDateFrom)

WebUI.setText(findTestObject('Object Repository/Home/Documents_Creteria/input_Upload Date Through_crit'), UploadDateThrogh)

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/button_Search_DocumentsCreteria'))

WebUI.delay(9)

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/Relationship_column_setting'))

WebUI.mouseOver(findTestObject('Object Repository/Home/Documents_Creteria/Filter'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Home/Documents_Creteria/Filter_SerachBox'), 6)

WebUI.setText(findTestObject('Object Repository/Home/Documents_Creteria/Filter_SerachBox'), RelationName)

String xpath1 = ('//div[@data-role=\'filtermulticheck\']/form/ul/li/label[text()=\'' + RelationName) + '\']/input'

TestObject to1 = new TestObject('SelectRelCheckBox')

to1.addProperty('xpath', ConditionType.EQUALS, xpath1)

WebUI.click(to1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/Button_Filter'))

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/Searched Relationship'))

WebUI.delay(9)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/button_Close'))

