import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as gv
import org.openqa.selenium.Keys as Keys

// enter registration page
WebUI.openBrowser('')

WebUI.navigateToUrl(gv.base_url)

WebUI.maximizeWindow()

// call data generator
WebUI.callTestCase(findTestCase('Script/Generate Register Data'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/navigationBar/navbar_login'))

WebUI.click(findTestObject('Object Repository/registerLoginPage/btn_registerContinue'))

// fill form according to set data
WebUI.sendKeys(findTestObject('Object Repository/registerLoginPage/registerForm/input_firstName'), gv.reg_firstname)

WebUI.sendKeys(findTestObject('Object Repository/registerLoginPage/registerForm/input_lastName'), gv.reg_lastname)

WebUI.sendKeys(findTestObject('Object Repository/registerLoginPage/registerForm/input_email'), gv.reg_email)

WebUI.sendKeys(findTestObject('Object Repository/registerLoginPage/registerForm/input_telephone'), gv.reg_phone)

WebUI.sendKeys(findTestObject('Object Repository/registerLoginPage/registerForm/input_firstName'), gv.reg_firstname)

WebUI.sendKeys(findTestObject('Object Repository/registerLoginPage/registerForm/input_company'), gv.reg_company)

WebUI.sendKeys(findTestObject('Object Repository/registerLoginPage/registerForm/input_address1'), gv.reg_address1)

WebUI.sendKeys(findTestObject('Object Repository/registerLoginPage/registerForm/input_city'), gv.reg_city)

WebUI.sendKeys(findTestObject('Object Repository/registerLoginPage/registerForm/input_zip'), gv.reg_zip)

WebUI.selectOptionByLabel(findTestObject('Object Repository/registerLoginPage/registerForm/select_country'), gv.reg_country, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/registerLoginPage/registerForm/select_state'), gv.reg_state, false)

WebUI.sendKeys(findTestObject('Object Repository/registerLoginPage/registerForm/input_loginName'), gv.reg_loginname)

WebUI.sendKeys(findTestObject('Object Repository/registerLoginPage/registerForm/input_password'), gv.reg_password)

WebUI.sendKeys(findTestObject('Object Repository/registerLoginPage/registerForm/input_passwordConfirm'), gv.reg_password)

WebUI.click(findTestObject('Object Repository/registerLoginPage/registerForm/check_privacy'))

WebUI.click(findTestObject('Object Repository/registerLoginPage/registerForm/btn_continue'))

// Assert the registration success page
assert WebUI.verifyElementVisible(findTestObject('Object Repository/registerLoginPage/registerForm/text_registerSuccess')) == true

WebUI.verifyElementText(findTestObject('Object Repository/registerLoginPage/registerForm/text_registerSuccess'), 'Your Account Has Been Created!')



