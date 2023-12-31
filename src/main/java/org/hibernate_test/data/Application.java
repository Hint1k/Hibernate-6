package org.hibernate_test.data;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate_test.data.entities.User;

public class Application {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User user1 = new User();
        User user2 = new User();
        user1.setUserId(3L);
        user2.setUserId(4L);
        user1.setFirst_name("C");
        user2.setFirst_name("D");
        user1.setBirthdate(new Date());
        user2.setBirthdate(new Date());
        user1.setLast_name("C");
        user2.setLast_name("D");
        user1.setCreateDate(new Date());
        user2.setCreateDate(new Date());
        user1.setCreatedBy("F");
        user2.setCreatedBy("F");
        user1.setLastUpdatedBy("F");
        user2.setLastUpdatedBy("F");
        user1.setLastUpdatedDate(new Date());
        user2.setLastUpdatedDate(new Date());

        session.merge(user1);
        session.merge(user2);
        session.getTransaction().commit();

        session.close();
    }
}
