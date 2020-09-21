package com.example.ashwani.dao;

import com.example.ashwani.entity.Dept;
import com.example.ashwani.entity.S_Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class BookDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void addBook(S_Book s_book) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(s_book);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }finally {
            session.close();
        }

    }

    public S_Book getBookById(String id) {
        Session session = sessionFactory.getCurrentSession();
        S_Book s_book=session.get(S_Book.class,id);
        return s_book;
    }

    public void deleteBook(String id) {
        Session session=sessionFactory.getCurrentSession();
        S_Book s_book=getBookById(id);
        try{
            session.delete(s_book);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void updateBook(S_Book s_book) {
        Session session=sessionFactory.getCurrentSession();
        session.update(s_book);
    }

}
