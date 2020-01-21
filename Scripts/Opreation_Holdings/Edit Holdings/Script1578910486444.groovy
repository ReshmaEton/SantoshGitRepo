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

//Upload holdins
WebUI.waitForElementClickable(findTestObject('CRM/Edit_Account/Close_button'), 6)

WebUI.click(findTestObject('CRM/Edit_Account/Close_button'))

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('Object Repository/Operations/Upload Holding/Operations module'), 4)

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/Operations module'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Operations/Upload Holding/Holdings tab'), 4)

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/Holdings tab'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Operations/Upload Holding/Upload Manual Holdings'), 4)

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/Upload Manual Holdings'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Operations/Upload Holding/choose file button'), 4)

WebUI.uploadFile(findTestObject('Object Repository/Operations/Upload Holding/choose file button'), FileUploading)

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/Start Upload'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Operations/Upload Holding/button_Close'), 4)

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/button_Close'))

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

//Approve from Holdings tab

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/My Work Operation tab'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/Holdings tab (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/Rel ColumnSetting Holdings tab'))

WebUI.mouseOver(findTestObject('Object Repository/Operations/Upload Holding/span_Filter Holdings tab'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/Upload Holding/input filter Holdings'), 6)

WebUI.setText(findTestObject('Object Repository/Operations/Upload Holding/input filter Holdings'), RelationName)

String xpath = ('//div[@data-role=\'filtermulticheck\']/form/ul/li/label[text()=\'' + RelationName) + '\']/input'

TestObject to = new TestObject('SelectRelCheckBox')

to.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.click(to)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/button_Filter holdings tab'))

WebUI.verifyTextPresent(RelationName, false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/BlueTik Holdings tab'))

WebUI.delay(8)

WebUI.refresh()


//verify Uploaded Holdings in Account

WebUI.waitForElementClickable(findTestObject('CRM/Relationship/Relationships_LHS'), 5)

WebUI.click(findTestObject('CRM/Relationship/Relationships_LHS'))

WebUI.click(findTestObject('CRM/Relationship/Relationship_Mgmt_LHS'))

WebUI.waitForElementClickable(findTestObject('CRM/Edit_Account/Account tab'), 6)

WebUI.click(findTestObject('CRM/Edit_Account/Account tab'))

WebUI.waitForElementClickable(findTestObject('CRM/Edit_Account/Column_setting'), 6)

WebUI.click(findTestObject('CRM/Edit_Account/Column_setting'))

WebUI.mouseOver(findTestObject('CRM/Edit_Account/span_Filter'))

WebUI.waitForElementClickable(findTestObject('CRM/Edit_Account/input_search'), 6)

WebUI.setText(findTestObject('CRM/Edit_Account/input_search'), AccNum)

String xpath1 = ('//div[@data-role=\'filtermulticheck\']/form/ul/li/label[text()=\'' + AccNum) + '\']/input'

TestObject to1 = new TestObject('SelectRelCheckBox')

to1.addProperty('xpath', ConditionType.EQUALS, xpath1)

WebUI.click(to1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CRM/Edit_Account/button_Filter search'))

WebUI.verifyTextPresent(AccNum, false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CRM/Edit_Account/selected account number'))

WebUI.delay(9)

WebUI.click(findTestObject('Object Repository/Operations/Upload Holding/As Of Date'))

WebUI.clearText(findTestObject('Object Repository/Operations/Upload Holding/As Of Date'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/Upload Holding/As Of Date'), AsOfDate)

WebUI.sendKeys(findTestObject('Object Repository/Operations/Upload Holding/As Of Date'), Keys.chord(Keys.TAB))

WebUI.delay(5)

WebUI.verifyTextPresent(CurrencyDescription, false)

WebUI.takeScreenshot()

WebUI.closeBrowser()
