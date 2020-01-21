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

WebUI.openBrowser(AppUrl)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('CRM/Login_logout/Page_Login/input_Username_form-control ng'), UserName)

WebUI.setText(findTestObject('CRM/Login_logout/Page_Login/input_Password_form-control ng'), Password)

WebUI.click(findTestObject('CRM/Login_logout/Page_Login/button_Submit'))

WebUI.delay(1)

WebUI.setText(findTestObject('CRM/Login_logout/Page_Login/input_Security Answer_answer'), SecurityAns)

WebUI.click(findTestObject('CRM/Login_logout/Page_Login/button_Submit_Security'))





