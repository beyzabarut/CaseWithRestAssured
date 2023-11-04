package client;

import io.restassured.RestAssured;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.Map;

public abstract class RestAssuredRequestSpecification {
    String baseUrl;
    RequestSpecification httpRequest;

    public RestAssuredRequestSpecification(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Response post(String path, Map<String, Object> params, Map<String, Object> headers, Object body){
        io.restassured.RestAssured.urlEncodingEnabled = false;
        setHttpRequest(params, headers, body);
        Response response = httpRequest.post(path);
        response.then().log().body();
        return response;
    }

    public Response put(String path, Map<String, Object> params, Map<String, Object> headers, Object body){
        setHttpRequest(params, headers, body);
        Response response = httpRequest.put(path);
        response.then().log().body();
        return response;
    }

    public Response get(String path, Map<String, Object> params, Map<String, Object> headers, Object body){
        setHttpRequest(params, headers, body);
        Response response = httpRequest.get(path);
        response.then().log().body();
        return response;
    }

    public Response delete(String path, Map<String, Object> params, Map<String, Object> headers, Object body){
        setHttpRequest(params, headers, body);
        Response response = httpRequest.delete(path);
        response.then().log().body();
        return response;
    }

    protected void setHttpRequest(Map<String, Object> params, Map<String, Object> headers, Object body){
        httpRequest = RestAssured.given().log().all(true).baseUri(baseUrl);
        httpRequest.header("Content-Type", "application/json");
        httpRequest.header("xAutomation", "true");
        if(params != null){
            httpRequest.queryParams(params);
        }
        if(headers != null){
            httpRequest.headers(headers);
        }
        if(body != null){
            httpRequest.body(body);
        }
    }
}
