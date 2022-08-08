package applicationApi;

import factory.CounterPartyDataFactory;
import factory.GroupNameDataFactory;
import io.restassured.http.ContentType;
import org.junit.Test;
import pojo.CounterParty;
import pojo.GroupName;

import static io.restassured.RestAssured.*;

public class DeletarCounterPartyCnpjTest {
    @Test
    public void testCriarUmNovoGroupNameComSucesso(){
        baseURI = "http://teste-qa-95b5bac5.octax.co:8002";
        basePath = "/counterparty/";

        CounterParty counterPartyTest = CounterPartyDataFactory.criarUmNovoCounterParty();

        given()
                .contentType(ContentType.JSON)
                .when()
                .delete(counterPartyTest.getCnpj())
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
    }

}
