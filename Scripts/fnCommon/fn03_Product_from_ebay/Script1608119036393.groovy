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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys



'Search product'
WebUI.setText(findTestObject('Page_eBay/txt_Search_ebay'), 'iphone 11')
WebUI.click(findTestObject('Page_eBay/btn_Search_ebay'))
WebUI.click(findTestObject('Page_eBay/link_product'))

'Get product name'
sGetValue= WebUI.getText(findTestObject('Page_eBay/txt_Productname'))
WebUI.comment('Name of Website :- ebay')
WebUI.comment('Name of the product for ebay :- '  + sGetValue )
println ('Name of Website :- ebay')
println ('Name of the product for ebay :- '  + sGetValue)

'Get price'
sGetPrice = WebUI.getText(findTestObject('Page_eBay/txt_productprice'))
WebUI.comment('Price of the product for ebay :- '  + sGetPrice )
println ('Price of the product for ebay :- '  + sGetPrice )

'Get URL'
sGetLink = WebUI.getUrl()
WebUI.comment('Link for the product for ebay :- '  + sGetLink )
println ('Link for the product for ebay :- '  + sGetLink)

WebUI.closeBrowser()












