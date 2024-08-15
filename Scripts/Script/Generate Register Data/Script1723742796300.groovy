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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as gv
import org.openqa.selenium.Keys as Keys
import com.github.javafaker.Faker

// generate data
Faker faker = new Faker();
String fname = faker.name().firstName();
String lname = faker.name().lastName();
String email = faker.internet().emailAddress();
String phone = String.valueOf(faker.number().digits(8));
String company = faker.company().buzzword();
String address1 = faker.address().fullAddress();
String city = faker.address().city();
String country = 'United States';
String state = 'Oklahoma';
String zip = faker.number().digits(5);
String loginname = fname + '_' + lname + '_testing';
String password = faker.internet().password();

// assign to variables
gv.reg_firstname = fname;
gv.reg_lastname = lname;
gv.reg_email = email;
gv.reg_phone = phone;
gv.reg_company = company;
gv.reg_address1 = address1;
gv.reg_city = city;
gv.reg_country = country;
gv.reg_state = state;
gv.reg_zip = zip;
gv.reg_loginname = loginname;
gv.reg_password = password;