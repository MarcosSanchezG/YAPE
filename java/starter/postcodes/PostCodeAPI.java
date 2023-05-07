package starter.postcodes;


import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;
import org.junit.Assert;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.security.KeyStore;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class PostCodeAPI {

     @Step("ingreso usuario <word> y clave <word>")
    public void fetchLocationByPostCodeAndCountry(String User, String Clave) {
           SerenityRest.given()
                .body(LocationResponse.Name)
                .contentType("application/json");
                SerenityRest.when().post("https://restful-booker.herokuapp.com/auth");
    }
    @Step("valido token")
    public void fetchLocation() {
        restAssuredThat(response -> response.statusCode(200));
        System.out.println("el Token es = " + SerenityRest.lastResponse().jsonPath().getString("token"));
    }
    public void ObtengoID() {
        SerenityRest.when().get("https://restful-booker.herokuapp.com/booking");
    }
    public  void ValidoID(){
        restAssuredThat(response -> response.statusCode(200));
        System.out.println("el ID es = " + SerenityRest.lastResponse().jsonPath().getString("bookingid"));

    }
    public  void ObtengoPing(){
        SerenityRest.when().get("https://restful-booker.herokuapp.com/ping");
     }
    public  void ValidoPing() {
               RestAssured.registerParser("Created", Parser.JSON);
              //   Assert.assertTrue( response -> response.statusCode(200));
      System.out.println( SerenityRest.lastResponse().htmlPath().getString("Created"));

    }

    }