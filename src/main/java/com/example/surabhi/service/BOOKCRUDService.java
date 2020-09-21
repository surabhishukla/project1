package com.example.ashwani.service;

import com.example.ashwani.dao.AuthorDao;
import com.example.ashwani.dao.BookDao;
import com.example.ashwani.entity.S_Author;
import com.example.ashwani.entity.S_Book;
import com.example.ashwani.request.SAuthorRequest;
import com.example.ashwani.request.SBookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BOOKCRUDService {

    @Autowired
    private BookDao bookDao;

    public void saveBook(SBookRequest sBookRequest) {
        S_Book s_book = new S_Book();
        s_book.setBook_name(sBookRequest.getBook_name());
        s_book.setAuthor(sBookRequest.getAuthor());
        bookDao.addBook(s_book);
    }

    public List<S_Book> getBook(String id) {
        return (List<S_Book>) bookDao.getBookById(id);
    }

    public void deleteBook(String id) {
        bookDao.deleteBook(id);
    }

    public void updateBook(SAuthorRequest sAuthorRequest) {
        S_Book s_book = new S_Book();
        s_book.setBook_name(sAuthorRequest.getAuther_name());
        bookDao.updateBook(s_book);
    }
}
