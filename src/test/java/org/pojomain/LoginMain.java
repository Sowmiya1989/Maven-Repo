package org.pojomain;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.library.LibMethods;
import org.openqa.selenium.WebElement;
import org.pomlocators.LoginUnit;

import junit.framework.Assert;

public class LoginMain extends LibMethods
{
	
	@BeforeClass
	public static  void browser()  {
		browserLaunch();
		
		getUrl("http://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		//Thread.sleep(2000);

	}
	
	@Before
	public void startTime() {
		Date d = new Date();
		System.out.println();

	}
	
	@After
	public void endTime() {
		// TODO Auto-generated method stub

	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testcaseLogin() throws IOException, InterruptedException {
		LoginUnit l = new LoginUnit();
		
		 String textUser = sendKeys(l.getTxtPass(), excelData(1, 0));
		Assert.assertEquals("Give valid username", "jitheshsowmiya" , textUser );
		 
		String textPass =  sendKeys(l.getTxtPass(), excelData(1, 1));
		Assert.assertEquals("Give valid username", "sowmiyajithesh" , textPass );
		 
		 
		 buttonClick(l.getLogin());
		 Thread.sleep(2000);

	}
	

}
