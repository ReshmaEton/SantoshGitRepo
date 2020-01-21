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

//Create Address
WebUI.click(findTestObject('CRM/Create Portfolio/Address/Address Tab'))

WebUI.click(findTestObject('CRM/Create Portfolio/Address/Address plus icon'))

WebUI.setText(findTestObject('CRM/Create Portfolio/Address/Address Name and Description'), Add_Name)

WebUI.setText(findTestObject('CRM/Create Portfolio/Address/Address Line 1'), Address1)

WebUI.setText(findTestObject('CRM/Create Portfolio/Address/Address Line 2'), Address2)

WebUI.setText(findTestObject('CRM/Create Portfolio/Address/Address Line 3'), Address3)

WebUI.setText(findTestObject('CRM/Create Portfolio/Address/City'), City)

WebUI.setText(findTestObject('CRM/Create Portfolio/Address/Address Phone Lnadline'), StateProvince)

WebUI.setText(findTestObject('CRM/Create Portfolio/Address/Zip Postal code'), ZipCode)

WebUI.setText(findTestObject('CRM/Create Portfolio/Address/Zip 4'), Zip4)

WebUI.setText(findTestObject('CRM/Create Portfolio/Address/Address Phone Lnadline'), AddressPhone)

WebUI.setText(findTestObject('CRM/Create Portfolio/Address/Address Fax landine'), AddressFax)

//WebUI.waitForElementClickable(findTestObject('CRM/Create Portfolio/Address/Addres_Status'), 5)
WebUI.selectOptionByLabel(findTestObject('CRM/Create Portfolio/Address/Addres_Status'), AddStatus, false)

//WebUI.waitForElementClickable(findTestObject('CRM/Create Portfolio/Address/Addres_Asset'), 5)
WebUI.selectOptionByLabel(findTestObject('CRM/Create Portfolio/Address/Addres_Asset'), AddAsset, false)

WebUI.setText(findTestObject('CRM/Create Portfolio/Address/Address Description'), AddDesc)

WebUI.setText(findTestObject('CRM/Create Portfolio/Address/Address Note'), AddNote)

WebUI.waitForElementClickable(findTestObject('CRM/Create Portfolio/Address/Addres_Submit'), 3)

WebUI.click(findTestObject('CRM/Create Portfolio/Address/Addres_Submit'))

WebUI.takeScreenshot()

WebUI.waitForElementPresent(findTestObject('CRM/Create Portfolio/Address/Addres_FinalApproval'), 3)

WebUI.waitForElementClickable(findTestObject('CRM/Create Portfolio/Address/Addres_FinalApproval'), 3)

WebUI.click(findTestObject('CRM/Create Portfolio/Address/Addres_FinalApproval'))

