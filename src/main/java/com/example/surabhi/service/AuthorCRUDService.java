package com.example.ashwani.service;

import com.example.ashwani.dao.AuthorDao;
import com.example.ashwani.dao.BookDao;
import com.example.ashwani.dto.EmpDto;
import com.example.ashwani.entity.Dept;
import com.example.ashwani.entity.Emp;
import com.example.ashwani.entity.S_Author;
import com.example.ashwani.request.EmpRequest;
import com.example.ashwani.request.SAuthorRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class AuthorCRUDService {

    @Autowired
    private AuthorDao authorDao;

    public void saveAuthor(SAuthorRequest sAuthorRequest) {
        S_Author s_author = new S_Author();
        s_author.setAuthor_name(sAuthorRequest.getAuther_name());
        s_author.setBooks(sAuthorRequest.getBooks());
        authorDao.addAuthor(s_author);
    }

    public List<S_Author> getAuthor(String id) {
        return (List<S_Author>) authorDao.getAuthorById(id);
    }

    public void deleteAuther(String id) {
        authorDao.deleteAuther(id);
    }

    public void updateAuther(SAuthorRequest sAuthorRequest) {
        S_Author s_author = new S_Author();
        s_author.setAuthor_name(sAuthorRequest.getAuther_name());
        authorDao.updateBook(s_author);
    }


}
