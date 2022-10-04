package com.azn.constants;

public class UIConstants {
	
	public static final String URL = "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/";
	
	public static final String HOME = "//*[text()='How much could I borrow?']";
	
	public static final String APPLICATION_TYPE = "//label[contains(text(),'Single')]";
	
	public static final String DEPENDANTS = "//select[@title='Number of dependants']";
	
	public static final String PROPERTY = "//*[contains(text(),'Home to live in')]";
	
	public static final String ANNUAL_INCOME = "//span[@id='q2q1i1']//following::input[1]";
	
	public static final String OTHER_ANNUAL_INCOME = "//span[@id='q2q2i1']//following::input[1]";
	
	public static final String LIVING_EXPENSES = "//*[@id='expenses']";
	
	public static final String HOME_LOAN_REPAYMENT = "//*[@id='homeloans']";
	
	public static final String OTHER_LOAN_REPAYMENT = "//*[@id='otherloans']";
	
	public static final String OTHER_MONTHLY_COMMITMENT = "//span[@id='q3q4i1']//following::input[1]";
	
	public static final String CREDIT_CARD_LIMIT = "//*[@id='credit']";
	
	public static final String WORK_OUT_BUTTON = "//*[@id='btnBorrowCalculater']";
	
	public static final String ESTIMATED_AMOUNT = "//*[@id='borrowResultTextAmount' and text()='%s']";
	
	public static final String START_OVER = "//div[@class='result__restart']//child::span";
	
	public static final String MESSAGE = "//*[contains(text(),'Based on the details')]";

}
