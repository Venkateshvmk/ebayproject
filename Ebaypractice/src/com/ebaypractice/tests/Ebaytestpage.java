package com.ebaypractice.tests;

import org.testng.annotations.Test;

import com.ebaypractice.pages.EbaybooksTestPage;
import com.ebaypractice.pages.HomeTestPage;
import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
//////////////////////////////////////////////////////////////
public class Ebaytestpage extends WebDriverTestCase {
	HomeTestPage ebayhomepage =new HomeTestPage();
	 EbaybooksTestPage ebaybookspage=new EbaybooksTestPage();
	@Test
	public void Ebayautomation() {
		ebayhomepage.launchPage(null);
		ebayhomepage.waitForPageToLoad();
		ebayhomepage.allCatogories("Books & Magazines");
	//	ebaybookspage.verifyList();
	}
	
}
