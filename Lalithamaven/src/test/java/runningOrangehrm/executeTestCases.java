package runningOrangehrm;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import basePack.baseClass;

public class executeTestCases extends baseClass {
	@Test


	public void login() throws InterruptedException, AWTException, IOException
	{
		scrippting s= new scrippting();
		s.login();
		Thread.sleep(4000);
		//s.oneemp();
		s.multipleemp();
		//s.editempone();
		//s.delemp();
		

	}





}

