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

//WebUI.openBrowser('')

//WebUI.maximizeWindow()

//Thread.sleep(1000)

GlobalVariable.TestCaseID = TestCaseID
GlobalVariable.ExcelSheetName = ExcelSheetName

WebUI.navigateToUrl(Address)

// WebUI.navigateToUrl(GlobalVariable.SiteURL)
Thread.sleep(1000)

//def url = WebUI.getUrl()
//WebUI.comment(url)
//CustomKeywords.'com.excel.WriteExcel.WriteResulttoExcel'('Paynet', url , TestCaseID, 6)

def heading = WebUI.getWindowTitle()

// def heading = WebUI.getText(findTestObject('Page_iMoney/ver_heading'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment(heading)

CustomKeywords.'com.excel.WriteExcel.WriteResulttoExcel'(GlobalVariable.ExcelSheetName, heading , TestCaseID, 5)

