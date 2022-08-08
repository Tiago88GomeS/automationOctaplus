package applicationApi;

import factory.CounterPartyDataFactory;
import factory.GroupNameDataFactory;
import io.restassured.http.ContentType;
import org.junit.Test;
import pojo.CounterParty;
import pojo.GroupName;

import static io.restassured.RestAssured.*;

public class CriarUmNovoCounterPartyTest {
    @Test
    public void testCriarUmNovoCounterPartyTest(){
        baseURI = "http://teste-qa-95b5bac5.octax.co:8002";
        basePath = "/counterparty";

        CounterParty counterPartyTest = CounterPartyDataFactory.criarUmNovoCounterParty();
        given()
                .contentType(ContentType.JSON)
                .body(counterPartyTest)
                .when()
                .post()
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200)
                .extract()
                .response();
    }
}
