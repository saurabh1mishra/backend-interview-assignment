package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.example.entity.Books;
import org.example.entity.Char;

import java.util.List;

public class BookClient {

    public List<Books> getBooks() {
        Response response = RestAssured.given().get(HOST.GET_BOOKS);
        assert response.getStatusCode() == 200 : "request got failed";
        return List.of(response.as(Books[].class));
    }

    public Char getChar(int id) {
        Response response = RestAssured.given().pathParam("charID", String.valueOf(id)).get(HOST.GET_CHAR);
        assert response.getStatusCode() == 200 : "request got failed";
        return response.as(Char.class);
    }

}
