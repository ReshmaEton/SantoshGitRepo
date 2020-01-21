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

WebUI.click(findTestObject('CRM/Relationship/Relationships_LHS'))

WebUI.click(findTestObject('CRM/Relationship/Relationship_Mgmt_LHS'))

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('CRM/Relationship/Porfolio_Tab'), 3)

WebUI.waitForElementClickable(findTestObject('CRM/Relationship/Porfolio_Tab'), 3)

WebUI.click(findTestObject('CRM/Relationship/button_Create Relationship...'))

WebUI.setText(findTestObject('CRM/Relationship/Text_Relationship Name_form-c'), RelationName)

WebUI.setText(findTestObject('CRM/Relationship/Text_Relationship_descript'), RelationDesc)

WebUI.selectOptionByLabel(findTestObject('CRM/Relationship/select_(Please Select)RelStatus'), RelationStatus, false)

WebUI.setText(findTestObject('CRM/Relationship/Text_Source of wealth'), SourceOfWealth)

WebUI.selectOptionByLabel(findTestObject('CRM/Relationship/select_(Please Select)ClientEm_RelType'), RelationType, false)

WebUI.setText(findTestObject('CRM/Relationship/Text_Notes'), Notes)

WebUI.takeScreenshot()

WebUI.click(findTestObject('CRM/Relationship/button_SubmitRelationship'))

WebUI.delay(9)

WebUI.click(findTestObject('CRM/Relationship/button_Final ApprovalRelationship'))

WebUI.delay(5)

WebUI.takeScreenshot()

