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

WebUI.click(findTestObject('Ogloszenie/h3_556203-N-2018 - Przetarg Te'))

WebUI.click(findTestObject('Object Repository/Ogloszenie/a_Ogoszenia'))

WebUI.click(findTestObject('Ogloszenie/button_Zmie'))

WebUI.click(findTestObject('Ogloszenie/span_Wcz edycj'))

WebUI.verifyElementChecked(findTestObject('Object Repository/Ogloszenie/input_orderNoticePlacementType'), 10)

WebUI.verifyElementChecked(findTestObject('Object Repository/Ogloszenie/input_orderNoticeGoalRadioSect'), 10)

WebUI.verifyElementChecked(findTestObject('Object Repository/Ogloszenie/input_agreementSection_coFinan'), 10)

actualValue = WebUI.getAttribute(findTestObject('Object Repository/Ogloszenie/input_ProjectName'), 'value')

WebUI.verifyMatch(actualValue, 'Projekt numer 1', true)

WebUI.verifyElementChecked(findTestObject('Object Repository/Ogloszenie/input_agreementSection_onlyFor'), 10)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/input_SpecialGroupPercent'), 'value')

WebUI.verifyMatch(actualValue, '40', true)

WebUI.click(findTestObject('Ogloszenie/span_Zapisz-prolog'))

WebUI.waitForElementNotVisible(findTestObject('Ogloszenie/span_Przejd dalej-prolog'), 1)

WebUI.click(findTestObject('Ogloszenie/span_Przejd dalej-prolog'))

WebUI.delay(2)

WebUI.click(findTestObject('Ogloszenie/span_Wcz edycj'))

WebUI.verifyElementNotChecked(findTestObject('Ogloszenie/input_ProcessingByCentralOrder'), 10)

WebUI.verifyElementNotChecked(findTestObject('Ogloszenie/input_ProcessingByAgent'), 10)

WebUI.verifyElementNotChecked(findTestObject('Ogloszenie/input_CommonProcessing'), 10)

WebUI.verifyElementNotChecked(findTestObject('Ogloszenie/input_ProcessingWithOtherEUCou'), 10)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/input_AdditionalInformationAbo'), 'value')

WebUI.verifyMatch(actualValue, '', true)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/nazwa firmy/input_CompanyName'), 'value')

WebUI.verifyMatch(actualValue, 'Firma Publiczna', true)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/nazwa firmy/input_IdentityNumber'), 'value')

WebUI.verifyMatch(actualValue, '8226222305', true)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/nazwa firmy/input_Address'), 'value')

WebUI.verifyMatch(actualValue, 'Kolejowa', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/nazwa firmy/input_City'), 'value')

WebUI.verifyMatch(actualValue, 'Miasteczko nad Wisłą', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/nazwa firmy/input_PostalCode'), 'value')

WebUI.verifyMatch(actualValue, '01-800', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/nazwa firmy/input_Country'), 'value')

WebUI.verifyMatch(actualValue, 'Polska', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/nazwa firmy/input_Voivodeship'), 'value')

WebUI.verifyMatch(actualValue, 'Kujawsko-Pomorskie', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/nazwa firmy/input_PhoneNumber'), 'value')

WebUI.verifyMatch(actualValue, '+48 000 000 000', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/nazwa firmy/input_Fax'), 'value')

WebUI.verifyMatch(actualValue, '+48 000 000 001', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/nazwa firmy/input_Email'), 'value')

WebUI.verifyMatch(actualValue, 'emailtestowejfirmy@testowafirma.pl', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/nazwa firmy/input_WebsiteUrl'), 'value')

WebUI.verifyMatch(actualValue, 'www.testowafirma.pl', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/nazwa firmy/input_AddressOfPurchaserProfil'), 'value')

WebUI.verifyMatch(actualValue, 'www.testowafirma.pl', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/nazwa firmy/input_ToolsWebsiteAddress'), 'value')

WebUI.verifyMatch(actualValue, 'www.testowafirma.pl', false)

WebUI.verifyElementChecked(findTestObject('Ogloszenie/input_orderingPartyKindRadioSe11'), 1)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/input_SeparationOfDuties'), 'value')

WebUI.verifyMatch(actualValue, '', false)

WebUI.verifyElementChecked(findTestObject('Object Repository/Ogloszenie/input_FullAccessToDocumentsOfP'), 1)

actualValue = WebUI.getAttribute(findTestObject('Object Repository/Ogloszenie/input_FullAccessToDocumentsOfP_1'), 'value')

WebUI.verifyMatch(actualValue, 'www.gddkia.gov.pl', false)

WebUI.verifyElementChecked(findTestObject('Object Repository/Ogloszenie/input_SpecificationURLEnabled'), 1)

actualValue = WebUI.getAttribute(findTestObject('Object Repository/Ogloszenie/input_SpecificationURL'), 'value')

WebUI.verifyMatch(actualValue, 'www.gddkia.gov.pl', false)

WebUI.verifyElementNotChecked(findTestObject('Ogloszenie/input_DocumentsOfRestrictedAcc'), 1)

WebUI.verifyElementNotChecked(findTestObject('Ogloszenie/input_EmailAddressToReceiveOff'), 1)

WebUI.verifyElementNotChecked(findTestObject('Ogloszenie/input_DescriptionOfAllowedMeth'), 1)

WebUI.verifyElementNotChecked(findTestObject('Ogloszenie/input_DescriptionOfRequiredMet'), 1)

WebUI.verifyElementNotChecked(findTestObject('Ogloszenie/input_FullAccessToolsURLEnable'), 1)

WebUI.click(findTestObject('Ogloszenie/span_Zapisz-s1'))

WebUI.waitForElementNotVisible(findTestObject('Ogloszenie/span_Przejd dalej-s1'), 1)

WebUI.click(findTestObject('Ogloszenie/span_Przejd dalej-s1'))

WebUI.delay(2)

WebUI.click(findTestObject('Ogloszenie/span_Wcz edycj'))

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/sekcja 2 z 4/input_OrderName'), 'value')

WebUI.verifyMatch(actualValue, 'Przetarg Testowy', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/sekcja 2 z 4/input_ReferenceNumber'), 'value')

WebUI.verifyMatch(actualValue, '556203-N-2018', false)

WebUI.verifyElementNotChecked(findTestObject('Ogloszenie/sekcja 2 z 4/input_TechnicalDialogueHasBeen'), 1)

WebUI.verifyElementChecked(findTestObject('Ogloszenie/sekcja 2 z 4/input_agreementSection_orderHa'), 1)

WebUI.scrollToElement(findTestObject('Ogloszenie/label_II.4) Krtki opis przedmi'), 10)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/textarea_OrderShortDescription'), 'value')

WebUI.verifyMatch(actualValue, 'Opis zamówienia', false)

actualValue = WebUI.getAttribute(findTestObject('Object Repository/Ogloszenie/input_MainCPV'), 'value')

WebUI.verifyMatch(actualValue, '12345678-1', false)

WebUI.verifyElementChecked(findTestObject('Ogloszenie/input_AdditionalCPVCodesExists-tak'), 1)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/sekcja 2 z 4/input_normal ng-pristine ng-va-II.5)-sprawdzenie1'), 
    'value')

WebUI.verifyMatch(actualValue, '12345678-2', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/sekcja 2 z 4/input_normal ng-pristine ng-va-II.5)-sprawdzenie2'), 
    'value')

WebUI.verifyMatch(actualValue, '12345678-3', false)

WebUI.delay(2)

actualValue = WebUI.getAttribute(findTestObject('Object Repository/Ogloszenie/input_OrderValueNet'), 'value')

WebUI.verifyMatch(actualValue, '300000', false)

WebUI.click(findTestObject('Ogloszenie/sekcja 2 z 4/input_agreementSection_additio-II.7)-nie'))

actualValue = WebUI.getAttribute(findTestObject('Object Repository/Ogloszenie/input_PeriodOfRealizationOrder'), 'value')

WebUI.verifyMatch(actualValue, '12', false)

actualValue = WebUiBuiltInKeywords.getAttribute(findTestObject('Ogloszenie/sekcja 2 z 4/input_PeriodOfRealizationOrder-days'), 
    'value')

WebUiBuiltInKeywords.verifyMatch(actualValue, '', false)

actualValue = WebUiBuiltInKeywords.getAttribute(findTestObject('Ogloszenie/sekcja 2 z 4/input_OrderBeginDate'), 'value')

WebUiBuiltInKeywords.verifyMatch(actualValue, '', false)

actualValue = WebUiBuiltInKeywords.getAttribute(findTestObject('Ogloszenie/sekcja 2 z 4/input_OrderEndDate'), 'value')

WebUiBuiltInKeywords.verifyMatch(actualValue, '', false)

actualValue = WebUiBuiltInKeywords.getAttribute(findTestObject('Ogloszenie/sekcja 2 z 4/input_AdditionalInformationAbo'), 
    'value')

WebUiBuiltInKeywords.verifyMatch(actualValue, '', false)

WebUI.click(findTestObject('Ogloszenie/span_Zapisz-s2'))

WebUI.waitForElementNotPresent(findTestObject('Ogloszenie/span_Przejd dalej-s2'), 1)

WebUI.click(findTestObject('Ogloszenie/span_Przejd dalej-s2'))

WebUI.delay(2)

WebUI.click(findTestObject('Ogloszenie/span_Wcz edycj'))

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/sekcja 3 z 4/textarea_ConditionsOfParticipa'), 'value')

WebUI.verifyMatch(actualValue, '', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/sekcja 3 z 4/input_AdditionalInformationAbo'), 'value')

WebUI.verifyMatch(actualValue, '', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/sekcja 3 z 4/textarea_ConditionsOfEconomyAn'), 'value')

WebUI.verifyMatch(actualValue, '', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/sekcja 3 z 4/input_AdditionalInformationAbo (1)'), 'value')

WebUI.verifyMatch(actualValue, '', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/sekcja 3 z 4/textarea_ConditionsOfTechnical'), 'value')

WebUI.verifyMatch(actualValue, '', false)

WebUI.verifyElementChecked(findTestObject('Ogloszenie/sekcja 3 z 4/input_agreementSection_purchas-III.1.3)'), 1)

WebUI.verifyElementChecked(findTestObject('Ogloszenie/sekcja 3 z 4/input_agreementSection_purchas-III.2.2)'), 1)

WebUI.verifyElementChecked(findTestObject('Object Repository/Ogloszenie/input_ExcludedByArt24Ust5pkt1P'), 1)

WebUI.verifyElementNotChecked(findTestObject('Ogloszenie/sekcja 3 z 4/input_excludedByArt24Ust5pkt2P'), 1)

WebUI.verifyElementNotChecked(findTestObject('Ogloszenie/sekcja 3 z 4/input_excludedByArt24Ust5pkt3P'), 1)

WebUI.verifyElementChecked(findTestObject('Object Repository/Ogloszenie/input_excludedByArt24Ust5pkt4P'), 1)

WebUI.verifyElementChecked(findTestObject('Object Repository/Ogloszenie/input_excludedByArt24Ust5pkt5P'), 1)

WebUI.verifyElementNotChecked(findTestObject('Ogloszenie/sekcja 3 z 4/input_excludedByArt24Ust5pkt6P'), 1)

WebUI.verifyElementNotChecked(findTestObject('Ogloszenie/sekcja 3 z 4/input_excludedByArt24Ust5pkt7P'), 1)

WebUI.verifyElementNotChecked(findTestObject('Ogloszenie/sekcja 3 z 4/input_excludedByArt24Ust5pkt8P'), 1)

WebUI.verifyElementNotChecked(findTestObject('Ogloszenie/sekcja 3 z 4/input_proofOfNonExclusion'), 1)

WebUI.verifyElementNotChecked(findTestObject('Ogloszenie/sekcja 3 z 4/input_proofOfFulfilCriteria'), 1)

actualValue = WebUI.getAttribute(findTestObject('Object Repository/Ogloszenie/textarea_DocumentListOfArt25Us'), 'value')

WebUI.verifyMatch(actualValue, 'Oświadczenie III.4)', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/textarea_DocumentListOfFulfilC'), 'value')

WebUI.verifyMatch(actualValue, 'Oświadczenie III.5)', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/sekcja 3 z 4/textarea_DocumentListOfCriteri'), 'value')

WebUI.verifyMatch(actualValue, '', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/textarea_DocumentListOfArt25Us_1'), 'value')

WebUI.verifyMatch(actualValue, 'Oświadczenie III.6)', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/textarea_OtherDocumentList'), 'value')

WebUI.verifyMatch(actualValue, 'Oświadczenie III.7)', false)

WebUI.click(findTestObject('Ogloszenie/span_Zapisz-s3'))

WebUI.waitForElementNotVisible(findTestObject('Ogloszenie/span_Przejd dalej-s3'), 1)

WebUI.click(findTestObject('Ogloszenie/span_Przejd dalej-s3'))

WebUI.delay(1)

WebUI.click(findTestObject('Ogloszenie/span_Wcz edycj'))

WebUI.verifyElementChecked(findTestObject('Ogloszenie/input_agreementSection_advance-IV.1.3)-nie'), 1)

WebUI.verifyElementChecked(findTestObject('Ogloszenie/input_agreementSection_tenderG-IV.2)-nie-nowy'), 1)

WebUI.waitForElementPresent(findTestObject('Ogloszenie/input_IV.1.4)agreementSection_offersI-nie'), 4)

WebUI.verifyElementChecked(findTestObject('Ogloszenie/input_IV.1.4)agreementSection_offersI-nie'), 1)

WebUI.verifyElementChecked(findTestObject('Ogloszenie/input_IV.1.4)agreementSection_offersI2-nie'), 1)

WebUI.verifyElementChecked(findTestObject('Ogloszenie/input_IV.1.5)agreementSection_variant-nie'), 1)

WebUI.verifyElementChecked(findTestObject('Ogloszenie/input_IV.1.5)agreementSection_variant2-nie'), 1)

WebUI.verifyElementChecked(findTestObject('Ogloszenie/input_IV.1.5)agreementSection_variant3-nie'), 1)

WebUI.verifyElementChecked(findTestObject('Ogloszenie/input_IV.1.8)agreementSection_isElect-nie'), 1)

WebUI.click(findTestObject('Ogloszenie/span_Zapisz-s4'))

WebUI.waitForElementNotPresent(findTestObject('Ogloszenie/span_Przejd dalej-s4'), 1)

WebUI.click(findTestObject('Ogloszenie/span_Przejd dalej-s4'))

WebUI.delay(1)

WebUI.click(findTestObject('Ogloszenie/span_Wcz edycj'))

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/sekcja 4 z 4/input_normal ng-pristine ng-va-spr1'), 'value')

WebUI.verifyMatch(actualValue, 'CENA', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/sekcja 4 z 4/input_normal ng-pristine ng-va-spr2'), 'value')

WebUI.verifyMatch(actualValue, '60', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/sekcja 4 z 4/input_normal ng-pristine ng-va-spr3'), 'value')

WebUI.verifyMatch(actualValue, 'GWARANCJA', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/sekcja 4 z 4/input_normal ng-pristine ng-va-spr4'), 'value')

WebUI.verifyMatch(actualValue, '40', false)

WebUI.verifyElementChecked(findTestObject('Object Repository/Ogloszenie/input_agreementSection_changes'), 1)

actualValue = WebUI.getAttribute(findTestObject('Object Repository/Ogloszenie/textarea_DescriptionOfAgreemen'), 'value')

WebUI.verifyMatch(actualValue, 'Zakres zmian', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/input_DeadlineForSubmissionOffday'), 'value')

WebUI.verifyMatch(actualValue, '30-08-2019', false)

actualValue = WebUI.getAttribute(findTestObject('Object Repository/Ogloszenie/input_DeadlineForSubmissionOff'), 'value')

WebUI.verifyMatch(actualValue, '11:11:00', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/sekcja 4 z 4/input_normal ng-pristine ng-va-jezyk-polski'), 
    'value')

WebUI.verifyMatch(actualValue, 'polski', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/sekcja 4 z 4/input_OfferTermTo'), 'value')

WebUI.verifyMatch(actualValue, '', false)

actualValue = WebUI.getAttribute(findTestObject('Object Repository/Ogloszenie/input_QuantityOfDaysToDeadline'), 'value')

WebUI.verifyMatch(actualValue, '40', false)

WebUI.verifyElementChecked(findTestObject('Object Repository/Ogloszenie/input_agreementSection_annulme'), 1)

WebUI.verifyElementChecked(findTestObject('Object Repository/Ogloszenie/input_agreementSection_annulme_1'), 1)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/sekcja 4 z 4/input_AdditionalInformationAbo-IV.6.6)'), 'value')

WebUI.verifyMatch(actualValue, '', false)

WebUI.click(findTestObject('Ogloszenie/span_Zapisz-s42'))

WebUI.waitForElementNotPresent(findTestObject('Ogloszenie/span_Zakocz tworzenie ogoszeni'), 1)

WebUI.click(findTestObject('Ogloszenie/span_Zakocz tworzenie ogoszeni'))

WebUI.click(findTestObject('Ogloszenie/button_potwierdzenie-Tak'))

WebUI.verifyElementText(findTestObject('Ogloszenie/p_weryfikator'), '556203-N-2018 Bez podziału z komisja')

