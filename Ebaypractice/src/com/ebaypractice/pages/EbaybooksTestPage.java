package com.ebaypractice.pages;

import java.util.List;

import com.ebaypractice.components.Component;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;

public class EbaybooksTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "selectbook")
	private List<Component> selectbook;
	

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public List<Component> getSelectbook() {
		return selectbook;
	}

	public void verifyList(){
		for(Component c:getSelectbook()){
			System.out.println(" book name "+c.getBookName().getText());
			System.out.println(" book price "+c.getBookPrice().getText());
		}
	}

}
