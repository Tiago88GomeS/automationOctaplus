package applicationApi;

import factory.CounterPartyDataFactory;
import factory.GroupNameDataFactory;
import io.restassured.http.ContentType;
import org.junit.Test;
import pojo.CounterParty;
import pojo.GroupName;

import static io.restassured.RestAssured.*;

public class ConsultarGroupListTest {
    @Test
    public void testConsultarTodosGroupNameCadastrado(){
        baseURI = "http://teste-qa-95b5bac5.octax.co:8002/";
        basePath = "/group";

        GroupName groupNameTest = GroupNameDataFactory.criarUmNovoGroupNameParaRequisicao();

        given()
                .contentType(ContentType.JSON)
                .body(groupNameTest)
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
}
