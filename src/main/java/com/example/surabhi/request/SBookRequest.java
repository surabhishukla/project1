package com.example.ashwani.request;

import com.example.ashwani.entity.S_Author;
import com.example.ashwani.entity.S_Book;

import java.util.ArrayList;
import java.util.List;

public class SBookRequest {

    private String id;
    private String book_name;
    private String price;
    private List<S_Author> author = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<S_Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<S_Author> author) {
        this.author = author;
    }

    public static S_Book generateFrom(SBookRequest sBookRequest) {
        S_Book book = new S_Book();
        book.setId(sBookRequest.getId());
        book.setBook_name(sBookRequest.getBook_name());
        book.setPrice(sBookRequest.getPrice());
        book.setAuthor(sBookRequest.getAuthor());
        return book;
    }
}
