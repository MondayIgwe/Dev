package Support;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.File;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestUtils {
    public static String getUri(String url, String endpoint) {
        String baseUri = url;
        return url + endpoint;
    }

    public static Response performPost(String url, String endpoint, File file, Map<String, String> map) {
        return given().baseUri(getUri(url, endpoint)).log().all().
                contentType(ContentType.JSON)
                .headers(map)
                .body(file)
                .post().then().log().all().extract().response();
    }

    public static Response performPost(String url, String endpoint, String request, Map<String, String> map) {
        return given().baseUri(getUri(url, endpoint)).log().all().
                contentType(ContentType.JSON)
                .headers(map)
                .body(request)
                .post().then().log().all().extract().response();
    }
    public static Response performPost(String url, String endpoint, Map<String, Object> request, Map<String, String> map) {
        return given().baseUri(getUri(url, endpoint)).log().all().
                contentType(ContentType.JSON)
                .headers(map)
                .body(request)
                .post().then().log().all().extract().response();
    }
}
