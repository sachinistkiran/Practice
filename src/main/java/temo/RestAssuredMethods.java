package temo;

import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpStatusClass;
import io.restassured.RestAssured;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class RestAssuredMethods {

    public static void main(String[] args) {
        RestAssuredMethods ra = new RestAssuredMethods();
        ra.verifyDelete();
        ra.verifyPost();
        ra.verifyGet();
        ra.verifyPatch();
    }

    private void verifyPatch() {
    }

    public void verifyDelete() {
        String baseUrl = "https://reqres.in";
        Response response = RestAssured.given().contentType(ContentType.JSON)
                .pathParam("pageSize", "2").log().all()
                .when().delete(baseUrl + "/api/users?page={pageSize}");
        response.then().log().all().assertThat().statusCode(204);

    }

    public  void verifyPost(){
        String baseUrl = "https://reqres.in";
        Response response = RestAssured.given().contentType(ContentType.JSON).log().all().when().post(baseUrl+"/api/users");
        response.then().log().all().assertThat().statusCode(201);
    }

    public  void verifyGet(){
        String baseUrl = "https://reqres.in";
        Response response = RestAssured.given().contentType(ContentType.JSON).log().all().when().get(baseUrl+"/api/users/2");
        response.then().log().all().statusCode(200).extract().response();
    }
}