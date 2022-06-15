package com.automacao.test.paranabanco.report;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;


public class ListennerClass extends ExtentManager implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		
		test = extent.createTest(result.getName());
		
	}
	
	public void onTestSucces(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
			 test.log(Status.PASS, "o teste passou"+result.getName());
		}
		
	}
	

	public void onTestFailure(ITestResult result) {
	if(result.getStatus()==ITestResult.FAILURE) {
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+ "- Test nao passou", ExtentColor.RED));
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() +" - Teste nao passou " , ExtentColor.RED));
		
		
	}
		
	}
	

}
