package com.automacao.test.paranabanco.desafio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automacao.test.paranabanco.report.BaseClass;

public class Desafio extends BaseClass  {




	@Test(alwaysRun = true, priority = 1)
	public void accessandoSite() throws Exception

	{ 
		w.until(ExpectedConditions.elementToBeClickable(By.id("content")));
		String atualtitle = driver.getTitle();
		String titleesperado = "The Internet";
		Assert.assertTrue(atualtitle.contains(titleesperado));
		String Texto = driver.findElement(By.xpath("//div[@id='content']/div/p")).getText();
		System.out.println(Texto);

	}

	@Test(alwaysRun = true, priority = 2)
	public void botaoAzul() throws Exception
	{

	  
		WebElement botaoazul   = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[1]"));
		String Texto = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[1]")).getText();
		System.out.println(Texto);
		new Actions(driver).moveToElement(botaoazul).click().build().perform();

		String cor = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[1]")).getCssValue("color");
		System.out.println("cor esta:" +cor);
    
	}

	@Test(alwaysRun = true, priority = 3)
	public void botaoVermelha() throws Exception
	{
    	WebElement botaovermelha   = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[2]"));
		String Texto = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[2]")).getText();
		System.out.println(Texto);
		new Actions(driver).moveToElement(botaovermelha).click().build().perform();
		String cor = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[2]")).getCssValue("color");
		System.out.println("cor esta:" +cor);

	}


	@Test(alwaysRun = true, priority = 4)
	public void botaoVerde() throws Exception
	{

		WebElement botaovermelha   = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[3]"));
		String Texto = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[2]")).getText();
		System.out.println(Texto);
		new Actions(driver).moveToElement(botaovermelha).click().build().perform();
		String cor = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[2]")).getCssValue("color");
		System.out.println("cor esta:" +cor);

	}


	@Test(alwaysRun = true, priority = 5)
	public void clicandoNaBotaoEditDeleteUm() throws Exception
	{
		//EDIT1
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[1]/td[7]/a[1]")).click();
		//AGORA DELETE
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[1]/td[7]/a[2]")).click();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://the-internet.herokuapp.com/challenging_dom#delete" );
	}

	@Test(alwaysRun = true, priority = 6)
	public void clicandoNaBotaoEditDeleteDois() throws Exception
	{	
		//EDIT
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[2]/td[7]/a[1]")).click();
		//AGORA DELETE
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[2]/td[7]/a[2]")).click();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://the-internet.herokuapp.com/challenging_dom#delete" );
	}

	@Test(alwaysRun = true, priority = 7)
	public void clicandoNaBotaoEditDeleteTres() throws Exception
	{
		//EDIT
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[3]/td[7]/a[1]")).click();
		//AGORA DELETE
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[3]/td[7]/a[2]")).click();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://the-internet.herokuapp.com/challenging_dom#delete" );
	}

	@Test(alwaysRun = true, priority = 8)
	public void clicandoNaBotaoEditDeleteQuatro() throws Exception
	{
		//EDIT
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[4]/td[7]/a[1]")).click();
		//AGORA DELETE
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[4]/td[7]/a[2]")).click();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://the-internet.herokuapp.com/challenging_dom#delete" );
	}

	@Test(alwaysRun = true, priority = 9)
	public void clicandoNaBotaoEditDeleteCinco() throws Exception
	{
		//EDIT
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[5]/td[7]/a[1]")).click();
		//AGORA DELETE
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[5]/td[7]/a[2]")).click();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://the-internet.herokuapp.com/challenging_dom#delete" );
	}

	@Test(alwaysRun = true, priority = 10)
	public void clicandoNaBotaoEditDeleteSeis() throws Exception
	{
		//EDIT
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[6]/td[7]/a[1]")).click();
		//AGORA DELETE
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[6]/td[7]/a[2]")).click();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://the-internet.herokuapp.com/challenging_dom#delete" );
	}

	@Test(alwaysRun = true, priority = 11)
	public void clicandoNaBotaoEditDeleteSete() throws Exception
	{
		//EDIT
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[7]/td[7]/a[1]")).click();
		//AGORA DELETE
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[7]/td[7]/a[2]")).click();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://the-internet.herokuapp.com/challenging_dom#delete" );
	}

	@Test(alwaysRun = true, priority = 12)
	public void clicandoNaBotaoEditDeleteOite() throws Exception
	{
		//EDIT
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[8]/td[7]/a[1]")).click();
		//AGORA DELETE
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[8]/td[7]/a[2]")).click();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://the-internet.herokuapp.com/challenging_dom#delete" );
	}

	@Test(alwaysRun = true, priority = 13)
	public void clicandoNaBotaoEditDeleteNove() throws Exception
	{
		//EDIT
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[9]/td[7]/a[1]")).click();
		//AGORA DELETE
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[9]/td[7]/a[2]")).click();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://the-internet.herokuapp.com/challenging_dom#delete" );
	}

}
