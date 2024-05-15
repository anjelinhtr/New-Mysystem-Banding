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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration


TestData login = findTestData('Data Files/Login')
TestData menu = findTestData('Data Files/Menu')

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

for (int baris = 1; baris <= login.getRowNumbers(); baris++) {
	if (login.getValue('Use', baris) == 'Yes') {
	WebUI.setText(findTestObject('Object Repository/Page_Login Mysystem/txtusername'), login.getValue('username', baris))

	WebUI.setText(findTestObject('Object Repository/Page_Login Mysystem/txtpassword'), login.getValue('password', baris))

	WebUI.click(findTestObject('Object Repository/Page_Login Mysystem/btn_Login'))

	WebUI.delay(2)
	}
		}
		WebUI.click(findTestObject('Object Repository/Page_Dashboard New Mysystem - Menu/Select Modul'))
		
		for (int list = 1; list <= menu.getRowNumbers(); list++) {
		WebUI.click(findTestObject('Object Repository/Page_Dashboard New Mysystem - Menu/' + menu.getValue(
			'Menu', list)))
		}
