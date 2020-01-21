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

WebUI.click(findTestObject('Object Repository/Investment/SecurityMasterDetails/a_Investment'))

WebUI.click(findTestObject('Object Repository/Investment/SecurityMasterDetails/a_Security Master Detail'))

WebUI.click(findTestObject('Object Repository/Investment/SecurityMasterDetails/button_New Security'))

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Cusip'), SummaryCusip)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Cusip Description_ng-pri'), CusipDescription)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Cusip Type_k-input ng-pr'), CusipType)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Product Type_k-input ng-'), ProductType)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_ManagerFund_k-input ng-p'), ManagerOrFund)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Sub Asset Class_k-input'), SubAsset)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Volatility Detail_k-inpu'), VolatilityDetails)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Liquidity Detail Categor'), DetailCategory)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Industry_k-input ng-pris'), Industry)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Sector_k-input ng-pristi'), Sector)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Geography Sub Category_k'), GeographySubCategory)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Market Cap_k-input ng-pr'), MarketCap)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_ANH Status_k-input ng-pr'), ANHStatus)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Capital Allocation Bucke'), CapitalAlloBucket)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Security Type_k-input ng'), SecurityType)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_GL Category_k-input ng-p'), GLCategory)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Tax-Income Category_k-in'), TaxInconCategory)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Tax Code_k-input ng-pris'), TaxCode)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Tax Code_k-input ng-pris (1)'), Flag)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Cusip Ticker_ng-pristine'), CusipTicker)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Currency_k-input ng-pris'), currency)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Valuation Method_k-input'), ValuationMethod)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Price Mult_k-formatted-v'), PriceMult)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Pricing Freq_k-input ng-'), PricingFreq)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/input_Unitization Type_k-input'), Unitization)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Investment/SecurityMasterDetails/button_Approve'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/Investment/SecurityMasterDetails/span_My Work'))

WebUI.delay(29)

//Approve two times
WebUI.click(findTestObject('Object Repository/Investment/SecurityMasterDetails/Inv-Mywork-firstRow'))

WebUI.delay(29)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Investment/SecurityMasterDetails/button_Approve FinalApproval'))

WebUI.delay(29)

WebUI.click(findTestObject('Object Repository/Investment/SecurityMasterDetails/Inv-Mywork-firstRow'))

WebUI.delay(29)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Investment/SecurityMasterDetails/button_Approve FinalApproval'))

WebUI.delay(29)

WebUI.click(findTestObject('Object Repository/Investment/SecurityMasterDetails/a_Security Master Detail'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Investment/SecurityMasterDetails/div_Cusip_k-multiselect-wrap k'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Investment/SecurityMasterDetails/div_Cusip_k-multiselect-wrap k - Copy'), SummaryCusip)

WebUI.click(findTestObject('Object Repository/Investment/SecurityMasterDetails/CusipList'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Investment/SecurityMasterDetails/button_Max Records Returned_bt'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Investment/SecurityMasterDetails/span_Var Cap _glyphicon glyphi'))

WebUI.delay(29)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Investment/SecurityMasterDetails/button_Exit without Changes'))

WebUI.closeBrowser()

