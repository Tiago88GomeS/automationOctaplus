package applicationApi;

import factory.CounterPartyDataFactory;
import factory.GroupNameDataFactory;
import io.restassured.http.ContentType;
import org.junit.Test;
import pojo.CounterParty;
import pojo.GroupName;

import static io.restassured.RestAssured.*;

public class ConsultaCounterPartyListTest {
    @Test
    public void testConsultarTodosCounterPartyCadastrado(){
        baseURI = "http://teste-qa-95b5bac5.octax.co:8002/";
        basePath = "/counterparty";

        CounterParty counterPartyTest = CounterPartyDataFactory.criarUmNovoCounterParty();
        GroupName groupNameTest = GroupNameDataFactory.criarUmNovoGroupNameParaRequisicao();

        given()
                .contentType(ContentType.JSON)
                .body(counterPartyTest)
                .when()
                .get("/list")
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200)
                .extract()
                .response();
    }
    @Test
    public void testConsultarCounterPartySemSerCadastrada(){
        baseURI = "http://teste-qa-95b5bac5.octax.co:8002/";
        basePath = "/counterparty";

        CounterParty counterPartyTest = CounterPartyDataFactory.criarUmNovoCounterParty();
        GroupName groupNameTest = GroupNameDataFactory.criarUmNovoGroupNameParaRequisicao();

        given()
                .contentType(ContentType.JSON)
                .body(counterPartyTest)
                .when()
                .get("/list")
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(400)
                .extract()
                .response();
    }
}
