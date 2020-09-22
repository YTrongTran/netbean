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
public class ProductsDAO {
     public int add(Products products) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.persist(products);
            trans.commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return -1;
        }
        return 1;
    }
         public int update(Products products) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.saveOrUpdate(products);
            trans.commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return -1;
        }
        return 1;

    }
         
         
    //delete key
    public int delete(String masp) {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            Products products = (Products) session.get(Products.class, masp);
            session.delete(products);
            trans.commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return -1;
        }
        return 1;

    }

    public Products findById(String masp) {
        Products products = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            products = (Products) session.get(Products.class, masp);
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
            return null;
        }
        return products;
    }

    public List<Products> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createCriteria(Products.class).list();
    }

    public List<Products> getAllById(String masp) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        String hql="from Products where masp like:masp";
        Query query = session.createQuery(hql);
        query.setParameter("masp", "%"+masp+"%");
        return query.list();
        
    }
}
