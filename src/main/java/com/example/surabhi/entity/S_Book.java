package com.example.ashwani.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

    @Entity(name = "book")
    @Table(name = "book")
    public class S_Book {

        @Id
        @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name = "system-uuid",strategy = "uuid")
        private String id;

        @Column(name = "book_name")
        private String book_name;

        @Column(name = "price")
        private String price;

        @ManyToMany
        @JoinTable(name = "book_authers", joinColumns= @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "auther_id"))
        private List<S_Author> author = new ArrayList<>();

        public S_Book() {

        }

        public S_Book(String id, String book_name, String price, List<S_Author> author) {
            this.id = id;
            this.book_name = book_name;
            this.price = price;
            this.author = author;
        }

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
}
