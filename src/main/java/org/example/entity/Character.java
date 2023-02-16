package org.example.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Character {
    @JsonProperty("url")
    public String url;
    @JsonProperty("name")
    public String name;
    @JsonProperty("gender")
    public String gender;
    @JsonProperty("culture")
    public String culture;
    @JsonProperty("born")
    public String born;
    @JsonProperty("died")
    public String died;
    @JsonProperty("titles")
    public List<String> titles = null;
    @JsonProperty("aliases")
    public List<String> aliases = null;
    @JsonProperty("father")
    public String father;
    @JsonProperty("mother")
    public String mother;
    @JsonProperty("spouse")
    public String spouse;
    @JsonProperty("allegiances")
    public List<String> allegiances = null;
    @JsonProperty("books")
    public List<String> books = null;
    @JsonProperty("povBooks")
    public List<Object> povBooks = null;
    @JsonProperty("tvSeries")
    public List<String> tvSeries = null;
    @JsonProperty("playedBy")
    public List<String> playedBy = null;

}