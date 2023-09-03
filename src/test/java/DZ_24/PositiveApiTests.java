package DZ_24;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PositiveApiTests {
    @Test
    @DisplayName("Get user by ID and receive response with status code 200")
    void getUserTest() {
        io.restassured.response.Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://reqres.in/api/users/2")
                .then()
                .extract()
                .response();

        System.out.println(response.getBody().prettyPrint());
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals("Janet", response.jsonPath().getString("data.first_name"));
        Assert.assertEquals("Weaver", response.jsonPath().getString("data.last_name"));
    }

    @Test
    @DisplayName("Create user and receive response with status code 201")
    void postUserCreationTest() {
        JSONObject request = new JSONObject();
        request.put("job", "leader");
        request.put("name", "morpheus");

        io.restassured.response.Response response = given()
                .body(request.toJSONString())
                .contentType(ContentType.JSON)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .extract()
                .response();

        System.out.println(response.getBody().prettyPrint());
        Assert.assertEquals(201, response.statusCode());
        Assert.assertEquals("leader", response.jsonPath().getString("job"));
        Assert.assertEquals("morpheus", response.jsonPath().getString("name"));
        Assert.assertNotNull(response.jsonPath().getString("id"));
        Assert.assertNotNull(response.jsonPath().getString("createdAt"));

    }
    @Test
    @DisplayName("Delete user and receive response with status code 204")
    public void deleteUserTest() {
        given()
                .log().uri()
                .log().method()
                .delete("https://reqres.in/api/users/2")
                .then()
                .statusCode(204)
                .log().status();
    }
}
