package org.pomlocators;

import org.library.LibMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderNo extends LibMethods
{	
	public OrderNo() {
		PageFactory.initElements(driver, this);
	}
	
	
		@FindBy(id="order_no")
		private WebElement orderNo;

	}


