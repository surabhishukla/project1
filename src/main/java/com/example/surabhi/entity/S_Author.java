package com.example.ashwani.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

    @Entity(name = "auther")
    @Table(name = "auther")
    public class S_Author {

        @Id
        @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name = "system-uuid",strategy = "uuid")
        private String auther_id;

        @Column
        private String author_name;

        @ManyToMany(mappedBy = "author",cascade = CascadeType.ALL)
        private List<S_Book> books = new ArrayList<>();

        public S_Author() {

        }

        public S_Author(String auther_id, String author_name, List<S_Book> books) {
            this.auther_id = auther_id;
            this.author_name = author_name;
            this.books = books;
        }

        public String getAuther_id() {
            return auther_id;
        }

        public void setAuther_id(String auther_id) {
            this.auther_id = auther_id;
        }

        public String getAuthor_name() {
            return author_name;
        }

        public void setAuthor_name(String author_name) {
            this.author_name = author_name;
        }

        public List<S_Book> getBooks() {
            return books;
        }

        public void setBooks(List<S_Book> books) {
            this.books = books;
        }

}
