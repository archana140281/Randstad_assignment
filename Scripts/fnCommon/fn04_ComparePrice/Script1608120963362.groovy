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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.kms.katalon.core.util.KeywordUtil


String[] priceAmazon = GlobalVariable.Price_amazon.split('\\$')
String[] priceebay = GlobalVariable.Price_ebay.split('\\$')

WebUI.comment('Price of product at Amazon  :-' + priceAmazon[1])

//println priceAmazon[0]
println priceAmazon[1]

WebUI.comment('Price of product at ebay :-' +  priceebay[1])
//println priceebay[0]
println priceebay[1]


float priceeAmazonNew  = Float.parseFloat(priceAmazon[1])
float priceebayNew  = Float.parseFloat(priceebay[1])


if(priceeAmazonNew < priceebayNew)
{
	
	KeywordUtil.markPassed('Amazon has lesser price value for product than Ebay')
	KeywordUtil.markPassed('1. Amazon price value for product :- ' + GlobalVariable.Price_amazon)
	KeywordUtil.markPassed('2. ebay price value for product :- ' + GlobalVariable.Price_ebay)
	
	
  }

else

{
	KeywordUtil.markPassed('ebay has lesser price value for product than Amazon')
	KeywordUtil.markPassed('1. ebay price value for product :- ' + GlobalVariable.Price_ebay)
	KeywordUtil.markPassed('2. Amazon price value for product :- ' + GlobalVariable.Price_amazon)
	
}
	


