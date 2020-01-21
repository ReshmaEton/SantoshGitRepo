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

WebUI.callTestCase(findTestCase('Reusuable Test Cases/Login-Eton'), [('BrowserURL') : BrowserURL, ('Username') : Username
        , ('Password') : Password, ('SecurityQuestionaire') : SecurityQuestionaire], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Global/Investment'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Investments/Investment_Security Master Detail'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Investments/Investment-Security Master Detail/CreateNewSecurity'))

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Summary/Summary_Cusip'), 
    SummaryCusip)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Summary/Summary_CusipDescription'), 
    SummaryCusipDescription)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Summary/Summary_Cusip_Type'), 
    SummaryCusipType)

WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Summary/Summary_Product_Type'), 
    SummaryProductType)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Summary/Summary_Manager_Fund'), 
    SummaryManagerFund, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

//Investment Data
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Investment Data/Inv Data_Sub Asset Class'), 
    InvestmentDataSubAssetClass, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Investment Data/Inv Data_Volatility Detail'), 
    InvestmentDataVolatilityDetail, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Investment Data/Inv Data_Liquidity Detail Category'), 
    InvestmentDataLiquidityDetailCategory, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Investment Data/Inv Data_Industry'), 
    InvestmentDataIndustry, FailureHandling.CONTINUE_ON_FAILURE)


WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Investment Data/Inv Data_Sector'), 
    InvestmentDataSector, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Investment Data/Inv Data_Geography Sub Category'), 
    InvestmentDataGeographySubCategory, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Investment Data/Inv Data_Market Cap'), 
    InvestmentDataMarketCap, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Investment Data/Inv Data_ANH Status'), 
    InvestmentDataANHStatus, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Investment Data/Inv Data_Capital Allocation Bucket'), 
    InvestmentDataCapitalAllocationBucket, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeScreenshot()

//Accounting and Tax Data 
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Accounting and Tax Data/Acc and Tax-Security Type'), 
    AccountingandTaxDataSecurityType, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Accounting and Tax Data/Acc and Tax-GL Catagory'), 
    AccountingandTaxDataGLCategory, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Accounting and Tax Data/Acc and Tax-Tax-Income Category'), 
    AccoutingandTaxDataTaxIncomeCategory, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Accounting and Tax Data/Acc and Tax-Tax Code'), 
    AccountingandTaxDataTaxCode, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Accounting and Tax Data/Acc and Tax-13F Flag'), 
    AccountingandTaxData13FFlag, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeScreenshot()

//Operations Data
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Operations Data/Operations-Cusip Ticker'), 
    OperationsDataCusipTicker, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Operations Data/Operations-Currency'), 
    OperationsDataCurrency, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Operations Data/Operations-Valuation Method'), 
    OperationsDataValuationMethod, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Operations Data/Operations-Price Mult'), 
    OperationsDataPriceMult, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Operations Data/Operations-Pricing Freq'), 
    OperationsDataPricingFreq, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Operations Data/Operations-Unitization Type'), 
    OperationsDataUnitiationType, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.sendKeys(findTestObject('Investments/Investment-Security Master Detail/Create New Security/Operations Data/Operations-Dividend per Unit'), '1.0000')
//WebUI.sendKeys(findTestObject('Investments/Investment-Security Master Detail/Create New Security/Operations Data/Operations-Dividend Payment Frequency'), 'N/A')
//WebUI.sendKeys(findTestObject('Investments/Investment-Security Master Detail/Create New Security/Operations Data/Operations-Payment Cycle (MM-DD)'), '04-01;04-01;01-04;04-01;04-04;04-04;04-04;04-04;04-04;04-04;04-04;04-04;')
WebUI.takeScreenshot()

//Interest Bearing Instrument Data
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing-Instrument Type'), 
    IntBearingInstrumentType, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing-Int Rate Meth'), 
    IntBearingIntRateMeth, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing- Accrual Meth'), 
    IntBearingAccrualMeth, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing-DayCount Meth'), 
    IntBearingDayCountMeth, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing-Mat On Demand'), 
    IntBearingMatOnDemand, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing-Maturity Date'), 
    IntBearingMaturityDate, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing- Issue Date'), 
    IntBearingIssueDate, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing- First Pay Date'), 
    IntBearingFirstPayDate, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing-Curr Int Rate'), 
    IntBearingCurrIntRate, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing-Curr PIK Pct'), 
    IntBearingCurrPIKPct, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing-Payment Freq'), 
    IntBearingPaymentFreq, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing-Irregular Payment Cycle MM DD'), 
    IntBearingIrregularPaymentCycleMMDD, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing-CompoundFreq'), 
    IntBearingCompoundFreq, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing-Princ Amort Term'), 
    IntBearingPrincAmortTerm, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing-Busn Day Meth'), 
    IntBearingBusnDayMeth, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing-Delay Days'), 
    IntBearingDelayDays, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing-Ex Days'), 
    IntBearingExDays, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing-Grace Days'), 
    IntBearingGraceDays, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/Interest Bearing Instrument Data/Int Bearing-Comments'), 
    IntBearingComments, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeScreenshot()

//Fund Data
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Fund Type'), 
    FundDataFundType, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Structure'), 
    FundDataStructure, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Entity Name'), 
    FundDataEntityName, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Fund Sponsor'), 
    FundDataFundSponser, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Benchmark'), 
    FundDataBenchmark, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Performance Flag'), 
    FundDataPerformanceFlag, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-UN Signatory'), 
    FundDataUNSignatory, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-ILPA Signatory'), 
    FundDataILPASignatory, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Master Fund'), 
    FundDataMasterFund, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Comm Meth'), 
    FundDataCommMeth, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Capcall Meth'), 
    FundDataCapcallMeth, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Comm Date'), 
    FundDataCommDate, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Target Open Date'), 
    FundDataTargetOpenDate, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.doubleClick(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Init Offer Price'))
WebUI.sendKeys(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Init Offer Price'), 
    FundDataInitOfferPrice, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.doubleClick(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Min Sub'))
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Min Sub'), 
    FundDataMinSub, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.doubleClick(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Target Cap Raise'))
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Target Cap Raise'), 
    FundDataTargetCapRaise, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.doubleClick(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Lockup Mnths'))
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Lockup Mnths'), 
    FundDataLockupMnth, FailureHandling.CONTINUE_ON_FAILUREs)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Lockup Type'), 
    FundDataLockupType, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.doubleClick(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Liquidity Window'))
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Liquidity Window'), 
    FundDataLiquidityWindow, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.doubleClick(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-GP Cap Inv'))
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-GP Cap Inv'), 
    FundDataGPCapInv, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.doubleClick(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-GP Borne Exp Max'))
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-GP Borne Exp Max'), 
    FundDataGPBorneExpMax, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.doubleClick(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Special Terms'))
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Special Terms'), 
    FundDataTargetExitDate, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Target Exit Date'), 
    FundDataTargetExitDate, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.doubleClick(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Target IRR'))
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Target IRR'), 
    FundDataRevTargetIRR, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.doubleClick(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Target Multiple'))
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Target Multiple'), 
    FundDataRevTargetMult, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.doubleClick(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Target Exp Ratio'))
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Target Exp Ratio'), 
    FundDataTargetExpRatio, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.doubleClick(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Holding Period'))
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Holding Period'), 
    FundDataHoldingPeriod, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-PPM Date'), 
    FundDataPPMDate, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Rev Exit Date'), 
    FundDataRevExitDate, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.doubleClick(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Rev Target IRR'))
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Rev Target IRR'), 
    FundDataRevTargetIRR, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.doubleClick(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Rev Target Mult'))
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Rev Target Mult'), 
    FundDataRevTargetMult, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.doubleClick(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Rev Target Exp Ratio'))
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Rev Target Exp Ratio'), 
    FundDataRevTargetExpRatio, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.sendKeys(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Rev Holding Per'),'')
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Last Rev Date'), 
    FundDataLastRevDate, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Mgmt Fee Code'), 
    FundDataMgmtFeeCode, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Perf Fee Code'), 
    FundDataPerfFeeCode, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-SalesLoad Fee Code'), 
    FundDataSalesLoadFeeCode, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Red Fee Code'), 
    FundDataRedFeeCode, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Adm Fee Code'), 
    FundDataAdmFeeCode, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Cust Fee Code'), 
    FundDataCustFeeCode, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Econ Alloc Code'), 
    FundDataEconAllocCode, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Tax Alloc Code'), 
    FundDataTaxAllocCode, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.doubleClick(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Units Prec'))
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Units Prec'), 
    FundDataUnitsPrec, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.doubleClick(findTestObject('Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Perc Prec'))
WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Perc Prec'), 
    FundDataPercPrec, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Round Meth'), 
    FundDataRoundMeth, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Create New Security/FundData Objects/FundData-Ret Alloc Meth'), 
    FundDataRetAllocMeth, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Investments/Investment-Security Master Detail/Approve_Security Master'))

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Investments/Investment_Mywork'))

WebUI.delay(5)

System.out.println(WebUI.getText(findTestObject('Object Repository/Investments/Investment-MyWorks/InvestmentWork_SecurityMaster_Description')))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Investments/Investment-MyWorks/InvestmentWork_SecurityMaster_Description'))

WebUI.delay(3)

WebUI.takeScreenshot()

System.out.println(WebUI.getText(findTestObject('Object Repository/Investments/Investment-MyWorks/InvestmentWork_SecurityMaster_Summary Desc')))

WebUI.click(findTestObject('Object Repository/Investments/Investment-MyWorks/InvestmentWork_SecurityMaster_Approve'))

WebUI.takeScreenshot()

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Global/SystemAccount-Logout'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Global/Button_Logout'))

WebUI.closeBrowser()
