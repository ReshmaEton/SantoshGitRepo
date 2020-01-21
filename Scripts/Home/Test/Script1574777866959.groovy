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

WebUI.waitForElementClickable(findTestObject('Object Repository/Home/Documents_Creteria/a_Documents'), 6)

WebUI.click(findTestObject('Object Repository/Home/Documents_Creteria/a_Documents'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Home/Documents_Upload/a_Upload...'), 5)

WebUI.click(findTestObject('Object Repository/Home/Documents_Upload/a_Upload...'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Home/Documents_Upload/input_Relationship Type_k-inpu'), 
    5)

WebUI.sendKeys(findTestObject('Object Repository/Home/Documents_Upload/input_Relationship Type_k-inpu'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Object Repository/Home/Documents_Upload/input_Relationship Type_k-inpu'), RelationType)

WebUI.sendKeys(findTestObject('Object Repository/Home/Documents_Upload/input_Relationship Type_k-inpu'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/Home/Documents_Upload/input_Relationship_DocumentUpload'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Object Repository/Home/Documents_Upload/input_Relationship_DocumentUpload'), RelationName)

WebUI.sendKeys(findTestObject('Object Repository/Home/Documents_Upload/input_Relationship_DocumentUpload'), Keys.chord(Keys.TAB))

WebUI.uploadFile(findTestObject('Object Repository/Home/Documents_Upload/Choose File'), UploadFileLocation)

WebUI.waitForElementClickable(findTestObject('Object Repository/Home/Documents_Upload/button_Add To Queue'), 5)

WebUI.click(findTestObject('Object Repository/Home/Documents_Upload/button_Add To Queue'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Home/Documents_Upload/a_Start Upload'), 5)

WebUI.click(findTestObject('Object Repository/Home/Documents_Upload/a_Start Upload'))

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/Home/Documents_Upload/button_Close'), 5)

WebUI.click(findTestObject('Object Repository/Home/Documents_Upload/button_Close'))

//Approve in my work

WebUI.waitForElementClickable(findTestObject('Object Repository/Home/Documents_Upload/a_My Work_Home'), 5)

WebUI.click(findTestObject('Object Repository/Home/Documents_Upload/a_My Work_Home'))

WebUI.delay(9)

WebUI.click(findTestObject('Object Repository/Home/Documents_Upload/3DotButton Relationship'))

WebUI.mouseOver(findTestObject('Object Repository/Home/Documents_Upload/span_Filter Relationship'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Object Repository/Home/Documents_Upload/input SearchTextBox'),RelationName)

String xpath = ('//div[@data-role=\'filtermulticheck\']/form/ul/li/label[text()=\'' + RelationName) + '\']/input'

TestObject to = new TestObject('SelectRelCheckBox')

to.addProperty('xpath',ConditionType.EQUALS, xpath)

WebUI.click(to)

WebUI.click(findTestObject('Object Repository/Home/Documents_Upload/button_Filter'))

WebUI.takeScreenshot()

if (WebUI.getText(findTestObject('Object Repository/Home/Documents_Upload/Filtered Relationship MyWork')).equalsIgnoreCase(
	RelationName)) {
	WebUI.mouseOver(findTestObject('Object Repository/Home/Documents_Upload/Filtered Relationship MyWork'))

	WebUI.click(findTestObject('Object Repository/Home/Documents_Upload/Filtered Relationship MyWork'))
}

WebUI.delay(9)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/Home/Documents_Upload/button_Approve DocumentUpload'),5)

WebUI.sendKeys(findTestObject('Object Repository/Home/Documents_Upload/input_Route to Workflow_k-inpu'),RouteToWorkFlow)

WebUI.sendKeys(findTestObject('Object Repository/Home/Documents_Upload/input_Route to Workflow_k-inpu'),Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/Home/Documents_Upload/button_Approve DocumentUpload'))

WebUI.delay(9)


