package com.example.ashwani.request;

import com.example.ashwani.entity.S_Author;
import com.example.ashwani.entity.S_Book;

import java.util.ArrayList;
import java.util.List;

public class SAuthorRequest {

    private String auther_id;
    private String auther_name;
    private List<S_Book> books = new ArrayList<>();

    public String getAuther_id() {
        return auther_id;
    }

    public void setAuther_id(String auther_id) {
        this.auther_id = auther_id;
    }

    public String getAuther_name() {
        return auther_name;
    }

    public void setAuther_name(String auther_name) {
        this.auther_name = auther_name;
    }

    public List<S_Book> getBooks() {
        return books;
    }

    public void setBooks(List<S_Book> books) {
        this.books = books;
    }

    public static S_Author generateFrom(SAuthorRequest sAuthorRequest) {
        S_Author author = new S_Author();
        author.setAuther_id(sAuthorRequest.getAuther_id());
        author.setAuthor_name(sAuthorRequest.getAuther_name());
        author.setBooks(sAuthorRequest.getBooks());
        return author;
    }
}
