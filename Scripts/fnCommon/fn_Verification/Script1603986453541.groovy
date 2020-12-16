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
import com.kms.katalon.core.util.KeywordUtil

//KeywordLogger log = new KeywordLogger()
WebUI.delay(1)

//WebUI.verifyElementText(findTestObject('Page_RequestList/verRequestStatus'), Status, FailureHandling.CONTINUE_ON_FAILURE)

//def getStatus = WebUI.getText(findTestObject('Page_RequestList/verRequestStatus'))

//WebUI.verifyEqual(gett, Status1)
//println('boolean val: ' +boolv)

if(sExpectedVal == sActualVal)
{
	
//	log.logPassed("Status Message : Expected and Actual are same :- " + getStatus)
	KeywordUtil.markPassed('Expected: ' + sExpectedVal + ' and Actual are same : ' + sActualVal)
	
	
  }

else

{
	   GlobalVariable.TCStatus = 'FAILED'
	   
	 // log.logFailed('Status Message :- Expected: ' + Status + ' and Actual are not same : ' + getStatus)
	  towrite = 'Status Message :- Expected: ' + sExpectedVal + ' and Actual are not same : ' + sActualVal
	  
	  KeywordUtil.markFailed('Expected: ' + sExpectedVal + ' and Actual are not same : ' + sActualVal)
	  
	'write Result to Excel'
	CustomKeywords.'com.excel.WriteExcel.WriteResulttoExcel'(GlobalVariable.ExcelSheetName, towrite, GlobalVariable.TestCaseID,6)
	
	
	Date today = new Date()
	
	String todaysDate = today.format('ddMMMyyyy')
	String nowTime = today.format('HHmmss')
	
	WebUI.takeScreenshot('D:\\katalon\\Screenshot\\'  + GlobalVariable.TestCaseID + todaysDate + nowTime + '.png' )
	
		
//	  KeywordUtil.markFailed("One or more failed steps present. Check test report for details.")
	  
  }





