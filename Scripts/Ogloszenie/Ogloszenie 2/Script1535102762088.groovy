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

WebUI.click(findTestObject('Object Repository/Ogloszenie/a_Ogoszenia'))

WebUI.click(findTestObject('Object Repository/Ogloszenie/button_Przygotuj ogoszenie'))

WebUI.click(findTestObject('Object Repository/Ogloszenie/input_orderNoticePlacementType'))

WebUI.click(findTestObject('Object Repository/Ogloszenie/input_orderNoticeGoalRadioSect'))

WebUI.click(findTestObject('Object Repository/Ogloszenie/input_agreementSection_coFinan'))

WebUI.setText(findTestObject('Object Repository/Ogloszenie/input_ProjectName'), 'Projekt numer 1')

WebUI.click(findTestObject('Object Repository/Ogloszenie/input_agreementSection_onlyFor'))

WebUI.setText(findTestObject('Object Repository/Ogloszenie/input_SpecialGroupPercent'), '40')

WebUI.click(findTestObject('Ogloszenie/span_Zapisz-prolog'))

WebUI.waitForElementNotVisible(findTestObject('Ogloszenie/span_Przejd dalej-prolog'), 1)

WebUI.click(findTestObject('Ogloszenie/span_Przejd dalej-prolog'))

WebUI.click(findTestObject('Object Repository/Ogloszenie/input_FullAccessToDocumentsOfP'))

WebUI.setText(findTestObject('Object Repository/Ogloszenie/input_FullAccessToDocumentsOfP_1'), 'www.gddkia.gov.pl')

WebUI.click(findTestObject('Object Repository/Ogloszenie/input_SpecificationURLEnabled'))

WebUI.setText(findTestObject('Object Repository/Ogloszenie/input_SpecificationURL'), 'www.gddkia.gov.pl')

WebUI.click(findTestObject('Ogloszenie/span_Zapisz-s1'))

WebUI.waitForElementPresent(findTestObject('Ogloszenie/span_Przejd dalej-s1'), 10)

WebUI.click(findTestObject('Ogloszenie/span_Przejd dalej-s1'))

WebUI.setText(findTestObject('Object Repository/Ogloszenie/input_OrderShortDescription'), 'Opis zamówienia')

WebUI.setText(findTestObject('Object Repository/Ogloszenie/input_MainCPV'), '12345678-1')

WebUI.click(findTestObject('Ogloszenie/input_AdditionalCPVCodesExists-tak'))

WebUI.setText(findTestObject('Ogloszenie/input_II.5)dodatkowekody-bezpodzialu'), '12345678-2')

WebUI.click(findTestObject('Object Repository/Ogloszenie/button_Dodaj kolejny kod'))

WebUI.setText(findTestObject('Ogloszenie/input_II.5)dodatkowekody-bezpodzialu2'), '12345678-3')

WebUI.setText(findTestObject('Object Repository/Ogloszenie/input_OrderValueNet'), '300000')

WebUI.click(findTestObject('Object Repository/Ogloszenie/input_agreementSection_additio'))

WebUI.setText(findTestObject('Object Repository/Ogloszenie/input_PeriodOfRealizationOrder'), '12')

WebUI.click(findTestObject('Ogloszenie/span_Zapisz-s2'))

WebUI.waitForElementNotPresent(findTestObject('Ogloszenie/span_Przejd dalej-s2'), 1)

WebUI.click(findTestObject('Ogloszenie/span_Przejd dalej-s2'))

WebUI.click(findTestObject('Object Repository/Ogloszenie/input_agreementSection_purchas'))

WebUI.click(findTestObject('Object Repository/Ogloszenie/input_ExcludedByArt24Ust5pkt1P'))

WebUI.click(findTestObject('Object Repository/Ogloszenie/input_excludedByArt24Ust5pkt4P'))

WebUI.click(findTestObject('Object Repository/Ogloszenie/input_excludedByArt24Ust5pkt5P'))

WebUI.setText(findTestObject('Object Repository/Ogloszenie/textarea_DocumentListOfArt25Us'), 'Oswiadczenie III.4)')

WebUI.setText(findTestObject('Object Repository/Ogloszenie/textarea_DocumentListOfFulfilC'), 'Oświadczenie III.5)')

WebUI.setText(findTestObject('Object Repository/Ogloszenie/textarea_DocumentListOfArt25Us_1'), 'Oświadczenie III.6)')

WebUI.setText(findTestObject('Object Repository/Ogloszenie/textarea_OtherDocumentList'), 'Oświadczenie III.7)')

WebUI.click(findTestObject('Ogloszenie/span_Zapisz-s3'))

WebUI.click(findTestObject('Ogloszenie/span_Przejd dalej-s3'))

WebUI.click(findTestObject('Ogloszenie/input_agreementSection_tenderG-IV.2)-nie'))

WebUI.click(findTestObject('Ogloszenie/input_agreementSection_advance-IV.1.3)-nie'))

WebUI.waitForElementPresent(findTestObject('Ogloszenie/input_IV.1.4)agreementSection_offersI-nie'), 4)

WebUI.click(findTestObject('Ogloszenie/input_IV.1.4)agreementSection_offersI-nie'))

WebUI.click(findTestObject('Ogloszenie/input_IV.1.4)agreementSection_offersI2-nie'))

WebUI.click(findTestObject('Ogloszenie/input_IV.1.5)agreementSection_variant-nie'))

WebUI.click(findTestObject('Ogloszenie/input_IV.1.5)agreementSection_variant2-nie'))

WebUI.click(findTestObject('Ogloszenie/input_IV.1.5)agreementSection_variant3-nie'))

WebUI.click(findTestObject('Ogloszenie/input_IV.1.8)agreementSection_isElect-nie'))

WebUI.click(findTestObject('Ogloszenie/span_Zapisz-s4'))

WebUI.waitForElementNotPresent(findTestObject('Ogloszenie/span_Przejd dalej-s4'), 1)

WebUI.click(findTestObject('Ogloszenie/span_Przejd dalej-s4'))

WebUI.setText(findTestObject('Object Repository/Ogloszenie/input_normal ng-pristine ng-un_2'), 'CENA')

WebUI.click(findTestObject('Object Repository/Ogloszenie/td'))

WebUI.setText(findTestObject('Object Repository/Ogloszenie/input_normal ng-pristine ng-un_3'), '60')

WebUI.click(findTestObject('Object Repository/Ogloszenie/button_Dodaj kolejny'))

WebUI.setText(findTestObject('Object Repository/Ogloszenie/input_normal ng-pristine ng-un_4'), 'GWARANCJA')

WebUI.setText(findTestObject('Object Repository/Ogloszenie/input_normal ng-pristine ng-un_5'), '40')

WebUI.click(findTestObject('Object Repository/Ogloszenie/input_agreementSection_changes'))

WebUI.setText(findTestObject('Object Repository/Ogloszenie/textarea_DescriptionOfAgreemen'), 'Zakres zmian')

WebUI.setText(findTestObject('Ogloszenie/input_DeadlineForSubmissionOffday'), '31-08-2019')

WebUI.setText(findTestObject('Object Repository/Ogloszenie/input_DeadlineForSubmissionOff'), '11:11')

WebUI.setText(findTestObject('Object Repository/Ogloszenie/input_QuantityOfDaysToDeadline'), '40')

WebUI.click(findTestObject('Object Repository/Ogloszenie/input_agreementSection_annulme'))

WebUI.click(findTestObject('Object Repository/Ogloszenie/input_agreementSection_annulme_1'))

WebUI.click(findTestObject('Ogloszenie/span_Zapisz-s42'))

WebUI.waitForElementNotPresent(findTestObject('Ogloszenie/span_Zakocz tworzenie ogoszeni'), 1)

WebUI.click(findTestObject('Ogloszenie/span_Zakocz tworzenie ogoszeni'))

WebUI.click(findTestObject('Ogloszenie/button_potwierdzenie-Tak'))

WebUI.click(findTestObject('Ogloszenie/li_Numer 556203-N-2018-weryfikacja'))

