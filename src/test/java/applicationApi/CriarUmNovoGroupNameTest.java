package applicationApi;

import factory.GroupNameDataFactory;
import io.restassured.http.ContentType;
import org.junit.Test;
import pojo.GroupName;

import static io.restassured.RestAssured.*;

public class CriarUmNovoGroupNameTest {
    @Test
    public void testCriarUmNovoGroupNameComSucesso(){
        baseURI = "http://teste-qa-95b5bac5.octax.co:8002/";
        basePath = "/group";

        GroupName groupNameTest = GroupNameDataFactory.criarUmNovoGroupNameParaRequisicao();

        given()
                .contentType(ContentType.JSON)
                .body(groupNameTest)
                .when()
                .post(groupNameTest.getGroupName())
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200)
                .extract()
                .response();
    }
}
