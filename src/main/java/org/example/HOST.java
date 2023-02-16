package org.example;

public class HOST {

    static String host = PropertyReader.getInstance().getHost();
    public static final String GET_BOOKS = String.format("%s/api/books", host);
    public static final String GET_CHAR =
            String.format("%s/api/characters/{charID}", host);
}
