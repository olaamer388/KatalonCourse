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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('OrangeHRM/Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OrangeHRM/PIM/Page_OrangeHRM/Update/Page_OrangeHRM/a_PIM'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList')

WebUI.click(findTestObject('Object Repository/OrangeHRM/PIM/Page_OrangeHRM/Update/Page_OrangeHRM/button_Search'))

WebUI.delay(30)

WebUI.click(findTestObject('Object Repository/OrangeHRM/PIM/Page_OrangeHRM/Update/Page_OrangeHRM/button_Asfaw_oxd-icon-button oxd-table-cell_fae9fe'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/168')

WebUI.setText(findTestObject('Object Repository/OrangeHRM/PIM/Page_OrangeHRM/Update/Page_OrangeHRM/input_Nickname_oxd-input oxd-input--focus'), 
    '123456')

WebUI.delay(30)

WebUI.closeBrowser()

