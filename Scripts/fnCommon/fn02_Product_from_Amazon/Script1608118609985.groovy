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
WebUI.setText(findTestObject('Page_Amazon/txt_Searchbox'), 'iphone 11')
WebUI.click(findTestObject('Page_Amazon/btn_Searchicon'))
WebUI.click(findTestObject('Page_Amazon/span_Apple iPhone11'))

'Get product name'
sGetValue = WebUI.getText(findTestObject('Page_Amazon/txt_ProductTitle'))

WebUI.comment('Name of Website :- Amazon')
WebUI.comment('Name of the product for Amazon :- '  + sGetValue )

println ('Name of Website :- Amazon')
println ('Name of the product for Amazon :- '  + sGetValue)

'Get price'
sGetPrice = WebUI.getText(findTestObject('Page_Amazon/txt_Price'))
WebUI.comment('Price of the product for Amazon :- '  + sGetPrice )
println ('Price of the product for Amazon :- '  + sGetPrice )

'Get URL'
sGetLink = WebUI.getUrl()
WebUI.comment('Link for the product for Amazon :- '  + sGetLink )
println ('Link for the product for Amazon :- '  + sGetLink)

WebUI.closeBrowser()