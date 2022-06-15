package com.automacao.test.paranabanco.desafio.Api;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.startsWith;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Apitest {


	@Test(priority = 1)
	public	void get() {
		RestAssured.baseURI="http://jsonplaceholder.typicode.com/users";
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.request(Method.GET);
		String responseBody=response.getBody().asString();
		System.out.println("Response Body esta:" +responseBody);
		int statusCode=response.getStatusCode();
		System.out.println("Status code esta: "+statusCode);
		Assert.assertEquals(statusCode, 200);

		String statusLine=response.getStatusLine();
		System.out.println("Status line esta:"+statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");


	}

	@Test(priority = 2)
	public void postePut() 

	{

		RestAssured.baseURI="http://jsonplaceholder.typicode.com/users";
		RequestSpecification httpRequest=RestAssured.given();
		JSONObject requestParams=new JSONObject();
		requestParams.put("id",14);
		requestParams.put("email","nicole.kingn@reqres.in");
		requestParams.put("first_name","Nicole");
		requestParams.put("last_name","Lawson"); 
		requestParams.put("employee_age", "30");
		requestParams.put("employee_salary", "11111");

		httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestParams.toJSONString());  
		Response response=httpRequest.request(Method.POST);
		String responseBody=response.getBody().asString();
		System.out.println("Response Body esta:"+responseBody);

		int statusCode=response.getStatusCode();
		System.out.println("Status code esta: "+statusCode);
		Assert.assertEquals(statusCode, 201);

		/*
		JSONObject request = new JSONObject ();
		request.put("website", "kingbo");
		request.put("name", "king");
		request.put("employee_name", "MapTest");
		request.put("profile_image", "test.png");
		request.put("employee_age", "30");
		request.put("employee_salary", "11111");
		System.out.println(request);
		System.out.println(request.toJSONString());

		given().
		contentType(ContentType.JSON).
		body(request.toJSONString()).
		when().
		post("http://jsonplaceholder.typicode.com/users").  
		then()
		.assertThat(). statusCode(201)
		.log()
		.all();

		 */
	}


	@Test(priority = 3)
	public void delete() {

		RestAssured.baseURI="http://jsonplaceholder.typicode.com/posts/1";
		RequestSpecification httpRequest=RestAssured.given();
		JSONObject requestParams=new JSONObject();
		requestParams.put("id",9);
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestParams.toJSONString());
		Response response=httpRequest.request(Method.DELETE);
		String responseBody=response.getBody().asString();
		System.out.println("Response Body esta:" +responseBody);
		int statusCode=response.getStatusCode();
		System.out.println("Status code esta: "+statusCode);
		Assert.assertEquals(statusCode, 200);         
		/*
		when().
		delete("http://jsonplaceholder.typicode.com/users")
		.then()
		.assertThat(). statusCode(201)
		.log()
		.all();

		 */
	}
}
