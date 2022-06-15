package com.automacao.test.paranabanco.desafio.Api;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.startsWith;
import org.testng.annotations.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class JsonSchema 
{
	
	@Test
	public void test() 
	
	{
		System.out.println("aqui comença validacao schema");
		given()
		.get("http://jsonplaceholder.typicode.com/users")
		.then()
		.assertThat().body(matchesJsonSchemaInClasspath("schema.json"))
		.statusCode(200)
		.body("id[0]", equalTo(1))
		.body("name[0]", startsWith("Leanne Graham"))
		.log()
		.all();
	}
	

}
