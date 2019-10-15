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

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Laravel/regis/a_gotoRegis'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_Laravel/regis/input_regis_nama'), Name)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_Laravel/regis/input_regis_email'), Email)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_Laravel/regis/input_regis_password'), Password)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_Laravel/regis/input_regis_passwordconfirm'), PasswordConfirm)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Laravel/regis/button_regis_submit'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Laravel/dashboard/a_dashboard_navbarDropDown'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Laravel/dashboard/a_Logout'))

WebUI.takeScreenshot()
