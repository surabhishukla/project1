package com.example.ashwani.dao;

import com.example.ashwani.entity.S_Author;
import com.example.ashwani.entity.S_Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class AuthorDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addAuthor(S_Author s_author) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(s_author);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }finally {
            session.close();
        }

    }

    public S_Author getAuthorById(String id) {
        Session session = sessionFactory.getCurrentSession();
        S_Author s_author=session.get(S_Author.class,id);
        return s_author;
    }

    public void deleteAuther(String id) {
        Session session=sessionFactory.getCurrentSession();
        S_Author s_author=getAuthorById(id);
        try{
            session.delete(s_author);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void updateBook(S_Author s_author) {
        Session session=sessionFactory.getCurrentSession();
        session.update(s_author);
    }
}
