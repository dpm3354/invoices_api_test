package beaufort.invoices.api;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
//import static com.jayway.restassured.RestAssured.given;
//import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class RestAssured {

 @Test
 public void responseShouldHaveStatusCode200() {
//     given().
//     	when().get("http://34.197.198.114:8081/invoices").
//     then().
//     	statusCode(200);
     given().
  	when().get("http://34.197.198.114:8081/invoices").
  then().
  	statusCode(200);
 }

 
 @Test
 public void responseShouldContainBeckerAndSons() {
	 given().
	 	when().get("http://34.197.198.114:8081/invoices").
	 then().
	 	body(containsString("Becker and Sons"));
 }
 
}