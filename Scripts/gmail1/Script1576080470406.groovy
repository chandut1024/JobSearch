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

WebUI.openBrowser('www.gmail.com')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('UserName'), findTestData('LoginDetailsNJS').getValue(2, 1))

WebUI.click(findTestObject('NextButton'))

WebUI.delay(5)

WebUI.setText(findTestObject('Password'), findTestData('LoginDetailsNJS').getValue(3, 1))

WebUI.click(findTestObject('NextButton'))

WebUI.delay(10)

WebUI.click(findTestObject('Gmail_Page/ComposeEmailButton'))

WebUI.click(findTestObject('Gmail_Page/MaximizeWindow'))

WebUI.setText(findTestObject('Gmail_Page/ToList'), findTestData('LoginDetailsNJS').getValue(6, 1))

WebUI.setText(findTestObject('Gmail_Page/Subject'), findTestData('LoginDetailsNJS').getValue(7, 1))

WebUI.setText(findTestObject('Gmail_Page/Body'), findTestData('LoginDetailsNJS').getValue(8, 1))

not_run: WebUI.uploadFile(findTestObject('Gmail_Page/AttachFileGmail'), 'D:\\chanduR\\Resume11.docx')

not_run: WebUI.click(findTestObject('Gmail_Page/SendEmailButton'))

