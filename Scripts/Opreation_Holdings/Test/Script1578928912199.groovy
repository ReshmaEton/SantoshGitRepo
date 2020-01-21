import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
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

WebUI.callTestCase(findTestCase('CommonCases/Login'), [('AppUrl') : AppUrl, ('UserName') : UserName, ('Password') : Password
        , ('SecurityAns') : SecurityAns], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Operations/Upload Holding/Operations module'), 4)

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/Operations module'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Operations/Upload Holding/Holdings tab'), 4)

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/Holdings tab'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/Upload Holding/Relationship_k-input'), RelationName)

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/search button'))

WebUI.delay(5)

WebUI.verifyTextPresent(RelationName, false)

WebUI.takeScreenshot()

//Edit Holdings

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/EditArrow Button'))

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/UnitEdit'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/Upload Holding/input_Units'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/Upload Holding/input_Units'), EditUnits)

WebUI.sendKeys(findTestObject('Object Repository/Operations/Upload Holding/input_Units'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/Operations/Upload Holding/input_EditPrice'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/Upload Holding/input_EditPrice'), EditPrice)

WebUI.sendKeys(findTestObject('Object Repository/Operations/Upload Holding/input_EditPrice'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/EditMarketValue'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/Upload Holding/input_Edit MarketValue'), Keys.chord(Keys.CONTROL,
		'a'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/Upload Holding/input_Edit MarketValue'), EditMarketValue)

WebUI.sendKeys(findTestObject('Object Repository/Operations/Upload Holding/input_Edit MarketValue'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/Operations/Upload Holding/input_Edit TaxCost'), Keys.chord(Keys.CONTROL,
		'a'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/Upload Holding/input_Edit TaxCost'), EditTaxCost)

WebUI.sendKeys(findTestObject('Object Repository/Operations/Upload Holding/input_Edit TaxCost'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/Operations/Upload Holding/input_Edit Accrued incom'), Keys.chord(Keys.CONTROL,
		'a'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/Upload Holding/input_Edit Accrued incom'), EditAccruedIncom)

WebUI.sendKeys(findTestObject('Object Repository/Operations/Upload Holding/input_Edit Accrued incom'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Operations/Upload Holding/UpdateButton'), 2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/UpdateButton'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Operations/Upload Holding/PopUp Comments'), Comments)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/button_Submit Popup'))




