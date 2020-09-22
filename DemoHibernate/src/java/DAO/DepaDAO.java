/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import helpers.HibernateUtil;
import models.Departs;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Tran Y
 */
public class DepaDAO {
    public int add(Departs de){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.persist(de);
            trans.commit();
        } catch (Exception e) {
            return -1;
        }
    return 1;
    }
}
