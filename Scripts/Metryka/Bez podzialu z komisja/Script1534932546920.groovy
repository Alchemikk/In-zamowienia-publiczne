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

WebUI.click(findTestObject('Object Repository/Metryka/button_Nowe postpowanie'))

WebUI.setText(findTestObject('Object Repository/Metryka/input_Number'), '556203-N-2018')

WebUI.setText(findTestObject('Object Repository/Metryka/input_Name'), 'Przetarg Testowy')

WebUI.setText(findTestObject('Metryka/textarea_Description'), '556203-N-2018 Bez podziału z komisja')

WebUI.click(findTestObject('Metryka/input_pakiety-nie'))

WebUI.setText(findTestObject('Metryka/input_pakietynie-cena'), '100000')

WebUI.setText(findTestObject('Object Repository/Metryka/input_person0'), 'P')

WebUI.click(findTestObject('Object Repository/Metryka/a_Pastuka Robert'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Metryka/select_Przewodniczcy'), '1', true)

WebUI.click(findTestObject('Metryka/button_komisja-dodaj'))

WebUI.setText(findTestObject('Object Repository/Metryka/input_person1'), 'B')

WebUI.click(findTestObject('Object Repository/Metryka/a_Bana Maria'))

WebUI.selectOptionByValue(findTestObject('Metryka/select_przewodniczacy2'), '2', true)

WebUI.click(findTestObject('Metryka/button_komisja-dodaj2'))

WebUI.setText(findTestObject('Object Repository/Metryka/input_person2'), 'K')

WebUI.click(findTestObject('Object Repository/Metryka/a_Kalinowski Tadeusz'))

WebUI.selectOptionByValue(findTestObject('Metryka/select_Przewodniczacy3'), '3', true)

WebUI.setText(findTestObject('Object Repository/Metryka/input_User2'), 'B')

WebUI.click(findTestObject('Object Repository/Metryka/a_Bana Maria'))

WebUI.setText(findTestObject('Object Repository/Metryka/input_User3'), 'K')

WebUI.click(findTestObject('Object Repository/Metryka/a_Kalinowski Tadeusz'))

WebUI.click(findTestObject('Object Repository/Metryka/span_Zapisz postpowanie'))

WebUI.click(findTestObject('Metryka/h3_556203-N-2018-bez-podzialu'))

