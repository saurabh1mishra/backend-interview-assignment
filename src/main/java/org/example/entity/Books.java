package org.example.entity;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Books {

    @JsonProperty("url")
    public String url;
    @JsonProperty("name")
    public String name;
    @JsonProperty("isbn")
    public String isbn;
    @JsonProperty("authors")
    public List<String> authors = null;
    @JsonProperty("numberOfPages")
    public Integer numberOfPages;
    @JsonProperty("publisher")
    public String publisher;
    @JsonProperty("country")
    public String country;
    @JsonProperty("mediaType")
    public String mediaType;
    @JsonProperty("released")
    public String released;
    @JsonProperty("characters")
    public List<String> characters = null;
    @JsonProperty("povCharacters")
    public List<String> povCharacters = null;

}