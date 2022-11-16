package org.code_with_abdullah;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Alien alien = new Alien();
        alien.setAlienId(2);
        alien.setAlienName("Test");
        alien.setColor("temp-color");

        Configuration cfg = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();

        Transaction t = session.beginTransaction();

        session.save(alien);

        t.commit();
    }
}