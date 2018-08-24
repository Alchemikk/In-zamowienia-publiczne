import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Metryka/button_Nowe postpowanie'))

WebUI.setText(findTestObject('Object Repository/Metryka/input_Number'), '556202-N-2018')

WebUI.setText(findTestObject('Object Repository/Metryka/input_Name'), 'Przetarg Testowy')

WebUI.setText(findTestObject('Object Repository/Metryka/textarea_Description'), '556202-N-2018\r\nZ podziałem bez komisji')

WebUI.setText(findTestObject('Object Repository/Metryka/input_description0'), 'Białystok')

WebUI.waitForElementPresent(findTestObject('Metryka/input_pakiet1'), 10)

WebUI.setText(findTestObject('Metryka/input_pakiet1'), '100000')

WebUI.click(findTestObject('Metryka/button_Dodaj'))

WebUI.setText(findTestObject('Object Repository/Metryka/input_description1'), 'Kleosin')

WebUI.setText(findTestObject('Metryka/input_pakiet2'), '50000')

WebUI.click(findTestObject('Metryka/button_Dodaj2'))

WebUI.setText(findTestObject('Object Repository/Metryka/input_description2'), 'Grajewo')

WebUI.setText(findTestObject('Metryka/input_pakiet3'), '30000')

WebUI.click(findTestObject('Metryka/input_komisja-nie'))

WebUI.click(findTestObject('Object Repository/Metryka/span_Zapisz postpowanie'))

WebUI.click(findTestObject('Object Repository/Metryka/h3_556201-N-2018 - Przetarg Te'))

WebUI.closeBrowser()

