package starter.postcodes;

import com.kenai.jffi.Util;
import groovyjarjarantlr.Token;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.seleniumhq.jetty9.server.Authentication;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class PostCodeStepDefinitions {

    @Steps
    PostCodeAPI postCodeAPI;
        @Given("ingreso usuario {word} y clave {word}")
    public void ingreso_usuario_admin_y_clave_password123(String User, String Clave) {
          postCodeAPI.fetchLocationByPostCodeAndCountry(User,Clave);
    }
    @Then("valido token")
    public void validoToken(){
        postCodeAPI.fetchLocation();

    }
    @Given("obtengo id")
    public void obtengoId() {
        postCodeAPI.ObtengoID();
    }

    @Then("valido numero de id")
    public void validoNumeroDeId() {
            postCodeAPI.ValidoID();
    }

    @Given("obtengo Ping")
    public void obtengoPing() {
            postCodeAPI.ObtengoPing();
    }

    @Then("valido numero de Ping")
    public void validoNumeroDePing() {
            postCodeAPI.ValidoPing();
    }
}






