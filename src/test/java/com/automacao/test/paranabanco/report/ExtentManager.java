package com.automacao.test.paranabanco.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	public static void setUpReport() throws Exception {
		
		htmlreporter = new ExtentHtmlReporter("relato.html");
		htmlreporter.config().setDocumentTitle("Teste Desafio");
		htmlreporter.config().setReportName("Teste Desafio Relatorio");
		htmlreporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		extent.setSystemInfo("My host", "my host");
		extent.setSystemInfo("projeto", "Desafio");
		extent.setSystemInfo("Testador", "Mwati ikando");
		extent.setSystemInfo("Browser", "Chrome");
		

	}
	
	public static void fimRelatorio() 
	{
		
		extent.flush();
	}

}
