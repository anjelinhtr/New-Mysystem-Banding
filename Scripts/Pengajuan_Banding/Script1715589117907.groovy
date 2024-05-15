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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



TestData pengajuan = findTestData('Data Files/Pengajuan')
WebUI.click(findTestObject('Object Repository/Page_Banding/a_Pengajuan'))

WebUI.click(findTestObject('Object Repository/Page_Banding/Pengajuan Banding_add'))

for (int baris = 1; baris <= pengajuan.getRowNumbers(); baris++) {
	if (pengajuan.getValue('Use', baris) == 'Yes') {
		WebUI.click(findTestObject('Object Repository/Page_Banding/input__noapp'))
        WebUI.setText(findTestObject('Object Repository/Page_Banding/input__noapp'), pengajuan.getValue('appno', 
                baris))
		WebUI.click(findTestObject('Object Repository/Page_Banding/input__purpose'))
		WebUI.delay(5)

        WebUI.setText(findTestObject('Object Repository/Page_Banding/input__purpose'), pengajuan.getValue('Purpose', 
                baris))
			
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input__colateral'), pengajuan.getValue('Colateral',
			baris))
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input__capacity'), pengajuan.getValue('Capacity',
			baris))
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input__character'), pengajuan.getValue('Character',
			baris))
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input__capital'), pengajuan.getValue('Capital',
			baris))
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input__condition'), pengajuan.getValue('Condition',
			baris))
		
		//Data Banding
		// Produk
		def produk = WebUI.getAttribute(findTestObject('Object Repository/Page_Banding/input_Produk_sebelum'), 'value')
		
		println(produk)
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input_Produk_sesudah'), produk ? produk : '0')
		
		//Supplier
		
		def supplier = WebUI.getAttribute(findTestObject('Object Repository/Page_Banding/input_Supplier_sebelum'), 'value')
		
		println(supplier)
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input_Supplier_sesudah'), supplier ? supplier : '0')
		
		
		//Unit Pengajuan
		def unit_pengajuan = WebUI.getAttribute(findTestObject('Object Repository/Page_Banding/input_Unit Pengajuan_sebelum'), 'value')
		
		println(unit_pengajuan)
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input_Unit Pengajuan_sesudah'), unit_pengajuan ? unit_pengajuan : '0')
		
			
		//Tahun
		def tahun = WebUI.getAttribute(findTestObject('Object Repository/Page_Banding/input_Tahun_sebelum'), 'value')
		
		println(tahun)
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input_Tahun_sesudah'), tahun ? tahun :'0')
		
		
		//OTR
		def OTR = WebUI.getAttribute(findTestObject('Object Repository/Page_Banding/input_OTR_sebelum'), 'value')
		
		println(OTR)
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input_OTR_sesudah'), OTR ? OTR : '0')
		
		
		//MRP (UC & MyCash)
		def MRP = WebUI.getAttribute(findTestObject('Object Repository/Page_Banding/input_MRP_sebelum'), 'value')
		
		println(MRP)
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input_MRP_sesudah'), MRP ? MRP : '0')
		
		
		//MV (UC & MyCash)
		def MV = WebUI.getAttribute(findTestObject('Object Repository/Page_Banding/input_MV_sebelum'), 'value')
		
		println(MV)
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input_MV_sesudah'), MV ? MV : '0')
		
		//Down Payment(%)
		
		def DownPayment = WebUI.getAttribute(findTestObject('Object Repository/Page_Banding/input_Down Payment_sebelum'), 'value')
		
		println(DownPayment)
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input_Down Payment_sesudah'), DownPayment ? DownPayment : '0')
		
		//Suplier Rate(%)
		def suplierrate = WebUI.getAttribute(findTestObject('Object Repository/Page_Banding/input_Suplier Rate_sebelum'), 'value')
		
		println(suplierrate)
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input_Suplier Rate_sesudah'), suplierrate ? suplierrate : '0')
		
		
		//TDP
		def TDP = WebUI.getAttribute(findTestObject('Object Repository/Page_Banding/input_TDP_sebelum'), 'value')
		
		println(TDP)
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input_TDP_sesudah'), TDP ? TDP : '0')
		
		
		//NTF
		def NTF = WebUI.getAttribute(findTestObject('Object Repository/Page_Banding/input_NTF_sebelum'), 'value')
		
		println(NTF)
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input_NTF_sesudah'), NTF ? NTF : '0')
		
		
		//NTF Kapitalisasi
		def NTFKapitalisasi  = WebUI.getAttribute(findTestObject('Object Repository/Page_Banding/input_NTF Kapitalisasi_sebelum'), 'value')
		
		println(NTFKapitalisasi)
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input_NTF Kapitalisasi_sesudah'), NTFKapitalisasi ? NTFKapitalisasi : '0')
		
		
		//Tenor
		def Tenor = WebUI.getAttribute(findTestObject('Object Repository/Page_Banding/input_Tenor_sebelum'), 'value')
		
		println(Tenor)
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input_Tenor_sesudah'), Tenor ? Tenor : '0')
		
		
		//Angsuran
		
		def Angsuran = WebUI.getAttribute(findTestObject('Object Repository/Page_Banding/input_Angsuran_sebelum'), 'value')
		
		println(Angsuran)
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input_Angsuran_sesudah'), Angsuran ? Angsuran : '0')
		
		
		//Penghasilan Cadeb
		def PenghasilanCadeb = WebUI.getAttribute(findTestObject('Object Repository/Page_Banding/input_Penghasilan Cadeb_sebelum'), 'value')
		
		println(PenghasilanCadeb)
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input_Penghasilan Cadeb_sesudah'), PenghasilanCadeb ? PenghasilanCadeb : '0')
		
		
		//DSR(%)
		def DSR = WebUI.getAttribute(findTestObject('Object Repository/Page_Banding/input_DSR_sebelum'), 'value')
		
		println(DSR)
		
		WebUI.setText(findTestObject('Object Repository/Page_Banding/input_DSR_sesudah'), DSR ? DSR : '0')
		
		
		//Rekomendasi Komite Risk
		WebUI.setText(findTestObject('Object Repository/Page_Banding/Rekomendasi Komite Risk_sesudah'), pengajuan.getValue('Rekomendasi Komite Risk',
			baris))
		
		//Strength
		WebUI.setText(findTestObject('Object Repository/Page_Banding/Strength_sesudah'), pengajuan.getValue('Strength',
			baris))
		
		//Weakness
		WebUI.setText(findTestObject('Object Repository/Page_Banding/Weakness_sesudah'), pengajuan.getValue('Weakness',
			baris))
			
		//Opportunity
		WebUI.setText(findTestObject('Object Repository/Page_Banding/Opportunity_sesudah'), pengajuan.getValue('Opportunity',
			baris))
			
		//Thread
		WebUI.setText(findTestObject('Object Repository/Page_Banding/THREAT_sesudah'), pengajuan.getValue('Thread',
			baris))


		WebUI.click(findTestObject('Object Repository/Page_Banding/btn_Cek_Approval'))
		
		WebUI.delay(60)
		
//		WebUI.waitForPageLoad(45)
	
		
		// Scroll to the SPV element to make sure it is visible
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Banding/Btn_Save'), 0)
		
		//WebUI.waitForPageLoad(30)
				
		WebUI.click(findTestObject('Object Repository/Page_Banding/SPV'))
		
		WebUI.click(findTestObject('Object Repository/Page_Banding/SPV_' + pengajuan.getValue('SPV', baris)))
		
		
		}
		
}

WebUI.click(findTestObject('Object Repository/Page_Banding/Btn_Save'))


