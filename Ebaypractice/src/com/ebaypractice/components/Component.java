package com.ebaypractice.components;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class Component extends QAFWebComponent{

	public Component(String locator) {
		super(locator);
		
	}

	@FindBy(locator = "book.name")
	private QAFWebElement bookName;
	@FindBy(locator = "book.price")
	private QAFWebElement bookPrice;
	
	public QAFWebElement getBookName() {
		return bookName;
	}

	public QAFWebElement getBookPrice() {
		return bookPrice;
	}
	
	
	
	
	
	
	
}
