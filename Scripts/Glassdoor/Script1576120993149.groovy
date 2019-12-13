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

WebUI.openBrowser('www.glassdoor.com')

WebUI.maximizeWindow()

WebUI.click(findTestObject('GlassdoorPage/GoogleLoginButton'))

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('UserName'), findTestData('LoginDetailsNJS').getValue(2, 1))

WebUI.click(findTestObject('NextButton'))

WebUI.delay(5)

WebUI.setText(findTestObject('Password'), findTestData('LoginDetailsNJS').getValue(3, 1))

WebUI.click(findTestObject('NextButton'))

WebUI.switchToWindowIndex(0)

WebUI.delay(10)

WebUI.click(findTestObject('GlassdoorPage/InterviewsButton'))

WebUI.setText(findTestObject('GlassdoorPage/JobTitle'), 'API Testing')

WebUI.setText(findTestObject('GlassdoorPage/Location'), ' ')

WebUI.click(findTestObject('GlassdoorPage/SearchButton'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('GlassdoorPage/SortByDate'))

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('GlassdoorPage/SalariesButton'))

WebUI.setText(findTestObject('GlassdoorPage/CompanyName'), 'EPAM Systems')

WebUI.setText(findTestObject('GlassdoorPage/CompanyLocation'), 'Hyderabad(India)')

WebUI.click(findTestObject('GlassdoorPage/CompanySearch'))

