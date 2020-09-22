/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import helper.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Tran Y
 */
public class UserDAO {

    public int add(Users user) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.persist(user);
            trans.commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return -1;
        }
        return 1;
    }

    public int update(Users user) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.saveOrUpdate(user);
            trans.commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return -1;
        }
        return 1;

    }

    //delete key
    public int delete(String username) {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            Users user = (Users) session.get(Users.class, username);
            session.delete(user);
            trans.commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return -1;
        }
        return 1;

    }

    public Users findById(String username) {
        Users user = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            user = (Users) session.get(Users.class, username);
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
            return null;
        }
        return user;
    }

    public List<Users> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createCriteria(Users.class).list();
    }

    public List<Users> getAllById(String username) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        //from users từ class java ko phải lấy users từ database
        String hql="from Users where username like:username";
        Query query = session.createQuery(hql);
        query.setParameter("username", "%"+username+"%");
        return query.list();
        
    }
}
