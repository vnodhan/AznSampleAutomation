package com.azn.step_definitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.azn.constants.UIConstants;
import com.azn.utilities.CommonUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AznBorrowingCalculator_StepDefinition {
		
	@Given("the user is on the borrowing estimate calculator page")
	public void the_user_is_on_the_borrowing_estimate_calculator_page() {
		CommonUtils.openUrl(UIConstants.URL);
		CommonUtils.findElement(UIConstants.HOME).isDisplayed();	
	}

	@When("the user select {string} application type")
	public void the_user_select_application_type(String string) {
		WebElement element = CommonUtils.findElement(UIConstants.APPLICATION_TYPE);
		element.click();
	}

	@When("user enters {string} in dependants text field")
	public void user_enters_in_dependants_text_field(String string) {
		WebElement element = CommonUtils.findElement(UIConstants.DEPENDANTS);
		Select select = new Select(element);
		select.selectByVisibleText("0");		
	}

	@When("user select {string} property option")
	public void user_select_property_option(String string) {
		CommonUtils.findElement(UIConstants.PROPERTY).click();	
	}

	@When("user enter {string} in annual income text field")
	public void user_enter_in_annual_income_text_field(String string) {
		WebElement element = CommonUtils.findElement(UIConstants.ANNUAL_INCOME);
		element.sendKeys(string);		
	}
	
	@When("user enter {string} in other annual income text field")
	public void user_enter_in_other_annual_income_text_field(String string) {
		CommonUtils.findElement(UIConstants.OTHER_ANNUAL_INCOME).sendKeys(string);
	}

	@When("user enter {string} in living expenses text field")
	public void user_enter_in_living_expenses_text_field(String string) {
		CommonUtils.findElement(UIConstants.LIVING_EXPENSES).sendKeys(string);
	}

	@When("user enter {string} in home loan repayment text field")
	public void user_enter_in_home_loan_repayment_text_field(String string) {
		CommonUtils.findElement(UIConstants.HOME_LOAN_REPAYMENT).sendKeys(string);

	}

	@When("user enter {string} in other loan repayment text field")
	public void user_enter_in_other_loan_repayment_text_field(String string) {
		CommonUtils.findElement(UIConstants.OTHER_LOAN_REPAYMENT).sendKeys(string);
	}

	@When("user enter {string} in other monthly commitments text field")
	public void user_enter_in_other_monthly_commitments_text_field(String string) {
		CommonUtils.findElement(UIConstants.OTHER_MONTHLY_COMMITMENT).sendKeys(string);
	}

	@When("user enter {string} in credit card limits text field")
	public void user_enter_in_credit_card_limits_text_field(String string) {
		CommonUtils.findElement(UIConstants.CREDIT_CARD_LIMIT).sendKeys(string);
	}

	@When("user click Work out how much I could borrow button")
	public void user_click_work_out_how_much_i_could_borrow_button() {
		CommonUtils.findElement(UIConstants.WORK_OUT_BUTTON).click();
	}

	@Then("user verify {string} estimated amount to borrow")
	public void user_verify_estimated_amount_to_borrow(String string) {
		WebElement element = CommonUtils.findElement(String.format(UIConstants.ESTIMATED_AMOUNT,string));
		element.isDisplayed();
		Assert.assertEquals(element.getText(), string);
	}
	
	@Then("user click on Start over button")
	public void user_click_on_start_over_button() {
	    CommonUtils.findElement(UIConstants.START_OVER).click();

	}
	
	@Then("user verify the form is cleared")
	public void user_verify_the_form_is_cleared() {
		Assert.assertEquals(CommonUtils.findElement(UIConstants.ANNUAL_INCOME).getAttribute("value"),"0");
		Assert.assertEquals(CommonUtils.findElement(UIConstants.OTHER_ANNUAL_INCOME).getAttribute("value"),"0");
		Assert.assertEquals(CommonUtils.findElement(UIConstants.LIVING_EXPENSES).getAttribute("value"),"0");
		Assert.assertEquals(CommonUtils.findElement(UIConstants.HOME_LOAN_REPAYMENT).getAttribute("value"),"0");
		Assert.assertEquals(CommonUtils.findElement(UIConstants.OTHER_LOAN_REPAYMENT).getAttribute("value"),"0");
		Assert.assertEquals(CommonUtils.findElement(UIConstants.OTHER_MONTHLY_COMMITMENT).getAttribute("value"),"0");
		Assert.assertEquals(CommonUtils.findElement(UIConstants.CREDIT_CARD_LIMIT).getAttribute("value"),"0");
	}
	
	@Then("user verify the message {string} is displayed")
	public void user_verify_the_message_is_displayed(String string) {
		WebElement e = CommonUtils.findElement(UIConstants.MESSAGE);
		Assert.assertEquals(e.getText(), string);
	}
	

}
