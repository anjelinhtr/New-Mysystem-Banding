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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.Alert as Alert
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


TestData approval = findTestData('Data Files/Nomor Tiket')
def driver = DriverFactory.getWebDriver()


WebUI.click(findTestObject('Object Repository/Approval Inquiry/a_Approval Inquiry'))


for (int baris = 1; baris <= approval.getRowNumbers(); baris++) {
	WebUI.setText(findTestObject('Object Repository/Approval Inquiry/Document_No'), approval.getValue('Nomor Tiket',
				baris))

	WebUI.click(findTestObject('Object Repository/Approval Inquiry/Search_Approval'))
	
	WebUI.click(findTestObject('Object Repository/Approval Inquiry/Action_approval'))
	

	WebUI.click(findTestObject('Object Repository/Approval Inquiry/Status'))

	WebUI.scrollToElement(findTestObject('Object Repository/Approval Inquiry/a_Issues_main_lbsave'),0)
		
	WebUI.click(findTestObject('Object Repository/Approval Inquiry/Status-' + approval.getValue('Status', baris)))
	
	
	WebUI.click(findTestObject('Object Repository/Approval Inquiry/Notes Approval'))
	
	WebUI.setText(findTestObject('Object Repository/Approval Inquiry/Notes Approval'), approval.getValue('Notes',
				baris))

	WebUI.click(findTestObject('Object Repository/Approval Inquiry/a_Issues_main_lbsave'))
	WebUI.delay(3)
	for (int i = 0; i < 10; i++) {
		try {
			def alert = driver.switchTo().alert()
			if (alert != null) {
				// Dapatkan teks dari pesan alert
				def alertText = alert.getText()
				// Cetak teks pesan alert
				println("Alert Text: $alertText")
				// Tahan pesan alert
				alert.dismiss()
				break
			}
		} catch (Exception e) {
			// Jika tidak ada pesan alert, tunggu 1 detik sebelum mencoba lagi
			Thread.sleep(1000)
		}
	}
		((JavascriptExecutor) driver).executeScript("alert('Berhasil simpan data !');")
	
		 if (WebUI.verifyAlertPresent(1, FailureHandling.STOP_ON_FAILURE)) {
				WebUI.dismissAlert()
			} else {
				// Jika alert tidak muncul, lakukan tindakan alternatif di sini
				println("Tidak ada alert yang muncul.")
				// Misalnya, lanjutkan dengan langkah selanjutnya atau lakukan sesuatu yang sesuai dengan kebutuhan Anda
		}
}



//


