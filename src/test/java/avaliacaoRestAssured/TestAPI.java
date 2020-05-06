package avaliacaoRestAssured;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class TestAPI {
	
	@Test
	public void testValidaRetorno() {
		
		String baseURI = "https://jsonplaceholder.typicode.com/todos/1 ";
		
		 given()
		 .when()
		    .get(baseURI)
		 .then()
		    .body("userId", is(1))
		    .body("id", is(1))
		    .body("title", equalTo("delectus aut autem"))
		    .body("completed", is(false));
		    
	}
	
}