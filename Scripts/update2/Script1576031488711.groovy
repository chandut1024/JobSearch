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

WebUI.openBrowser(findTestData('LoginDetailsNJS').getValue(1, 2))

WebUI.closeWindowIndex(1)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.maximizeWindow()

WebUI.click(findTestObject('LoginButton'))

WebUI.click(findTestObject('GoogleButton'))

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('UserName'), findTestData('LoginDetailsNJS').getValue(2, 2))

WebUI.click(findTestObject('NextButton'))

WebUI.delay(5)

WebUI.setText(findTestObject('Password'), findTestData('LoginDetailsNJS').getValue(3, 2))

WebUI.click(findTestObject('NextButton'))

WebUI.switchToWindowIndex(0)

WebUI.delay(10)

WebUI.click(findTestObject('ProfileName'))
//
//WebUI.click(findTestObject('DeleteResumeButton'))
//
//WebUI.click(findTestObject('DeleteResumeConfirm'))
//
WebUI.delay(15)
//
//WebUI.takeScreenshot()

WebUI.uploadFile(findTestObject('UploadResumeButton'), findTestData('LoginDetailsNJS').getValue(5, 2))

WebUI.delay(10)

not_run: WebUI.click(findTestObject('EditResumeHeadline'))

not_run: WebUI.setText(findTestObject('ResumeHeadLineText'), '.')

not_run: WebUI.click(findTestObject('SaveResumeHeadLineButton'))

WebUI.takeScreenshot()

WebUI.refresh()

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.closeBrowser()

