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

'Navigate to Amazon'
WebUI.callTestCase(findTestCase('fnCommon/fn01_OpenBrowser_Navigate'), [('SiteURL') : GlobalVariable.SiteURL1], FailureHandling.STOP_ON_FAILURE)

'Amazon product'
WebUI.callTestCase(findTestCase('fnCommon/fn02_Product_from_Amazon'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigate to ebay'
WebUI.callTestCase(findTestCase('fnCommon/fn01_OpenBrowser_Navigate'), [('SiteURL') : GlobalVariable.SiteURL2], FailureHandling.STOP_ON_FAILURE)

'ebay product'
WebUI.callTestCase(findTestCase('fnCommon/fn03_Product_from_ebay'), [:], FailureHandling.STOP_ON_FAILURE)

'Compare Price'
WebUI.callTestCase(findTestCase('fnCommon/fn04_ComparePrice'), [:], FailureHandling.STOP_ON_FAILURE)

