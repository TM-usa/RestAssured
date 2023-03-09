package co.qot.test;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static io.restassured.RestAssured.given;

public class PetsTest extends TestConfig {

    @Test
            public void myFirstTest(){
        given()
                   .log().all()
                .when()
                      .get("https://petstore.swagger.io/v2/pet")
                .then()
                    .log().all();


    }




//    static final ResponseSpecification SUCCESS = new ResponseSpecBuilder().expectStatusCode(200).build();
////    static final RequestSpecification  reqS =  new RequestSpecBuilder()
////
////            .setBaseUri("https://petstore.swagger.io/v2/pet/")
////            .build() .filter(new AllureRestAssured());
////
////    @ParameterizedTest
////    @ValueSource(strings = {"available", "pending", "sold"})
////
////
////    public void testThatICanGetPetByStatus(String Status){
////
////      given()
////              .spec(reqS
////              )
////                .when()
////                .get("findByStatus?status="+Status)
////                .then()
////                .spec(SUCCESS);
////
////    }
////


//    @Test
//        public void createNewPetByJSON(){
//           String petBodyJson = "{\n" +
//                   "  \"id\": 0,\n" +
//                   "  \"category\": {\n" +
//                   "    \"id\": 0,\n" +
//                   "    \"name\": \"string\"\n" +
//                   "  },\n" +
//                   "  \"name\": \"doggie\",\n" +
//                   "  \"photoUrls\": [\n" +
//                   "    \"string\"\n" +
//                   "  ],\n" +
//                   "  \"tags\": [\n" +
//                   "    {\n" +
//                   "      \"id\": 0,\n" +
//                   "      \"name\": \"string\"\n" +
//                   "    }\n" +
//                   "  ],\n" +
//                   "  \"status\": \"available\"\n" +
//                   "} ";
//
//        given()
//                   .body(petBodyJson)
//                   .when().post().then();
//    }
}









































//        int statusCode = response.getStatusCode();
//        Assert.assertEquals(statusCode, 200);
